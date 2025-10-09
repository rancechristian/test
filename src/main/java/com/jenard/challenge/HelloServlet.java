package com.jenard.challenge;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
    resp.getWriter().write("<html><head><title>Maven Challenge</title><link rel='stylesheet' href='style.css'></head><body><div class='container'><div class='icon'>🌟</div><h1>Jenard - Rance Maven challenge 2</h1><p>Welcome to your improved Java web app!</p><a class='btn' href='https://gitlab.com/'>View on GitLab</a></div></body></html>");
    }
}
