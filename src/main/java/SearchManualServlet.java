import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by compsci on 4/16/15.
 */
public class SearchManualServlet  extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        try {
            req.getRequestDispatcher("SearchManual.jsp").forward(req, resp);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    }
}
