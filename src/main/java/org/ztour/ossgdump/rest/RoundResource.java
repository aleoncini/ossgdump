package org.ztour.ossgdump.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ztour.ossgdump.model.Round;

@Path("/rounds")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class RoundResource {
    
    @GET
    public List<Round> list() {
        return Round.listAll();
    }

}