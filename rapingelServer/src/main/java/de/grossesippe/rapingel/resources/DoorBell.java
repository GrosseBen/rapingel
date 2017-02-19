package de.grossesippe.rapingel.resources;


import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/DoorBell")
@Produces(MediaType.TEXT_PLAIN)
public class DoorBell {

    final String text="pleas put for ringing";

    @PUT
    @Timed
    public void  ringing() {
        System.out.println("Ding Dong");
    }

    @GET
    @Timed
    public String getText() {
        return text;
    }
}