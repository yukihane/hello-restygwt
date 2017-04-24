package com.github.yukihane.gwt.hello_restygwt.client;

public class OrderConfirmation {

    private PizzaOrder order;

    private int total;

    public PizzaOrder getOrder() {
        return order;
    }

    public void setOrder(final PizzaOrder order) {
        this.order = order;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(final int total) {
        this.total = total;
    }

}
