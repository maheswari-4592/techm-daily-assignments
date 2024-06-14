<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>Simple Calculator</h2>
    <form method="post" action="calculator.jsp">
        <label for="num1"> Enter Number 1:</label>
        <input type="text" id="num1" name="num1" required><br><br>
        <label for="num2">Enter Number 2:</label>
        <input type="text" id="num2" name="num2" required><br><br>
        <label for="operation">Operation:</label>
        <select id="operation" name="operation" required>
            <option value="add">Addition</option>
            <option value="subtract">Subtraction</option>
            <option value="multiply">Multiplication</option>
            <option value="divide">Division</option>
        </select><br><br>
        <input type="submit" value="Calculate">
    </form>

    <%
        // Check if form parameters are present
        String num1Str = request.getParameter("num1");
        String num2Str = request.getParameter("num2");
        String operation = request.getParameter("operation");

        if (num1Str != null && num2Str != null && operation != null) {
            try {
                double num1 = Double.parseDouble(num1Str);
                double num2 = Double.parseDouble(num2Str);
                double result = 0;

                switch (operation) {
                    case "add":
                        result = num1 + num2;
                        break;
                    case "subtract":
                        result = num1 - num2;
                        break;
                    case "multiply":
                        result = num1 * num2;
                        break;
                    case "divide":
                        if (num2 != 0) {
                            result = num1 / num2;
                        } else {
                            out.println("<p style='color:red;'>Cannot divide by zero</p>");
                        }
                        break;
                }

                // Display the result
                out.println("<h3>Result: " + result + "</h3>");
            } catch (NumberFormatException e) {
                out.println("<p style='color:red;'>Please enter valid numbers</p>");
            }
        }
    %>
</body>
</html>