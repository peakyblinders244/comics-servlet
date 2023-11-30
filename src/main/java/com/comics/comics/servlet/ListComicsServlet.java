package com.comics.comics.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Le-Hong-Quan
 * Date: 30/11/2023
 * Time: 22:15
 */
@WebServlet(name = "ListComicsServlet", urlPatterns = "/list-comics")
public class ListComicsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }
}
