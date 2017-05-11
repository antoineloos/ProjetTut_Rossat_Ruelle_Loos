/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;

/**
 *
 * @author Epulapp
 */
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer idArticle;
    private String titre;
    private String resume;
    private BigDecimal prix;
    private Date dateArticle;
    private String fichier;
    private Collection<Redige> redigeCollection;
    private Collection<Achete> acheteCollection;
    private Domaine idDomaine;

    public Article() {
    }

    public Article(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public Article(Integer idArticle, String fichier) {
        this.idArticle = idArticle;
        this.fichier = fichier;
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public BigDecimal getPrix() {
        return prix;
    }

    public void setPrix(BigDecimal prix) {
        this.prix = prix;
    }

    public Date getDateArticle() {
        return dateArticle;
    }

    public void setDateArticle(Date dateArticle) {
        this.dateArticle = dateArticle;
    }

    public String getFichier() {
        return fichier;
    }

    public void setFichier(String fichier) {
        this.fichier = fichier;
    }

    
    public Collection<Redige> getRedigeCollection() {
        return redigeCollection;
    }

    public void setRedigeCollection(Collection<Redige> redigeCollection) {
        this.redigeCollection = redigeCollection;
    }

    public Collection<Achete> getAcheteCollection() {
        return acheteCollection;
    }

    public void setAcheteCollection(Collection<Achete> acheteCollection) {
        this.acheteCollection = acheteCollection;
    }

    public Domaine getIdDomaine() {
        return idDomaine;
    }

    public void setIdDomaine(Domaine idDomaine) {
        this.idDomaine = idDomaine;
    }
}
