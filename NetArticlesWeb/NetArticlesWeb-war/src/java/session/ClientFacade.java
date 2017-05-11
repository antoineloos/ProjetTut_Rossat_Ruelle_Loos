/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import client.ClientNetArticlesRest;
import dal.Client;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Epulapp
 */
@Stateless
@LocalBean
public class ClientFacade {

    private Client client;

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

       /**
     * Lecture de l'utilisateur sur son login Note : le login est unique
     * (contrainte de bd)
     *
     * @param login login de l'utilisateur à lire
     * @return un objet Client
     * @throws Exception
     */
    public Client lireLogin(String login) throws Exception {
        try {
            ClientNetArticlesRest clientNetArticlesRest = new ClientNetArticlesRest();
            return clientNetArticlesRest.getConnexion(Client.class, login);
        } catch (Exception e) {
            throw e;
        }
    }
    
    /**
     * Vérifie qu'un Client voulant s'authentifier a bien fournit le bon
     * login et le bon mot de passe
     *
     * @param login Login de l'Client
     * @param pwd Mot de passe de l'Client
     * @return True : si tout OK, False sinon
     * @throws Exception
     */
    public boolean connecter(String login, String pwd) throws Exception {
        boolean retour = false;
        try {
            this.client = lireLogin(login);
            if (pwd.equals(client.getPwdClient())) {
                retour = true;
            }
            return retour;
        } catch (Exception e) {
            throw e;
        }
    }
}
