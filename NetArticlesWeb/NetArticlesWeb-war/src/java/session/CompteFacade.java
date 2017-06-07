/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import client.ClientBanqueRest;
import client.ClientNetArticlesRest;
import dal.Compte;
import javax.ejb.*;
import javax.ws.rs.core.Response;

/**
 *
 * @author Epulapp
 */
@Stateless
@LocalBean
public class CompteFacade {

    private Compte compte;

    public Compte getCompte() {
        return this.compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }

    public Response debiterCompte(Compte compte) throws Exception {
        try {
            ClientBanqueRest clientBanqueRest = new ClientBanqueRest();
            Response response = clientBanqueRest.debiterCompte();
            return response;
        } catch (Exception e) {
            throw e;
        }
    }
}
