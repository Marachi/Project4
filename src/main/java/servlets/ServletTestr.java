package servlets;

import model.TelService;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Potaychuk Sviatoslav on 11.07.2016.
 */
@WebServlet("/home")
public class ServletTestr extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String login = request.getParameter("login");
        String password = request.getParameter("password");
        try {
            request=TelService.getInstance().reRequest(request);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NamingException e) {
            e.printStackTrace();
        }
            RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
            dispatcher.forward(request,response);
        }







        //        TelService telService = new TelService();

//        if (number!=null){
//            try {
//                int a = Integer.valueOf(number);
//                if (a < model.getStart() || a > model.getEnd()){
//                    request.setAttribute(View.POSITION,View.KEEP_BORDER +"\n"+ View.INPUT_INT_DATA_BETWEEN+" "+model.getStart()+" "+model.getEnd());
//                }else {
//                    if (model.tryGuess(a)){
//                        request.setAttribute(View.POSITION, View.CONGRATULATION);
//                        request.setAttribute("log", View.LOG+model.log());
//                        RequestDispatcher dispatcher = request.getRequestDispatcher("/log.jsp");
//                        dispatcher.forward(request,response);
//                        this.init();
//                    }else {
//                        request.setAttribute(View.POSITION, View.INPUT_INT_DATA_BETWEEN + " " + model.getStart() + " " + model.getEnd());
//                    }
//                }
//            } catch (NumberFormatException e){
//                request.setAttribute(View.POSITION, View.WRONG_INPUT_INT_DATA +"\n"+View.INPUT_INT_DATA_BETWEEN + " " + model.getStart() + " " + model.getEnd());
//            }
//
//
//        }
//        DAO d = new DAO();
//        d.get
//        RequestDispatcher dispatcher = request.getRequestDispatcher("/home.jsp");
//        dispatcher.forward(request,response);
    }
