import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;
import java.io.*;
import java.time.*;

@WebServlet("/test")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String a = request.getParameter("loka");
        int b = Integer.parseInt(request.getParameter("pocet"));
        String c;
        if(b==0){
        c="zadna zpicena ovecka";
        } else if (b==1){
        c="ovecka";
        }  else if (b<1 && b>5){
            c="ovecky";
        }  else {
            c="oveckek";
        }

        request.setAttribute("name", c);
        request.setAttribute("poc", b);




        ZoneId zone = ZoneId.of(a);
        ZonedDateTime now = ZonedDateTime.now(zone);

        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        request.getRequestDispatcher("/ovce.jsp").forward(request,response);
        out.println("<html>");
        out.println("<body>");
        out.println(a + " " + now);
        out.println("<p>");
        out.println(b + " " + c);
        out.println("</p>");
        out.println("</body></html>");
    }
}