package com.pipeline.entity;

public class FlowResult {

    private boolean status;

    private Integer code;

    private Object message;

    public FlowResult() {
    }


    public FlowResult(boolean status) {
        this.status = status;
    }

    public FlowResult(boolean status, String message) {
        this.status = status;
        this.message = message;
    }

    public FlowResult(boolean status, Integer code, Object message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public static FlowResult generateFalseFlowResult(Object data) {
        FlowResult flowResult = new FlowResult(false);
        flowResult.setMessage(data);
        return flowResult;
    }

    public static FlowResult generateTrueFlowResult() {
        return new FlowResult(true);
    }

    public static FlowResult generateTrueFlowResult(Object data) {
        FlowResult flowResult = new FlowResult(true);
        flowResult.setMessage(data);
        return flowResult;
    }

    public static FlowResult generateFalseFlowResult(Integer code, Object data) {
        FlowResult flowResult = new FlowResult(false);
        flowResult.setCode(code);
        flowResult.setMessage(data);
        return flowResult;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Object getMessage() {
        return message;
    }

    public void setMessage(Object message) {
        this.message = message;
    }
}
