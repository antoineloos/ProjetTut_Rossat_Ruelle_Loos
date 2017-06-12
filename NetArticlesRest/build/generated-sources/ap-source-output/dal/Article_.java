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
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-12T15:54:07")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T16:16:35")
>>>>>>> 85eddcb430d420537d3c10eea5d7a0d08db06fab
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