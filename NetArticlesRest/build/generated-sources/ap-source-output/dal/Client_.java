package dal;

import dal.Achete;
import dal.Categorie;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T16:16:35")
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