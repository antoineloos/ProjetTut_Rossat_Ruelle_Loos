<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1 align='center'>Dernier article paru</h1>
<c:import url="detailArticle.jsp"/>
<div class="col-md-6 col-md-offset-6">
    <a  class="btn btn-primary pull-left" href="ajoutPanier.cde?id_article=${articleR.idArticle}"><span class="glyphicon glyphicon-log-in"></span> Acquérir cet article</a>
    &nbsp;
    <c:if test="${id_domaineR != null}">
        <a class="btn btn-primary pull-right" href="listeArticlesDomaine.cde?cbDomaines=${articleR.idDomaine.getIdDomaine()}"><span class="glyphicon glyphicon-list"></span> Retour liste</a>
    </c:if>

    <!-- <button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Open Modal</button>-->
    <button class="md-trigger" data-modal="modal-16">Blur</button>
    <div class="md-modal md-effect-1" id="modal-16">
        <div class="md-content">
            <h3>Modal Dialog</h3>
            <div>
                <p>This is a modal window. You can do the following things with it:</p>
                <ul>
                    <li><strong>Read:</strong> modal windows will probably tell you something important so don't forget to read what they say.</li>
                    <li><strong>Look:</strong> a modal window enjoys a certain kind of attention; just look at it and appreciate its presence.</li>
                    <li><strong>Close:</strong> click on the button below to close the modal.</li>
                </ul>
                <button class="md-close">Close me!</button>
            </div>
        </div>
    </div>
    <div class="md-overlay"></div>
    
</div>  





