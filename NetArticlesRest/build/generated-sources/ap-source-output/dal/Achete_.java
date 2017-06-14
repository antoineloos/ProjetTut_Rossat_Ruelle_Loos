package dal;

import dal.AchetePK;
import dal.Article;
import dal.Client;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-14T16:17:38")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-14T10:12:30")
>>>>>>> 10dac2f495b7a390c98d91b2d48bfa25f3d6f4e4
@StaticMetamodel(Achete.class)
public class Achete_ { 

    public static volatile SingularAttribute<Achete, AchetePK> achetePK;
    public static volatile SingularAttribute<Achete, Date> dateAchat;
    public static volatile SingularAttribute<Achete, Client> client;
    public static volatile SingularAttribute<Achete, Article> article;

}