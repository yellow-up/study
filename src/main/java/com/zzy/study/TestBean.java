package com.zzy.study;

/**
 * Created by Fairyland on 2017/10/18.
 */
public class TestBean {
    private String code;
    private Boolean success;
    private Object data;
    private Integer num = -1;

    TestBean(){

    }

    TestBean(String code,Boolean success,Object data,Integer num){
        this.code = code;
        this.success = success;
        this.data = data;
        this.num = num;
    }

    TestBean(String code){
        this.code = code;
        this.success = false;
        this.data = null;
        this.num = -1;
    }

    TestBean(Boolean sucess){
        this.code = "";
        this.success = true;
        this.data = null;
        this.num = -1;
    }

    TestBean(int num){
        this.code = "";
        this.success = false;
        this.data = null;
        this.num = num;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "code='" + code + '\'' +
                ", success=" + success +
                ", data=" + data +
                ", num=" + num +
                '}';
    }
}
