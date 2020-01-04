

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeDetailsServlet5
 */
@WebServlet("/EmployeeDetailsServlet5")
public class EmployeeDetailsServlet5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeDetailsServlet5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			boolean gender = Boolean.parseBoolean(request.getParameter("rdoGender"));
		String dob = request.getParameter("dob");
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date r = sdf.parse(dob);
		Boolean part = Boolean.parseBoolean(request.getParameter("chkBox"));
		String dept = request.getParameter("");
		Employee5 emp = new Employee5("969143","Priya",gender,r,part,dept);
		request.setAttribute("employee",emp);
		RequestDispatcher rd = request.getRequestDispatcher("EmployeeDetails.jsp");
		rd.forward(request, response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
