package utils;

import dal.Achete;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Resource;
import javax.jms.*;


public class Emetteur {

    @Resource(mappedName = "FabriqueArticles")
    private static ConnectionFactory fabriqueArticles;
    @Resource(mappedName = "Articles")
    private static Topic articles;
    private static TopicConnection connection = null;
    private static TopicSession session = null;
    private static TopicPublisher producteur = null;
    private static MapMessage mapMessage = null;

    public Emetteur() {
/*
        try {
            
        } catch (JMSException ex) {
            Logger.getLogger(Emetteur.class.getName()).log(Level.SEVERE, null, ex);
        }
       */
    }
    
    public void sendMessage(Achete achete){
        try {
            connection = (TopicConnection) fabriqueArticles.createConnection();
            session = connection.createTopicSession(false, 0);
            producteur = session.createPublisher(articles);
            mapMessage = session.createMapMessage();
            
            mapMessage.setObject("article", achete);
            producteur.publish(mapMessage);
            producteur.close();
        } catch (JMSException ex) {
            Logger.getLogger(Emetteur.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
