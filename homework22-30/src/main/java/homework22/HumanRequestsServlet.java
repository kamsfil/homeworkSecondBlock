/*
1. Создать servlet для вывода текущей даты и времени
2. Создать servlet для вывода номера дня недели по введённой дате
3. Создать servlet для вывода номера дня в году по введённой дате
 */
package homework22;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "TimeServlet", urlPatterns = {"/time"})
public class HumanRequestsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("<html>" +
                "<h1>Hello human!</h1>" +
                "<h2>What do you want to know ?</h2>" +
                "<h2>The current <a href=\"/time/DT\"> date and time </a></h2>" +
                "<h2>Number of the <a href=\"/time/DOTY\">day of the year</a> according to the entered date</h2>" +
                "<h2>Number of the <a href=\"/time/DOTW\">day in the week</a> according to the entered date</h2>" +
                "</html>");
    }
}
