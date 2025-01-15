package jsp.examples.bt3;

public interface EmployeeDAO {
	//this is add function
	public void addEmployee(Employee[] employees);
	public void showEmployee(Employee[] employees);
	public Employee sea12rchByName(String nameInput, Employee[] employees);
	public void updateEmployeeByName(String nameInput, Double newSalary, Employee[] employees);
}
