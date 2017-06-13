package dal;

import dal.Achete;
import dal.Categorie;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-13T10:06:24")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-13T10:17:33")
>>>>>>> fdbcfb10c30fb31355d6ef916291afac8ebaa0ba
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