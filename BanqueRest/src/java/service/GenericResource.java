/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import dal.Compte;
import javax.ejb.EJB;
import javax.json.Json;
import javax.json.JsonObject;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import outils.Utilitaire;
import session.CompteFacade;

/**
 * REST Web Service
 *
 * @author Epulapp
 */
@Path("generic")
public class GenericResource {

    @Context
    private UriInfo context;
    @EJB
    CompteFacade compteF;

    /**
     * Creates a new instance of GenericResource
     */
    public GenericResource() {
    }

    /**
     * Retrieves representation of an instance of service.GenericResource
     *
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        //TODO return proper representation object
        throw new UnsupportedOperationException();
    }

    /**
     * PUT method for updating or creating an instance of GenericResource
     *
     * @param content representation for the resource
     */
    @POST
    @Path("getCompte/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Compte debiterCompte(@PathParam("id") Integer id) throws Exception {
        return compteF.lire(id);
    }

    @POST
    @Path("modifierCompte")
    @Produces(MediaType.APPLICATION_JSON)
    public Response modifierCompte(Compte compte) throws Exception {
        Response response = null;
        try {
            if (compte != null) {
                compteF.modifier(compte);
                response = Response.status(Response.Status.OK).build();
            }
        } catch (Exception e) {
            JsonObject retour = Json.createObjectBuilder().add("message", Utilitaire.getExceptionCause(e)).build();
            response = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(retour).build();
        }
        return response;
    }

    @POST
    @Path("debiterCompte")
    @Produces(MediaType.APPLICATION_JSON)
    public Response debiterCompte(Compte compte, Integer montant) throws Exception {
        Response response = null;
        try {
            if (compte != null) {
                boolean result = compteF.provisionCompte(compte, montant);
                JsonObject retour = Json.createObjectBuilder().add("isDebite", result).build();
                response = Response.status(Response.Status.OK).entity(retour).build();
            }
        } catch (Exception e) {
            JsonObject retour = Json.createObjectBuilder().add("message", Utilitaire.getExceptionCause(e)).build();
            response = Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(retour).build();
        }
        return response;
    }
}
