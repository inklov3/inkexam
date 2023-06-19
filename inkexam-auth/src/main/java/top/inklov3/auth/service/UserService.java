package top.inklov3.auth.service;

import cn.dev33.satoken.stp.SaTokenInfo;
import top.inklov3.auth.domain.contant.VerifyType;
import top.inklov3.auth.domain.po.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * @author inklov3
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-06-18 14:43:02
 */
public interface UserService extends IService<User> {
    /**
     * 判断用户登陆类型
     *
     * @param identifier 接受的账号
     * @return VerifyType登陆类型枚举类
     */
    VerifyType getVerifyType(String identifier);


    /**
     * 用户传入参数合法性校验，无数据库操作
     *
     * @param identifier 账号
     * @param password   密码
     */
    void checkLegal(String identifier, String password);

    /**
     * @param user 用户账密对象
     * @return saTokenInfo token对象
     */
    SaTokenInfo doLogin(User user, VerifyType verifyType);
}
