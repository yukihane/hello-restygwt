package com.github.yukihane.gwt.hello_restygwt.client;

import javax.ws.rs.POST;

import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

import com.google.gwt.editor.client.Editor.Path;

public interface PizzaService extends RestService {
    @POST
    @Path("pizzaorders")
    public void order(PizzaOrder request, MethodCallback<OrderConfirmation> callback);
}