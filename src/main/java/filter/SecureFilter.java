package filter;

import ent.Subscriber;
import views.View;
import views.ViewURL;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ResourceBundle;

/**
 * Created by Славик on 30.07.2016.
 */
@WebFilter( "/view/secure/*")
public class SecureFilter implements Filter {
    public void destroy() {
    }

    /**
     * This method checks session for containing administrator and let him access
     * else block access and redirect to ErrorPage.jsp
     * @param req is request
     * @param resp is response
     * @param chain is chain of filters
     * @throws ServletException
     * @throws IOException
     */
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        ResourceBundle bundle = (ResourceBundle) ((HttpServletRequest)req).getSession().getAttribute(View.BUNDLE);
        Subscriber sub =(Subscriber)((HttpServletRequest) req).getSession().getAttribute(View.SUBSCRIBER_SESSION);
        if (!sub.isAdmin()){
            req.setAttribute(View.ERROR_CAUSE, bundle.getString(View.CANT_DO_REQUEST));
            req.getRequestDispatcher(ViewURL.ERROR_PAGE).forward(req, resp);
        }else {
            chain.doFilter(req,resp);
        }

    }

    public void init(FilterConfig config) throws ServletException {

    }

}
