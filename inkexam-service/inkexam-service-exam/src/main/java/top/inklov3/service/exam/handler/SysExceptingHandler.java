package top.inklov3.service.exam.handler;

import top.inklov3.common.core.domain.Response;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

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
}
