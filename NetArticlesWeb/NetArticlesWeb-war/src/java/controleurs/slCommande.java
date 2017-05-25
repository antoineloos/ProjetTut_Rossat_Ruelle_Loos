/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controleurs;

import dal.Article;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.ArticleFacade;

/**
 *
 * @author Epulapp
 */
public class slCommande extends HttpServlet {

    @EJB
    private ArticleFacade articleF;
    private String erreur;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String demande;
        String vueReponse = "/index.jsp";
        erreur = "";
        try {
            demande = getDemande(request);
            if (demande.equalsIgnoreCase("ajoutPanier.cde")) {
                vueReponse = ajouterPanier(request);
            } else if (demande.equalsIgnoreCase("supprimerPanier.cde")) {
                vueReponse = supprimerPanier(request);
            } else if (demande.equalsIgnoreCase("voirPanier.cde")) {
                vueReponse = voirPanier(request);
            } else if (demande.equalsIgnoreCase("listeAchats.cde")) {
                vueReponse = listeAchats(request);
            } else if (demande.equalsIgnoreCase("listeDomaines.cde")) {
                vueReponse = listeDomaines(request);
            } else if (demande.equalsIgnoreCase("validerPanier.cde")) {
                vueReponse = validerPanier(request);
            }

        } catch (Exception e) {
            erreur = e.getMessage();
        } finally {
            request.setAttribute("erreurR", erreur);
            request.setAttribute("pageR", vueReponse);
            RequestDispatcher dsp = request.getRequestDispatcher("/index.jsp");
            if (vueReponse.contains(".na")) {
                dsp = request.getRequestDispatcher(vueReponse);
            }
            dsp.forward(request, response);
        }
    }

    private String getDemande(HttpServletRequest request) {
        String demande = "";
        demande = request.getRequestURI();
        demande = demande.substring(demande.lastIndexOf("/") + 1);
        return demande;
    }

    private String ajouterPanier(HttpServletRequest request) throws Exception {
        try {

            String id = request.getParameter("id_article");
            Article art = articleF.lire(Integer.parseInt(id));
            request.setAttribute("articleR", art);
            HttpSession session = request.getSession(true);

            ArrayList<Article> pan = ((ArrayList<Article>) session.getAttribute("panier"));
            pan.add(art);
            request.setAttribute("montantTotalR", ComputeTotal(pan));
            request.setAttribute("lArticlesPanierR", session.getAttribute("panier"));

            return ("panier.jsp");
        } catch (Exception e) {
            throw e;
        }
    }

    private double ComputeTotal(ArrayList<Article> lst) {
        double res = 0.0;

        for (Article a : lst) {
            res += a.getPrix().doubleValue();
        }

        return res;
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private String listeDomaines(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String listeAchats(HttpServletRequest request) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private String voirPanier(HttpServletRequest request) {
        HttpSession session = request.getSession(true);

        ArrayList<Article> pan = ((ArrayList<Article>) session.getAttribute("panier"));
        request.setAttribute("montantTotalR", ComputeTotal(pan));
        request.setAttribute("lArticlesPanierR", session.getAttribute("panier"));

        return ("panier.jsp");
    }

    private String supprimerPanier(HttpServletRequest request) throws Exception {
        try {

            String id = request.getParameter("id_article");
            Article art = articleF.lire(Integer.parseInt(id));
            HttpSession session = request.getSession(true);

            ArrayList<Article> pan = ((ArrayList<Article>) session.getAttribute("panier"));
            
            pan.remove(art);
            //session.setAttribute("panier", pan);
            request.setAttribute("montantTotalR", ComputeTotal(pan));
            request.setAttribute("lArticlesPanierR", pan);

            return ("panier.jsp");
        } catch (Exception e) {
            throw e;
        }
    }

    private String validerPanier(HttpServletRequest request) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
