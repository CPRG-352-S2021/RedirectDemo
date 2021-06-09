
package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class CoolServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // load up the corresponding JSP
        getServletContext().getRequestDispatcher("/WEB-INF/coolForm.jsp").forward(request,response);
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String coolness = request.getParameter("coolness[]");
        
        if (coolness != null && coolness.equals("true")){
            // send the user to a new URL
            // relative URL
            response.sendRedirect("confirm");
            
        }
        else if ( coolness != null && coolness.equals("false") ){
            // Absolute URL to a entirely different website
            response.sendRedirect("https://www.youtube.com/watch?v=cjkCSl7IAmQ");
        }
        
    }

}
