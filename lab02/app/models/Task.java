package models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Constraints.Required;
import play.db.ebean.Model;

@Entity
public class Task extends Model implements Comparable<Task> {

	private static final long serialVersionUID = 1L;

	@Id
	public Long id;

	@Required
	public String projeto;
	@Required
	public String descricao;
	@Required
	public int prioridade;
	private boolean feita = false;

	public static Finder<Long, Task> find = new Finder<Long, Task>(Long.class,
			Task.class);

	public static List<Task> all() {
		return find.all();
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

	public void setFeita(boolean status) {
		this.feita = status;
	}

	public boolean isFeita() {
		return this.feita;
	}

	public Long getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String description) {
		this.descricao = description;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int priority) {
		this.prioridade = priority;
	}

	public String getProjeto() {
		return projeto;
	}

	public void setProjeto(String project) {
		this.projeto = project;
	}

	public static void updateStatus(Long id) {
		Task temp = find.ref(id);
		Task tempAdd = new Task();

		tempAdd.setFeita(true);
		tempAdd.setId(temp.getId());
		tempAdd.setDescricao(temp.getDescricao());
		tempAdd.setPrioridade(temp.getPrioridade());
		tempAdd.setProjeto(temp.getProjeto());
		temp.delete();
		tempAdd.save();
	}

	public static List<Task> selectToDoTasks() {
		List<Task> allTarefas = Task.all();
		List<Task> tarefasNFeitas = new ArrayList<Task>();
		for (Task t : allTarefas) {
			if (!(t.isFeita())) {
				tarefasNFeitas.add(t);
			}
		}
		return tarefasNFeitas;
	}

	public static List<Task> selectDoneTasks() {
		List<Task> allTasks = Task.all();
		List<Task> toDoTasks = new ArrayList<Task>();
		for (Task t : allTasks) {
			if (t.isFeita()) {
				toDoTasks.add(t);
			}
		}
		return toDoTasks;
	}
	@Override
	public int compareTo(Task task) {
		Task t = (Task) task;
		return this.getPrioridade() - t.getPrioridade();
	}

}
