package controllers;

import java.util.Collections;
import java.util.List;

import models.Task;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;


public class Application extends Controller {

	static Form<Task> taskForm = Form.form(Task.class);

	public static Result index() {
		return redirect(routes.Application.tasks());
	}

	public static Result tasks() {
		List<Task> doneTasks = Task.selectDoneTasks();
		List<Task> toDoTasks = Task.selectToDoTasks();
		Collections.sort(doneTasks);
		Collections.sort(toDoTasks);
		return ok(views.html.index.render(doneTasks, toDoTasks, taskForm));
	}

	public static Result newTask() {
		Form<Task> filledForm = taskForm.bindFromRequest();
		List<Task> toDoTasks = Task.selectToDoTasks();
        List<Task> doneTasks = Task.selectDoneTasks();
        Collections.sort(toDoTasks);
        Collections.sort(doneTasks);
		if (filledForm.hasErrors()) {
			return badRequest(views.html.index.render(toDoTasks, doneTasks , filledForm));
		} else {
			Task.create(filledForm.get());
			return redirect(routes.Application.tasks());
		}
	}

	public static Result deleteTask(Long id) {
		Task.delete(id);
		return redirect(routes.Application.tasks());
	}
	
	public static Result attTarefa(Long id) {
        Task.updateStatus(id);
        return redirect(routes.Application.tasks());
}

}
