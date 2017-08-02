package myFirstWebProject.controller;

/**
 * Created by KGBkid on 24.07.2017.
 */


        //import com.sun.org.apache.bcel.internal.generic.GOTO;
        import java.io.IOException;
        import javax.servlet.ServletException;
        import javax.servlet.annotation.WebServlet;
        import javax.servlet.http.HttpServlet;
        import javax.servlet.http.HttpServletRequest;
        import javax.servlet.http.HttpServletResponse;
@WebServlet(name = "WebController", urlPatterns = {"/admin", "/registration", "/customers"})
public class WebController extends HttpServlet{

        protected void processRequest(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                response.setContentType("text/html;charset=UTF-8");
                String userPath=request.getServletPath();
                if ("/admin".equals(userPath)){
                        // TODO: обработка запроса статьи
                }else
                if ("/registration".equals(userPath)){
                        //TODO: обработка запроса регистрации
                }else
                if ("/customers".equals(userPath)){
                        //TODO: обработка запроса регистрации
                }

                request.getRequestDispatcher("/WEB-INF/views"+userPath+".jsp").forward(request, response);
        }

        /**
         * Handles the HTTP
         * <code>GET</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                processRequest(request, response);
        }

        /**
         * Handles the HTTP
         * <code>POST</code> method.
         *
         * @param request servlet request
         * @param response servlet response
         * @throws ServletException if a servlet-specific error occurs
         * @throws IOException if an I/O error occurs
         */
        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
                throws ServletException, IOException {
                processRequest(request, response);
        }

        /**
         * Returns a short description of the servlet.
         *
         * @return a String containing servlet description
         */
        @Override
        public String getServletInfo() {
                return "Short description";
        }// </editor-fold>
}
