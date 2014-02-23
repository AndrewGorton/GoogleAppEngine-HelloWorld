package uk.co.devsoup.gae.helloworld;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Java class which outputs HTML to demo that the code works.
 */
public class Main extends HttpServlet implements Servlet {
    /**
     * Constructor.
     */
    public Main() {
        // Does nothing at present
    }

    /**
     * Handle GET requests.
     *
     * @param request  The incoming request object.
     * @param response The outgoing response to modify to incude our custom data.
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Hello from DevSoup</title></head>");
        out.println("<body>");
        out.println(String.format("<p><a href=\"http://www.devsoup.co.uk\">DevSoup</a>'s Java Servlet says hello @ %s.</p>", new java.util.Date()));
        out.println("<p>Source code available <a href=\"https://github.com/devsoup/GoogleAppEngine-HelloWorld/releases/tag/v1.1.0\">here</a>.</p>");
        out.println("</body>");
        out.println("</html>");
        out.close();
    }
}
