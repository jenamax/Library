package servlets;

import DB.DBtest;
import Users.User;
import templater.PageGenerator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class AllRequestsServlet extends HttpServlet {
    DBtest dbTest = new DBtest();
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws ServletException, IOException {

        Map<String, Object> pageVariables = createPageVariablesMap(request);
        pageVariables.put("login", "");

        response.getWriter().println(PageGenerator.instance().getPage("page.html", pageVariables));

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);

    }

    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws ServletException, IOException {
        Map<String, Object> pageVariables = createPageVariablesMap(request);

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        response.setContentType("text/html;charset=utf-8");

        if (login == null || password == null) {
            response.setContentType("text/html;charset=utf-8");
            response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            return;
        }
        pageVariables.put("login", login == null ? "" : login);
        pageVariables.put("password", password == null ? "" : password);
        response.getWriter().println(PageGenerator.instance().getPage("user_card.html", pageVariables));


    }

    private static Map<String, Object> createPageVariablesMap(HttpServletRequest request) {
        /**
         * вызов переменных из бд
         */
        DBtest dbTest = new DBtest();
        String login = request.getParameter("login");
        String password = request.getParameter("password");

            /*
            * вызов переменных из бд
            * */
        User userr;
        userr =dbTest.authControl(login, password);
     //   if (dbTest.authControl(login, password) != null) {
        userr = dbTest.authControl(login, password);
        Map<String, Object> pageVariables = new HashMap<>();

       // Object phoneUser = userr.phoneNumber;
        //pageVariables.put("id", phoneUser);

        pageVariables.put("URL", request.getRequestURL().toString());
        pageVariables.put("pathInfo", request.getPathInfo());
        pageVariables.put("sessionId", request.getSession().getId());
        pageVariables.put("parameters", request.getParameterMap().toString());
        return pageVariables; //}
   //    else {
         //   Map<String, Object> pageVariables = new HashMap<>();
           // return pageVariables;
      //  }
       /* } else {
            Map<String, Object> pageVariables = new HashMap<>();
            pageVariables.put("login", "incorrect");
            return pageVariables;
        }*/
    }
}
