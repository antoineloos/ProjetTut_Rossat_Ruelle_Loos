package dal;

import dal.AchetePK;
import dal.Article;
import dal.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-12T15:54:07")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T16:16:35")
>>>>>>> 85eddcb430d420537d3c10eea5d7a0d08db06fab
@StaticMetamodel(Achete.class)
public class Achete_ { 

    public static volatile SingularAttribute<Achete, AchetePK> achetePK;
    public static volatile SingularAttribute<Achete, Date> dateAchat;
    public static volatile SingularAttribute<Achete, Client> client;
    public static volatile SingularAttribute<Achete, Article> article;

}