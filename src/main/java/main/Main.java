package main;

import DB.DBtest;
import Documents.Document;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import servlets.AllRequestsServlet;

import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws Exception {

        AllRequestsServlet allRequestsServlet = new AllRequestsServlet();

        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(new ServletHolder(allRequestsServlet), "/*");



        Server server = new Server(8080);
        server.setHandler(context);

        DBtest db = new DBtest();
        db.printInfo();


        //System.out.println(db.isHere("admin"));

       // System.out.println("AUTH: "+ db.authControl("admin", "admin") );
   /*     System.out.println("DOCS");
        List docs = db.documents();
        for (int i=0; i<docs.size(); i++) System.out.println(docs.get(i));
*/


        server.start();
        server.join();
    }
}
