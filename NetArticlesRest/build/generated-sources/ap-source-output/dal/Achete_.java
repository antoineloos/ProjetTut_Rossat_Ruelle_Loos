package dal;

import dal.AchetePK;
import dal.Article;
import dal.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T15:00:08")
@StaticMetamodel(Achete.class)
public class Achete_ { 

    public static volatile SingularAttribute<Achete, AchetePK> achetePK;
    public static volatile SingularAttribute<Achete, Date> dateAchat;
    public static volatile SingularAttribute<Achete, Client> client;
    public static volatile SingularAttribute<Achete, Article> article;

}