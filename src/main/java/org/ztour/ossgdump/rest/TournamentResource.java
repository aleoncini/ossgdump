package org.ztour.gls.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.NotFoundException;

import org.ztour.ossgdump.model.Tournament;

@Path("/tournaments")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TournamentResource {
    
    @GET
    public List<Tournament> list() {
        return Tournament.listAll();
    }

}