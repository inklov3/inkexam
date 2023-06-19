package top.inklov3.auth.controller;

import cn.dev33.satoken.stp.SaTokenInfo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;
import top.inklov3.auth.domain.contant.VerifyType;
import top.inklov3.auth.domain.dto.UserDto;
import top.inklov3.auth.domain.po.User;
import top.inklov3.auth.exception.IllegalUserException;
import top.inklov3.auth.service.UserService;
import top.inklov3.auth.util.TransformMapper;
import top.inklov3.auth.service.RoleService;
import top.inklov3.common.core.domain.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
@Tag(name = "用户身份认证模块")
public class UserAuthenticateController {
    @Autowired
    RoleService roleService;

    @Autowired
    private UserService userService;

    /**
     * 登陆接口, 使用UserDto与前端交互
     * todo 实现分配登陆方式
     *
     * @param userDto 前端交互对象
     * @return 统一响应对象
     * @throws IllegalUserException 非法用户异常
     */
    @ResponseBody
    @Operation(summary = "用户登陆接口")
    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public Response<Object> login(@RequestBody UserDto userDto) throws IllegalUserException {
        userService.checkLegal(userDto.getIdentifier(), userDto.getPassword());
        User user = TransformMapper.INSTANT.toUser(userDto);
        //VerifyType verifyType = userService.getVerifyType(userDto.getIdentifier());
        // 限制帐号登陆
        VerifyType verifyType = VerifyType.USERID;
        SaTokenInfo saTokenInfo = userService.doLogin(user, verifyType);
        return Response.buildResponse(saTokenInfo, 210, "登录成功");
    }
}