package main;

import DB.DBtest;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;


public class Main {

    public static void main(String[] args) throws Exception {

        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(allRequestsServlet), "/*");



        Server server = new Server(8080);
        server.setHandler(context);

        DBtest db = new DBtest();
        db.printInfo();


        System.out.println(db.isHere("admin"));
        System.out.println("AUTH: "+ db.authControl("admin", "admin") );


        server.start();
        server.join();
    }
}
