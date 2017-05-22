/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package session;

import client.ClientNetArticlesRest;
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
public class ArticleFacade {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    private Article article;
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public List<Article> lister() throws Exception {

        List<Article> lArticles = new ArrayList<Article>();
        try {
            ClientNetArticlesRest clientNetArticlesRest = new ClientNetArticlesRest();
            lArticles = clientNetArticlesRest.getArticles();
            return lArticles;
        } catch (Exception e) {
            throw e;
        }
    }
    
    public Article lire(int id) throws Exception {
        try {
            ClientNetArticlesRest clientNetArticlesRest = new ClientNetArticlesRest();
            return clientNetArticlesRest.getArticle(Article.class, id);
        } catch (Exception e) {
            throw e;
        }
    }
}
