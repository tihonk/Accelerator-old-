package com.example.filters;

import com.example.dto.User;
import com.example.service.AuthenticationService;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/views/jsp/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException
    {
        // get request parameters for userID and password
        String userID = request.getParameter("email");
        String password = request.getParameter("password");

        AuthenticationService service = new AuthenticationService();
        User user = service.chekUser(userID, password);

        if (user != null)
        {
            HttpSession session = request.getSession(true);
            session.setAttribute("user",  user.getPassword());
            //setting session to expiry in 30 mins
            session.setMaxInactiveInterval(30 * 60);
            Cookie sessionId = new Cookie("user", user.getFirstName() );
            sessionId.setMaxAge(30 * 60);
            response.addCookie(sessionId);
            response.sendRedirect("../");

        }
        else
        {
            RequestDispatcher rd = getServletContext().getRequestDispatcher("/login");
            PrintWriter out = response.getWriter();
            out.println("<font color=red>Either user name or password is wrong.</font>");
            rd.include(request, response);
        }

    }
}