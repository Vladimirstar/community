package life.majiang.community.exception;

/**
 * 自定义异常
 *
 * @author zxh
 * @version 1.0
 * @date 2020/4/2 14:29
 */
public class CustomizeException extends RuntimeException {
    private Integer code;
    private String message;

    public CustomizeException(ICustomizeErrorCode errorCode) {
        this.code = errorCode.getCode();
        this.message = errorCode.getMessage();
    }

    @Override
    public String getMessage() {
        return message;
    }

    public Integer getCode() {
        return code;
    }
}
