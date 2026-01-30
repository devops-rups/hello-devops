package com.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<head><title>Hello DevOps</title></head>");
        out.println("<body>");
        out.println("<h1>Hello DevOps! 🚀</h1>");
        out.println("<p>App deployed successfully on Tomcat 9</p>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}
