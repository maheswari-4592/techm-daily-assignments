package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        int age = Integer.parseInt(request.getParameter("age"));
        String grade = request.getParameter("grade");

        // Create a new Student object
        StudentEntity student = new StudentEntity(name, age, grade);

        // Store the student object in the request
        request.setAttribute("student", student);

        // Forward the request to the JSP page to display student details
        request.getRequestDispatcher("StudentDisplay.jsp").forward(request, response);
    }
}
