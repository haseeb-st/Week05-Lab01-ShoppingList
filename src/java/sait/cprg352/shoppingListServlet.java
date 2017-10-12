/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sait.cprg352;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 687159
 */
public class shoppingListServlet extends HttpServlet 
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String user = request.getParameter("user");
        
        HttpSession session=request.getSession();  
        session.setAttribute("uname",user);
        
        if(user == null)
        {
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        else if(user.isEmpty())
        {
            request.setAttribute("errorMessage", "Please enter your username.");
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
            return;
        }
        else
        {
            getServletContext().getRequestDispatcher("/WEB-INF/ShoppingList.jsp").forward(request, response);
            request.setAttribute("log", user);
            return;
        }
        
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        String item = request.getParameter("item");
        
        if(item == null)
        {
            getServletContext().getRequestDispatcher("/WEB-INF/ShoppingList.jsp").forward(request, response);
            return;
        }
        else if(item.isEmpty())
        {
            request.setAttribute("listMessage", "Please enter an Item you want to add.");
            getServletContext().getRequestDispatcher("/WEB-INF/ShoppingList.jsp").forward(request, response);
            return;
        }
        else if(item != null)
        {
            String[] itemArray = (String []) request.getAttribute("item");
            for(int i=0; i<itemArray.length; i++)
            {
                getServletContext().getRequestDispatcher("/WEB-INF/ShoppingList.jsp").forward(request, response);
                return;
            }
            HttpSession session=request.getSession(); 
            session.setAttribute("uitem", itemArray);
        }
        else
        {
            getServletContext().getRequestDispatcher("/WEB-INF/ShoppingList.jsp").forward(request, response);
            return;
        }
        
    }
}
