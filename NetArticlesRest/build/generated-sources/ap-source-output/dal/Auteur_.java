package dal;

import dal.Droits;
import dal.Redige;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-12T15:54:07")
=======
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T16:16:35")
>>>>>>> 85eddcb430d420537d3c10eea5d7a0d08db06fab
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