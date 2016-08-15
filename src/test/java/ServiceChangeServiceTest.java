import command.Command;
import command.CommandList;
import command.ServiceBlockSubscriber;
import command.ServiceChangeService;
import dao.DAOException;
import dao.jdbc.JdbcDaoFactory;
import org.junit.Test;
import org.mockito.Mockito;
import services.ServService;
import services.SubService;
import views.View;
import views.ViewURL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.DriverManager;
import java.util.ResourceBundle;

import static org.junit.Assert.*;

/**
 * Created by Potaychuk Sviatoslav on 06.08.2016.
 */
public class ServiceChangeServiceTest extends Mockito{
    @Test
    public void execute() throws Exception {
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpSession session = mock(HttpSession.class);
        ServiceChangeService command = new ServiceChangeService();
        ServService service = mock(ServService.class);
        command.setServService(service);
        ResourceBundle bundle = ResourceBundle.getBundle(View.BUNDLE_NAME,View.localeUA);
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute(View.BUNDLE)).thenReturn(bundle);
        when(request.getParameter(View.ID_PAGE)).thenReturn("0");
        JdbcDaoFactory.setConnection(DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "root"));
        String test = command.execute(request,response);
        verify(request,atLeast(1)).getSession();
        verify(session,atLeast(1)).getAttribute(View.BUNDLE);
        verify(service,atLeast(1)).editService(Integer.valueOf(request.getParameter(View.ID_PAGE)));
        //servService.editService(Integer.valueOf(request.getParameter(View.ID_PAGE)));




        assertEquals(test, ViewURL.SERVICE_LIST_EDIT_JSP);

    }

}