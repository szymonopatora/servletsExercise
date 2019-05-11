package spatora;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

//@WebServlet("/")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        Cookie cookie = new Cookie("cookieName", "cookieValue");
        String name = req.getParameter("name");
        String lastName = req.getParameter("lastName");
        out.println("Hello World from Maven!" + name + " " + lastName);
        //resp.sendRedirect(req.getContextPath() + "/another");
        //getServletContext().getRequestDispatcher("/another").forward(req, resp);
        //getServletContext().getRequestDispatcher("/another").include(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.println("Hello World from Maven with doPost!");
    }
}
