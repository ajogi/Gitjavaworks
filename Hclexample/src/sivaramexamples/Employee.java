package sivaramexamples;

public class Employee implements Comparable {
	//all instance variable
	private int employeeId;
	private StringBuilder employeeName;
	private boolean employementStatus;
	private float employeeSalary;
	private String companyName;
	//default constructor
	Employee(){}
	
	
	//overload constructor
	public Employee(int employeeId, StringBuilder employeeName, boolean employementStatus,
			float employeeSalary, String companyName) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employementStatus = employementStatus;
		this.employeeSalary = employeeSalary;
		this.companyName = companyName;
	}
	public int getEmployeeId()
	{
		return employeeId;
	}


	public void setEmployeeId(int employeeId) {
		this.employeeId=employeeId;
	}
	public StringBuilder getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(StringBuilder employeeName) {
		this.employeeName = employeeName;
	}
	public boolean isEmployementStatus() {
		return employementStatus;
	}
	public void setEmployementStatus(boolean employementStatus) {
		this.employementStatus = employementStatus;
	}
	public float getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(float employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

    @Override
	public int compareTo(Object o) {
		Employee emp2=(Employee)o;
		return (int)(employeeId-emp2.employeeId);
	}
}
