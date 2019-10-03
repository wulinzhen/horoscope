package com.boc.common.exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
public class HoroScopeException extends RuntimeException {
    /**
     * 错误码
     */
    private Integer code;

    /**
     * 错误消息
     */
    private String msg;

    public HoroScopeException(Integer code){
        this.code = code;
    }

    public HoroScopeException(Integer code,String msg,Exception e){
        super(e);
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }


}
