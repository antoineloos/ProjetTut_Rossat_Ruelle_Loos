package dal;

import dal.Client;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-27T15:55:45")
@StaticMetamodel(Categorie.class)
public class Categorie_ { 

    public static volatile SingularAttribute<Categorie, String> libcategorie;
    public static volatile SingularAttribute<Categorie, Integer> idCategorie;
    public static volatile CollectionAttribute<Categorie, Client> clientCollection;

}