import java.util.Date;

public class EmployeeDetailsServlet3 {
		private String id;
		private String name;
		private boolean gender;
		private Date dob;
		
		public EmployeeDetailsServlet3(String id, String name, boolean gender, Date dob) {
			super();
			this.id = id;
			this.name = name;
			this.gender = gender;
			this.dob = dob;
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
		
}
	