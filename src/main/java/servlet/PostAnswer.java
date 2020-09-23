package servlet;

import Domain.Answers;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "MyServlet",
		urlPatterns = {"/postAnswer"}
)
public class PostAnswer extends HttpServlet {


	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String language = req.getParameter("language");

		Answers.putAnswer(language);

		int javaTotal = 0;
		int cSharpTotal = 0;
		int pythonTotal = 0;
		int cobolTotal = 0;
		double javaPercent = 0;
		double cSharpPercent = 0;
		double pythonPercent = 0;
		double cobolPercent = 0;
		int total = 0;

		try {
			total = Answers.getAnswers().get("total");
		} catch (NullPointerException e) {
			System.out.println("Falha ao carregar total");
		}

		try {
			javaTotal = Answers.getAnswers().get("java");
			javaPercent = (double) javaTotal / total * 100;
		} catch (Exception e) {
			System.out.println("Falha ao carregar total de java");
		}

		try {
			cSharpTotal = Answers.getAnswers().get("c#");
			cSharpPercent = (double) cSharpTotal / total * 100;
		} catch (NullPointerException e) {
			System.out.println("Falha ao carregar total de c#");
		}

		try {
			pythonTotal = Answers.getAnswers().get("python");
			pythonPercent = (double) pythonTotal / total * 100;
		} catch (NullPointerException e) {
			System.out.println("Falha ao carregar total de python");
		}

		try {
			cobolTotal = Answers.getAnswers().get("cobol");
			cobolPercent = (double) cobolTotal / total * 100;
		} catch (NullPointerException e) {
			System.out.println("Falha ao carregar total de cobol");
		}


		RequestDispatcher reqDispatcher = req.getRequestDispatcher("/ranking.jsp");

		req.setAttribute("Java", javaPercent);
		req.setAttribute("Python", pythonPercent);
		req.setAttribute("C#", cSharpPercent);
		req.setAttribute("Cobol", cobolPercent);

		reqDispatcher.forward(req, resp);
	}

}