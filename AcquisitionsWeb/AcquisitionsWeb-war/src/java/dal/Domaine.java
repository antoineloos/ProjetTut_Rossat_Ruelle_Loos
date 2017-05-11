/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.util.Collection;

/**
 *
 * @author Epulapp
 */
public class Domaine{

    private static final long serialVersionUID = 1L;
    private Integer idDomaine;
    private String libdomaine;
    private Collection<Article> articleCollection;

    public Domaine() {
    }

    public Domaine(Integer idDomaine) {
        this.idDomaine = idDomaine;
    }

    public Integer getIdDomaine() {
        return idDomaine;
    }

    public void setIdDomaine(Integer idDomaine) {
        this.idDomaine = idDomaine;
    }

    public String getLibdomaine() {
        return libdomaine;
    }

    public void setLibdomaine(String libdomaine) {
        this.libdomaine = libdomaine;
    }

    public Collection<Article> getArticleCollection() {
        return articleCollection;
    }

    public void setArticleCollection(Collection<Article> articleCollection) {
        this.articleCollection = articleCollection;
    }
}
