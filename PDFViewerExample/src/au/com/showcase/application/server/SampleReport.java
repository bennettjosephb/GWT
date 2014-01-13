package au.com.showcase.application.server;

import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

/**
 * Servlet implementation class SampleReport
 */
public class SampleReport extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SampleReport() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		Connection conn = null;
		JRExporter exporter = null;
		OutputStream ouputStream = response.getOutputStream();

		try {

			// this code deals with get the database configuration information
			// from the properties file which is under classes folder

			// connection configuration

			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost:3306/testing",
							"testing", "testing");

			// jasper file loading
			String path = getServletContext().getRealPath("/");

			path = path + "WEB-INF/classes/report.jasper";

			// code to deal with reports in various formats
			JasperPrint jasperPrint = null;

			HashMap<String, Object> data = new HashMap<String, Object>();

			System.out.println(data);
			System.out.println(conn);
			System.out.println(path);

			jasperPrint = JasperFillManager.fillReport(path, data, conn);


			response.setContentType("application/pdf");

//			response.setHeader("Content-Disposition",
//					"attachment;filename=file.pdf");

			exporter = new JRPdfExporter();

			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);

			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					ouputStream);

		}// try

		catch (SQLException | ClassNotFoundException e) {
			System.out
					.println("In Reports_VoucherRecharges.jsp:Connection not gotted: "
							+ e);

		}// catch
		catch (JRException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {

			exporter.exportReport();

		} catch (JRException e) {
			throw new ServletException(e);

		} finally {
			/* Added for the Audi Trail purpose */
			if (conn != null) {

				try {

					conn.close();

				} catch (SQLException e) {

					e.printStackTrace();

				}

			}
			if (ouputStream != null) {

				try {

					ouputStream.close();

				} catch (IOException ex) {

					ex.printStackTrace();

				}
			}
		}

		exporter = null;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
