package tech.iooo.coco.commons;

import java.util.Optional;
import java.util.function.Function;

import lombok.Data;

/**
 * @author 龙也
 * @date 2022/10/27 10:33 AM
 */
@Data
public class Result<T> {

    private boolean success;

    private String msg;

    private String code;

    private T data;

    public static <T> Result<T> of(T data) {
        Result<T> result = new Result<>();
        result.setSuccess(true);
        result.setMsg("success");
        result.setCode("success");
        result.setData(data);
        return result;
    }

    public static <T> Result<T> error(String code, String msg) {
        Result<T> result = new Result<>();
        result.setSuccess(false);
        result.setMsg(msg);
        result.setCode(code);
        return result;
    }

    public <R> Result<R> map(Function<T, R> converter) {
        return of(Optional.ofNullable(this.data).map(converter).orElse(null));
    }
}
