package com.synisys;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
    @Override
    public void init() throws ServletException{
        System.out.println("init");
    }
    @Override
    public void destroy(){
        System.out.println("destroy");
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out = resp.getWriter();
       out.println("<h1>Hello World</h1>");
       System.out.println("get");
    }
}
