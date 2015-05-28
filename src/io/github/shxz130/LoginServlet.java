package io.github.shxz130;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by shxz130 on 2015/5/28.
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String checkCode=request.getParameter("checkCode");
        String checkedCode=(String)request.getSession().getAttribute("checkCode");
        checkCode=checkCode.toUpperCase();
        if(checkCode.equals(checkedCode)){
            response.sendRedirect("/success.jsp");
        }else{
            response.sendRedirect("/index.jsp");
        }

    }
}
