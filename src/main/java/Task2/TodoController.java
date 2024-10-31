package Task2;

import Task2.Todo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/todo")
public class TodoController extends HttpServlet {
    private List<Todo> todos = new ArrayList<>();
    private int idCounter = 1;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("todos", todos);
        req.getRequestDispatcher("todo.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if ("add".equals(action)) {
            String description = req.getParameter("description");
            todos.add(new Todo(idCounter++, description));
        } else if ("delete".equals(action)) {
            int id = Integer.parseInt(req.getParameter("id"));
            todos.removeIf(todo -> todo.getId() == id);
        }
        resp.sendRedirect("todo");
    }
}
