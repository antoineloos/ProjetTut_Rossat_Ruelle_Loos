package dal;

import dal.Achete;
import dal.Domaine;
import dal.Redige;
import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T15:00:08")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T10:54:09")
>>>>>>> a4ce8c78cee0dbf2c83895cdf757f5bb0d1cbe28
@StaticMetamodel(Article.class)
public class Article_ { 

    public static volatile SingularAttribute<Article, String> resume;
    public static volatile SingularAttribute<Article, Domaine> idDomaine;
    public static volatile SingularAttribute<Article, String> fichier;
    public static volatile SingularAttribute<Article, Integer> idArticle;
    public static volatile SingularAttribute<Article, BigDecimal> prix;
    public static volatile CollectionAttribute<Article, Redige> redigeCollection;
    public static volatile CollectionAttribute<Article, Achete> acheteCollection;
    public static volatile SingularAttribute<Article, String> titre;
    public static volatile SingularAttribute<Article, Date> dateArticle;

}