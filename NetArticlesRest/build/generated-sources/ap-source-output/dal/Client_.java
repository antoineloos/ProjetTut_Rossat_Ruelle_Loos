package dal;

import dal.Achete;
import dal.Categorie;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T15:00:08")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-07T10:54:09")
>>>>>>> a4ce8c78cee0dbf2c83895cdf757f5bb0d1cbe28
@StaticMetamodel(Client.class)
public class Client_ { 

    public static volatile SingularAttribute<Client, Integer> idClient;
    public static volatile SingularAttribute<Client, Integer> credits;
    public static volatile CollectionAttribute<Client, Achete> acheteCollection;
    public static volatile SingularAttribute<Client, String> adresseClient;
    public static volatile SingularAttribute<Client, String> loginClient;
    public static volatile SingularAttribute<Client, Categorie> idCategorie;
    public static volatile SingularAttribute<Client, String> identiteClient;
    public static volatile SingularAttribute<Client, String> pwdClient;

}