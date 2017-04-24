package com.github.yukihane.gwt.hello_restygwt.client;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import org.fusesource.restygwt.client.MethodCallback;
import org.fusesource.restygwt.client.RestService;

@Path("/pizza")
public interface PizzaService extends RestService {
    @POST
    public void order(PizzaOrder request, MethodCallback<OrderConfirmation> callback);
}
