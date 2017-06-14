package dal;

import dal.Auteur;
import dal.DroitsPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

<<<<<<< HEAD
@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-13T10:06:24")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-13T10:17:33")
>>>>>>> fdbcfb10c30fb31355d6ef916291afac8ebaa0ba
@StaticMetamodel(Droits.class)
public class Droits_ { 

    public static volatile SingularAttribute<Droits, DroitsPK> droitsPK;
    public static volatile SingularAttribute<Droits, BigDecimal> montantsDroits;
    public static volatile SingularAttribute<Droits, Character> etatDroits;
    public static volatile SingularAttribute<Droits, Auteur> auteur;

}