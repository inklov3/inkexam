package top.inklov3.auth.service.impl;

import cn.dev33.satoken.stp.SaTokenInfo;
import cn.dev33.satoken.stp.StpUtil;
import cn.hutool.core.lang.Validator;
import com.baomidou.mybatisplus.extension.conditions.query.LambdaQueryChainWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.util.ObjectUtils;
import top.inklov3.auth.domain.contant.VerifyType;
import top.inklov3.auth.domain.po.User;
import top.inklov3.auth.exception.IllegalUserException;
import top.inklov3.auth.service.UserService;
import top.inklov3.auth.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
 * @author inklov3
 * @description 针对表【user(用户)】的数据库操作Service实现
 * @createDate 2023-06-18 14:43:02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
        implements UserService {
    @Override
    public VerifyType getVerifyType(String identifier) {
        if (Validator.isEmail(identifier))
            return VerifyType.EMAIL;
        if (Validator.isMobile(identifier))
            return VerifyType.PHONE;
        if (Validator.isGeneral(identifier, 10, 20))
            return VerifyType.USERID;
        throw new IllegalUserException();
    }

    @Override
    public void checkLegal(String identifier, String password) {
        if (Validator.isEmpty(identifier)
                && Validator.isGeneral(identifier, 6, 20))
            throw new IllegalUserException();
        // 判断密码是否是 英文字母、数字、下划线 最小 6 位 最大 18 位
        if (!(Validator.isNotEmpty(password)
                && Validator.isGeneral(password, 6, 18)))
            throw new IllegalUserException();
    }

    @Override
    public SaTokenInfo doLogin(User user, VerifyType verifyType) {
        LambdaQueryChainWrapper<User> userLoginQueryWrapper = this.lambdaQuery();
        User loginUser = null;
        switch (verifyType) {
            case USERID:
                userLoginQueryWrapper.eq(User::getId, user.getId());
                loginUser = userLoginQueryWrapper.one();
                break;
            default:
                throw new IllegalUserException();
        }
        if (ObjectUtils.isEmpty(loginUser))
            throw new IllegalUserException();
        StpUtil.login(loginUser.getId());
        return StpUtil.getTokenInfo();
    }
}




