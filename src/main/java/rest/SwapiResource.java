/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import entities.Person;
import facades.apiFacade;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import javax.persistence.EntityManagerFactory;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import utils.EMF_Creator;


/**
 *
 * @author jojus1101
 */
@Path("users")
public class SwapiResource {
    private static final EntityManagerFactory EMF = EMF_Creator.createEntityManagerFactory(EMF_Creator.DbSelector.DEV, EMF_Creator.Strategy.CREATE);
    private apiFacade api = new apiFacade();
    @Context
    private UriInfo context;

    @GET
    @Path("all")
    @Produces(MediaType.APPLICATION_JSON)
    public String getJsonPeopleList(@PathParam("index")int index) throws InterruptedException, ExecutionException, ProtocolException, IOException {
       
        return api.getUserData(index);
    }

}
