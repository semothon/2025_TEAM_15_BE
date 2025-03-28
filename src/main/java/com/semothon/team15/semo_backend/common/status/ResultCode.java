package com.semothon.team15.semo_backend.common.status;

public enum ResultCode {
    SUCCESS("정상 처리 되었습니다."),
    ERROR("에러가 발생했습니다.");

    private final String msg;

    ResultCode(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}