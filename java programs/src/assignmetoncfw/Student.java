package assignmetoncfw;

public class Student implements Comparable{
	
	private int stid;
	private String stname;
	private double stg;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	public String getStname() {
		return stname;
	}
	public void setStname(String stname) {
		this.stname = stname;
	}
	public double getStg() {
		return stg;
	}
	public void setStg(char stg) {
		this.stg = stg;
	}
	
	
	public Student(int stid, String stname, double stg) {
		super();
		this.stid = stid;
		this.stname = stname;
		this.stg = stg;
	}
	@Override
	public String toString()
	{
		return stg + " " + stid + " " +stname;
	}
	
	@Override
	public int compareTo(Object o) {
		
		Student s = (Student)o;
		return stid ;
		
	}

}
