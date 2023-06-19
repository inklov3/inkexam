package top.inklov3.auth.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import top.inklov3.auth.exception.IllegalUserException;
import top.inklov3.common.core.domain.Response;

import java.sql.SQLIntegrityConstraintViolationException;

@ControllerAdvice
public class SysExceptingHandler {

    /**
     * 在主键冲突时编写
     * @param e     翻译为 SQL完整性约束违反异常
     */
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = SQLIntegrityConstraintViolationException.class)
    public Response<String> handleException(SQLIntegrityConstraintViolationException e) {
        return Response.fail(e.getMessage());
    }

    /**
     * 非法用户异常：用户不存在、密码或账号格式异常、登陆密码错误
     * @param e     翻译为 SQL完整性约束违反异常
     */
    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(value = IllegalUserException.class)
    public Response<String> handleException(IllegalUserException e) {
        return Response.fail(e.getMessage());
    }
}
