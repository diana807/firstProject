import java.io.IOException;
import java.io.PrintWriter;

public class ForClients extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        PrintWriter pw = response.getWriter();


        pw.println("<html>");
        pw.println("<head> <meta charset = \"UTF-8\" > </head>");
        pw.println("<h1>Hello " + name + " </h1>");
        pw.println("</html>");
    }
}
