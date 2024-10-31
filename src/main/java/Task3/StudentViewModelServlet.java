package Task3;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;

@WebServlet("/students")
    public class StudentViewModelServlet extends HttpServlet {
        private StudentViewModel viewModel = new StudentViewModel();

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            resp.setContentType("application/json");
            resp.getWriter().write(new Gson().toJson(viewModel.getStudents()));
        }

        @Override
        protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            Student student = new Gson().fromJson(req.getReader(), Student.class);
            viewModel.addStudent(student.getName(), student.getAge(), student.getCourse());
            resp.setStatus(HttpServletResponse.SC_CREATED);
        }

        @Override
        protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
            Student student = new Gson().fromJson(req.getReader(), Student.class);
            viewModel.updateStudent(student.getId(), student.getName(), student.getAge(), student.getCourse());
            resp.setStatus(HttpServletResponse.SC_OK);
        }

    private class Gson {
        public int toJson(List<Student> students) {
            return 0;
        }

        public Student fromJson(BufferedReader reader, Class<Student> studentClass) {
            return null;
        }
    }
}

