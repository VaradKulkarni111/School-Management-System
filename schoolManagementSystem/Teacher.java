package schoolManagementSystem;

/*
 * This class is reponsible for keeping track of teacher's
 * id, name and salary.
 */
public class Teacher {
	
	/*
	 * declaring teacher fields.
	 */
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;

	/**
	 * Creating a new Teacher object. 
	 * 
	 */
	public Teacher(int id, String name, int salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.salaryEarned=0;
	}
	
	/**
	 * @return return the currect id of teacher.
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * @return return the current name of teacher.
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @return return the current salary of teacher.
	 */
	public int getSalary() {
		return salary;
	}
	
	/**
	 * Set the salary.
	 * @param salary
	 */
	public void setSalary (int salary) {
		this.salary=salary;
	}
	
	public void receiveSalary (int salary) {
		salaryEarned+=salary;
		School.updateTotalMoneySpent(salary);
	}
	
	public String toString() {
		return "Name of the Teacher: "+ name
				+ " ,Total salary earned so far $"
				+ salaryEarned;
	}
	
	
	
	
	
	
	
	
	
	
	
}
