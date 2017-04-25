package com.github.yukihane.gwt.hello_restygwt.server;

import com.github.yukihane.gwt.hello_restygwt.shared.MyResponse;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/my")
@Produces(MediaType.APPLICATION_JSON)
public class MyResource {

    private final List<MyResponse> responses;

    public MyResource() {
        responses = new ArrayList<>();
        responses.add(new MyResponse("text1"));
        responses.add(new MyResponse("text2", "text3"));
    }

    @GET
    @Path("{id}")
    public MyResponse find(@PathParam("id") final String id) {
        return responses.get(Integer.parseInt(id));
    }
}
