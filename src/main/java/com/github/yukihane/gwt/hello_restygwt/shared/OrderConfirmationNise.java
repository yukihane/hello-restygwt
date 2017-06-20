/*
 * Created: 2017/06/20 dewa
 * Copyright (c) 2017, NS Solutions Corporation, All rights reserved.
 */

package com.github.yukihane.gwt.hello_restygwt.shared;

/**
 * @author dewa
 */
public class OrderConfirmationNise {

    private String text;
    private String text2;
    private int age;

    private int total;

    /**
     * @return the text
     */
    public String getText() {
        return text;
    }

    /**
     * @param text
     *            the text to set
     */
    public void setText(final String text) {
        this.text = text;
    }

    /**
     * @return the text2
     */
    public String getText2() {
        return text2;
    }

    /**
     * @param text2
     *            the text2 to set
     */
    public void setText2(final String text2) {
        this.text2 = text2;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age
     *            the age to set
     */
    public void setAge(final int age) {
        this.age = age;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total
     *            the total to set
     */
    public void setTotal(final int total) {
        this.total = total;
    }

}
