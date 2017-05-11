<%-- 
    Document   : listeCommandes
    Created on : 29 mars 2017, 14:42:56
    Author     : Epulapp
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<table class="table table-bordered table-striped">
    <thead>
        <!--TODO : MODOFIER PAR RAPPORT A LA TABLE ACHETE (Titre et date d'acquisition-->
        <tr>
            <td>Id</td>
            <td>Titre</td>
            <td>Prix</td>    
            <td>R�sum�</td>   
            <td>Panier</td>                     
        </tr>
    </thead>
    <tbody>
        <!--TODO : MODOFIER PAR RAPPORT A LA TABLE ACHETE (Titre et date d'acquisition-->
        <c:forEach var="articleE" items="${lArticlesR}">
            <tr>
                <td>${articleE.idArticle}</td>
                <td>${articleE.titre}</td>
                <td><fmt:formatNumber currencySymbol="&euro;" type="currency" value="${articleE.prix}"/></td>  
                <td><a href="voirArticle.na?id_article=${articleE.idArticle}">R�sum�</a></td>                                     
                <td><a href="ajoutPanier.cde?id_article=${articleE.idArticle}">Panier</a></td>                       
            </tr>
        </c:forEach>
    </tbody>
</table>           

