package com.employee_app.data.models;




public class Employee {
	 	
	 	private Integer id;
	    private String firstName;
	    private String lastname;
	    private String phoneNumber;
	    private String email;
	    private Department department;
		public Employee() {
			
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		public Department getDepartment() {
			return department;
		}
		public void setDepartment(Department department) {
			this.department = department;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", firstName=" + firstName + ", lastname=" + lastname + ", phoneNumber="
					+ phoneNumber + ", email=" + email + ", salary=" + salary + ", department=" + department + "]";
		}
		@Override
		public int hashCode() {
			return Objects.hash(department, email, firstName, id, lastname, phoneNumber, salary);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return department == other.department && Objects.equals(email, other.email)
					&& Objects.equals(firstName, other.firstName) && Objects.equals(id, other.id)
					&& Objects.equals(lastname, other.lastname) && Objects.equals(phoneNumber, other.phoneNumber)
					&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
		}
		
	    
	    
}
