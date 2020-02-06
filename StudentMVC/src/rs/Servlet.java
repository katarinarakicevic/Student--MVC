package rs;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
public Servlet() {
        super();
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String ime = request.getParameter("ime");
	String prezime = request.getParameter("prezime");
	String prosek = request.getParameter("prosek");

if (ime!=null && ime.length()>0 &&
		prezime!=null && prezime.length()>0 &&
		prosek!=null && prosek.length()>0 ){
			
	try {
		float p = Float.parseFloat(prosek);
			
		Student s = new Student(ime,prezime,p);
		request.setAttribute("student", s);
		request.getRequestDispatcher("student.jsp").forward(request, response);
				
				
	} catch (Exception e) {
		request.setAttribute("msg", "Prosek mora biti broj");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}else{		
		request.setAttribute("msg", "Morate popuniti sva polja");
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
