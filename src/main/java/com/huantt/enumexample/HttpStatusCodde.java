package com.huantt.enumexample;

/**
 * @author huantt on 2019-05-29
 */
public enum HttpStatusCodde {

    OK(200, "Ok"),
    CREATED(201, "Created"),
    ACCEPTED(202, "Accepted");

    HttpStatusCodde(Integer code, String text) {
        this.code = code;
        this.text = text;
    }

    private Integer code;
    private String text;

    @Override
    public String toString() {
        return String.valueOf(this.getCode()) + ": " + this.getText();
    }

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
