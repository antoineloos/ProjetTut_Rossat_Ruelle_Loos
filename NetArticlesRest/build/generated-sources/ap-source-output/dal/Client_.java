package dal;

import dal.Achete;
import dal.Categorie;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-14T16:17:38")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-14T10:12:30")
>>>>>>> 10dac2f495b7a390c98d91b2d48bfa25f3d6f4e4
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