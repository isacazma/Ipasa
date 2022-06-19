package setup;


import model.*;
import persistence.PersistenceManager;
import reactor.core.scheduler.Schedulers;
import reactor.netty.http.HttpResources;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.io.IOException;
import java.time.Duration;

@WebListener
public class MyServletContextListener implements ServletContextListener {
    User p = new User("hoi","hoi","admin");




    @Override
    public void contextInitialized(ServletContextEvent sce) {
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
