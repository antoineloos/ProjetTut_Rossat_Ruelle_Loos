package dal;

import dal.Article;
import dal.Auteur;
import dal.RedigePK;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-13T10:06:24")
@StaticMetamodel(Redige.class)
public class Redige_ { 

    public static volatile SingularAttribute<Redige, RedigePK> redigePK;
    public static volatile SingularAttribute<Redige, Integer> part;
    public static volatile SingularAttribute<Redige, Article> article;
    public static volatile SingularAttribute<Redige, Auteur> auteur;

}