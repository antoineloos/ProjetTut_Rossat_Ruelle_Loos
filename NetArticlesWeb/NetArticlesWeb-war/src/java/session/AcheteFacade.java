/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import client.ClientNetArticlesRest;
import dal.Achete;
import dal.Article;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Epulapp
 */
@Stateless
@LocalBean
public class AcheteFacade {

   public List<Achete> getAcheteByCustomer(int id) throws Exception {

        List<Achete> lAchetes = new ArrayList<Achete>();
        try {
            ClientNetArticlesRest clientNetArticlesRest = new ClientNetArticlesRest();
            lAchetes = clientNetArticlesRest.getAchete(id);
            return lAchetes;
        } catch (Exception e) {
            throw e;
        }
    }
}
