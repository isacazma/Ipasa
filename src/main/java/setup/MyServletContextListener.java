package setup;

import Persistence.PersistenceManager;
import model.User;
import reactor.core.scheduler.Schedulers;
import reactor.netty.http.HttpResources;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import java.io.IOException;
import java.time.Duration;

import static model.User.onlineAllUsers;
import static model.User.onlineMedewerker;


@WebListener
public class MyServletContextListener implements ServletContextListener {
    User lid1 = new User("kees","a","lid");
    User lid2 = new User("henk","a","lid");
    User lid3 = new User("fred","a","medewerker");
    User a = new User("a","a", "lid");
    User b = new User("b","b", "manager");






    @Override
    public void contextInitialized(ServletContextEvent sce) {
        onlineAllUsers.add(lid1);
        onlineAllUsers.add(lid2);
        onlineMedewerker.add(lid3);


       try {
           PersistenceManager.loadWorldFromAzure();
       } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
       }
    }

   @Override
    public void contextDestroyed(ServletContextEvent sce) {
       try {
            PersistenceManager.saveWorldToAzure();
       } catch (IOException e) {
            e.printStackTrace();
        }

       Schedulers.shutdownNow();
        HttpResources.disposeLoopsAndConnectionsLater(Duration.ZERO, Duration.ZERO).block();
    }
}

