package homework22;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

@WebServlet(name = "DayOfTheYear", urlPatterns = {"/time/DOTY"})
public class DayOfTheYear extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<h1>Enter the date in the format: yyyy-MM-dd</h1>" +
                "<body>" +
                "<form action=\"/time/DOTY\" method=\"POST\">" +
                "<input type=\"text\" name=\"data\"><br>" +
                "<input type=\"submit\" value=\"Submit\"/>" +
                "</form>" +
                "</body>" +
                "</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        String data = request.getParameter("data");

        try {
            LocalDate date = LocalDate.parse(data);
            int dayOfYear = date.atStartOfDay().getDayOfYear();
            writer.println(String.format("<html><h1> %s day of the year !<h2></html>", dayOfYear));
        } catch (Exception ex) {
            writer.println(String.format("<html><h1>You entered an invalid date format !<h2></html>"));
        }
    }
}