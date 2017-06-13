package dal;

import dal.Article;
import dal.Auteur;
import dal.RedigePK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-13T10:06:24")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-13T10:17:33")
>>>>>>> fdbcfb10c30fb31355d6ef916291afac8ebaa0ba
@StaticMetamodel(Redige.class)
public class Redige_ { 

    public static volatile SingularAttribute<Redige, RedigePK> redigePK;
    public static volatile SingularAttribute<Redige, Integer> part;
    public static volatile SingularAttribute<Redige, Article> article;
    public static volatile SingularAttribute<Redige, Auteur> auteur;

}