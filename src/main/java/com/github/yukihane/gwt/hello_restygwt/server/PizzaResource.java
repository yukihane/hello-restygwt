package com.github.yukihane.gwt.hello_restygwt.server;

import com.github.yukihane.gwt.hello_restygwt.shared.OrderConfirmation;
import com.github.yukihane.gwt.hello_restygwt.shared.OrderConfirmationNise;
import com.github.yukihane.gwt.hello_restygwt.shared.Pizza;
import com.github.yukihane.gwt.hello_restygwt.shared.PizzaOrder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/pizza")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class PizzaResource {

    private final Map<String, Pizza> pizzas;

    public PizzaResource() {
        final Map<String, Pizza> map = new HashMap<>();

        map.put("amai-pizza", new Pizza("amai-pizza", 700));
        map.put("karai-pizza", new Pizza("karai-pizza", 1000));

        pizzas = Collections.unmodifiableMap(map);
    }

    @GET
    public Map<String, Pizza> getPizzaList() {
        return new HashMap<>(pizzas);
    }

    @GET
    @Path("{id}")
    public Pizza getPizza(@PathParam("id") final String id) {
        return pizzas.get(id);
    }

    @POST
    public OrderConfirmationNise order(final PizzaOrder order) {
        // final String id = order.getPizzaId();
        // final Pizza pizza = pizzas.get(id);
        // final int price = pizza.getPrice();
        // final int total = price * order.getNumber();
        //
        // final OrderConfirmation confirm = new OrderConfirmation();
        // confirm.setOrder(order);
        // confirm.setTotal(total);
        //
        // return confirm;

        final OrderConfirmationNise ret = new OrderConfirmationNise();
        ret.setText("hello");
        ret.setText2("world");
        ret.setAge(200);
        ret.setTotal(500);

        return ret;
    }

}
