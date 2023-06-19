package top.inklov3.gateway.config;

import cn.dev33.satoken.exception.NotLoginException;
import cn.dev33.satoken.reactor.filter.SaReactorFilter;
import cn.dev33.satoken.router.SaRouter;
import cn.dev33.satoken.stp.StpUtil;
import cn.dev33.satoken.util.SaResult;
import top.inklov3.common.core.domain.Response;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaTokenConfigure {
    @Bean
    public SaReactorFilter getSaReactorFilter() {
        return new SaReactorFilter().addInclude("/**") /*拦截地址*/
                .setAuth(obj -> {
                    SaRouter.match("/**", "/auth/doLogin", StpUtil::checkLogin);
                    SaRouter.match("/student/**", r -> StpUtil.checkRole("student"));
                    SaRouter.match("/teacher/**", r -> StpUtil.checkRole("teacher"));
                    SaRouter.match("/admin/**", r -> StpUtil.checkRole("admin"));
                }).setError(e -> {
                    if (e instanceof NotLoginException)
                        return SaResult.get(Response.NOT_LOGIN, "未登录", null);
                    return SaResult.error(e.getMessage());
                });
    }
}