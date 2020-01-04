import java.util.Date;

public class Employee5 {
	private String id;
	private String name;
	private boolean gender;
	private Date dob;
	private boolean partTime;
	private String dept;
	public Employee5(String id, String name, boolean gender, Date dob, boolean partTime, String dept) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.dob = dob;
		this.partTime = partTime;
		this.dept = dept;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public boolean isPartTime() {
		return partTime;
	}
	public void setPartTime(boolean partTime) {
		this.partTime = partTime;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
