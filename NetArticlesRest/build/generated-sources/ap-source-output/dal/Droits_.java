package dal;

import dal.Auteur;
import dal.DroitsPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.1.v20150605-rNA", date="2017-06-12T15:00:08")
@StaticMetamodel(Droits.class)
public class Droits_ { 

    public static volatile SingularAttribute<Droits, DroitsPK> droitsPK;
    public static volatile SingularAttribute<Droits, BigDecimal> montantsDroits;
    public static volatile SingularAttribute<Droits, Character> etatDroits;
    public static volatile SingularAttribute<Droits, Auteur> auteur;

}