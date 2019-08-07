package com.neu.his.common.response;

import lombok.Data;

@Data
public class CommonResponse {
    // 状态码 0:成功"
    private int code;
    // 消息
    private String message;
    // 返回数据
    private Object data;

    public CommonResponse(){

    }

    public static CommonResponse succuess(){
        CommonResponse restResponse = new CommonResponse();
        restResponse.setResultCode(ResultCode.SUCCESS);

        return restResponse;
    }

    public static CommonResponse succuess(Object data){
        CommonResponse restResponse = new CommonResponse();
        restResponse.setResultCode(ResultCode.SUCCESS);
        restResponse.setData(data);

        return restResponse;
    }

    public static CommonResponse fail() {
        CommonResponse restResponse = new CommonResponse();
        restResponse.setResultCode(ResultCode.FAIL);

        return restResponse;
    }


    public static CommonResponse fail(ResultCode resultCode) {
        CommonResponse restResponse = new CommonResponse();
        restResponse.setResultCode(resultCode);

        return restResponse;
    }

    public static CommonResponse fail(String message) {
        CommonResponse restResponse = new CommonResponse();
        restResponse.setCode(ResultCode.FAIL.code());
        restResponse.setMessage(message);

        return restResponse;
    }

    public static CommonResponse fail(Integer code, String message) {
        CommonResponse restResponse = new CommonResponse();
        restResponse.setCode(code);
        restResponse.setMessage(message);

        return restResponse;
    }

    public static CommonResponse fail(ResultCode resultCode, Object data) {
        CommonResponse restResponse = new CommonResponse();
        restResponse.setResultCode(resultCode);
        restResponse.setData(data);

        return restResponse;
    }

    private void setResultCode(ResultCode resultCode){
        this.code = resultCode.code();
        this.message = resultCode.message();
    }
}
