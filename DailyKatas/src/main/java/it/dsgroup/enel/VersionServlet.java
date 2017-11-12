package it.dsgroup.enel;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Map.Entry;
import java.util.jar.Manifest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author quentin
 */
@WebServlet(name = "VersionServlet", urlPatterns = { "/version" })
public class VersionServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private final transient org.apache.log4j.Logger logger = org.apache.log4j.Logger.getLogger(VersionServlet.class);

	/**
	 * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
	 * methods.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) {
		response.setContentType("text/html;charset=UTF-8");
		try (PrintWriter out = response.getWriter()) {
			/* TODO output your page here. You may use following sample code. */
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Servlet VersionServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>Servlet VersionServlet at " + request.getContextPath() + "</h1>");

			try {
				// logger.info("getServletContext().getResourcePaths(\"/META-INF/\")=" +
				// getServletContext().getResourcePaths("/META-INF/"));

				try (InputStream resourceAsStream = getServletContext().getResourceAsStream("/META-INF/MANIFEST.MF")) {
					//Assert.assertNotNull("expected notNull resourceAsStream", resourceAsStream);
					if(resourceAsStream == null)
						throw new Exception("expected notNull resourceAsStream");
					final Manifest manifest = new Manifest(resourceAsStream);

					out.println("<table border='1'><tr><th>property</th><th>value</th></tr>");
					for (Entry<Object, Object> propertyEntry0 : manifest.getMainAttributes().entrySet()) {
						out.println("<tr><td>" + propertyEntry0.getKey() + "</td><td>" + propertyEntry0.getValue()
								+ "</td></tr>");
					}
					out.println("</table>");

				}

			} catch (Exception ex) {
				out.println("<h1>exception reading manifest:" + ex.toString() + "</h1>");
				logger.warn("skipping exception reading manifest", ex);
			}

			out.println("</body>");
			out.println("</html>");
		} catch (IOException ex) {
			logger.error("IOException ex  ", ex);
		}
	}

	// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the
	// + sign on the left to edit the code.">
	/**
	 * Handles the HTTP <code>GET</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) {
		processRequest(request, response);
	}

	/**
	 * Handles the HTTP <code>POST</code> method.
	 *
	 * @param request
	 *            servlet request
	 * @param response
	 *            servlet response
	 * @throws ServletException
	 *             if a servlet-specific error occurs
	 * @throws IOException
	 *             if an I/O error occurs
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) {
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