package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/VisitorCounterServlet")
public class CounterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static int visitCount = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Increment the visit count
        visitCount++;

        // Set the visit count as a request attribute
        request.setAttribute("visitCount", visitCount);

        // Forward to the JSP page to display the visit count
        request.getRequestDispatcher("count.jsp").forward(request, response);
    }
}
