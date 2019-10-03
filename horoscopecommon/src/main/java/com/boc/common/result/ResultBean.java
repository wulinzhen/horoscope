package com.boc.common.result;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.annotate.JsonIgnoreProperties;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@ApiModel(value = "返回结构体")
public class ResultBean<T> implements Serializable {
    /**
     * 响应码
     */
    @ApiModelProperty(value = "响应码")
    private Integer code = 0;
    /**
     * 消息
     */
    @ApiModelProperty(value = "消息")
    private String message = "请求成功";
    /**
     * 响应数据
     */
    @ApiModelProperty(value = "响应数据")
    private T data;
}
