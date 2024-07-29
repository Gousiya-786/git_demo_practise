
public class Employee {
    
	private String empname;
	private int empid;
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		if(empname!=null && !empname.trim().isEmpty())
		{	
		this.empname = empname;
		}
		else
		{
			System.out.println("Name is invalid");
		}
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		if(empid>0 && empid<=1000)
		{
		this.empid = empid;
		}
		else 
		{
			System.out.println("emp id is invalid");
		}
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.setEmpname("Hari krishna");
		emp.setEmpid(23);
		
		System.out.println("The Employee name is :"+emp.getEmpname());
		System.out.println("The Employee id is :"+emp.getEmpid());
		
	}
	
	
	
	
}
