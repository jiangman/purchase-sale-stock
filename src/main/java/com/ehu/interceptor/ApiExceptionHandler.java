package com.ehu.interceptor;

import com.ehu.bean.Response;
import com.ehu.constants.ErrorMessageConstants;
import com.ehu.constants.SystemConstants;
import com.ehu.exceptions.BusinessErrorException;
import com.ehu.exceptions.LoginValidationException;
import com.ehu.util.StringUtils;
import org.springframework.beans.TypeMismatchException;
import org.springframework.core.MethodParameter;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Date;


/**
 * 全局异常处理
 *
 * @author demon
 */
@ControllerAdvice
public class ApiExceptionHandler implements ResponseBodyAdvice<Object> {

    /**
     * Token验证异常处理
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(LoginValidationException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleTokenValidationException(LoginValidationException ex) {
        ex.printStackTrace();
        return new Response(HttpStatus.BAD_REQUEST.value(), ex.getMessage(), null, new Date());
    }

    /**
     * 业务异常处理
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(BusinessErrorException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleBusinessErrorException(BusinessErrorException ex) {
        ex.printStackTrace();
        return new Response(Integer.parseInt(ex.getCode()), ex.getMessage(), null, new Date());
    }

    /**
     * 参数类型不匹配
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(TypeMismatchException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleTypeMismatchException(TypeMismatchException ex) {
        ex.printStackTrace();
        return new Response(HttpStatus.BAD_REQUEST.value(), ErrorMessageConstants.BAD_REQUEST, null, new Date());
    }

    /**
     * 参数不符合要求
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleMethodArgumentNotValidException(
            MethodArgumentNotValidException ex) {
        ex.printStackTrace();
        BindingResult bindingResult = ex.getBindingResult();
        StringBuffer errorMesssage = new StringBuffer();
        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            errorMesssage.append(fieldError.getDefaultMessage() + "<br>");
        }
        return new Response(HttpStatus.BAD_REQUEST.value(), errorMesssage.toString(), null, new Date());
    }

    /**
     * 请求的格式错误
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    @ResponseBody
    public Response handleHttpMessageNotReadableException(
            HttpMessageNotReadableException ex) {
        ex.printStackTrace();
        return new Response(HttpStatus.BAD_REQUEST.value(), ErrorMessageConstants.BAD_REQUEST, null, new Date());
    }

    /**
     * 运行时异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Response handleIllegalArgumentsException(IllegalArgumentException ex) {
        ex.printStackTrace();
        return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), ErrorMessageConstants.INTERNAL_SERVER_ERROR, null, new Date());
    }

    /**
     * 运行时异常
     *
     * @param ex
     * @return
     */
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
    @ResponseBody
    public Response handleUnexpectedServerError(RuntimeException ex) {
        ex.printStackTrace();
        return new Response(HttpStatus.INTERNAL_SERVER_ERROR.value(), ErrorMessageConstants.INTERNAL_SERVER_ERROR, null, new Date());
    }

    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        return true;
    }

    @Override
    public Object beforeBodyWrite(Object o, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        if (!StringUtils.contains(serverHttpRequest.getURI().getPath(), SystemConstants.SWAGGER_URLS)) {
            if (o instanceof Response) {
                return o;
            } else {
                Response response = new Response();
                response.setData(o);
                return response;
            }
        }
        return o;
    }
}
