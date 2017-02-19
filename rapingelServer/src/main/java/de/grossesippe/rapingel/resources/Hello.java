package de.grossesippe.rapingel.resources;


import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
@Produces(MediaType.TEXT_PLAIN)
public class Hello {

    @GET
    @Timed
    public String sayHello() {
        final String hello = "Hello Raspingel";
        return hello;

    }
}