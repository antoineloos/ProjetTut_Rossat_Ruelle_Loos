package dal;

import dal.Droits;
import dal.Redige;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-14T16:17:38")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-14T10:12:30")
>>>>>>> 10dac2f495b7a390c98d91b2d48bfa25f3d6f4e4
@StaticMetamodel(Auteur.class)
public class Auteur_ { 

    public static volatile SingularAttribute<Auteur, Integer> idAuteur;
    public static volatile SingularAttribute<Auteur, String> pwdAuteur;
    public static volatile SingularAttribute<Auteur, String> identiteAuteur;
    public static volatile CollectionAttribute<Auteur, Redige> redigeCollection;
    public static volatile SingularAttribute<Auteur, String> adresseAuteur;
    public static volatile SingularAttribute<Auteur, String> loginAuteur;
    public static volatile CollectionAttribute<Auteur, Droits> droitsCollection;

}