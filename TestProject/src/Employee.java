
public class Employee {
	
	private String name = "sunil";
	private int EmployeeID = 23238792;			
	private int phone = 974272164;
	private String emailAddress = "mahindra@test.com";	
	private String ofcAddress = "BVS";
	  private String resAddress = "marathahalli";
	
	public void setName(String santosh) {
		this.name = santosh;
	}
	  			public String getName() {
	  				
	  				return name;
	  			}
	  			
	  	public void setEmployee(int EmployeeID) {
	  		this.EmployeeID = 2323;
	  	}		
	  	
	  	public int getEmployee() {
	  		return EmployeeID;
	  	}
	  	
	  	public void setPhone(int phone) {
	  		this.phone = 9742;
	  	}
	  	public int getPhone() {
	  		return phone;
	  	}
	  	
	  	public void setEmailAddress(String test) {
	  		this.emailAddress = test;
	  	}
	  	public String getEmail() {
	  		return emailAddress;
	  	}
	  	
	  	public void setofcAddress(String bvsaa) {
	  		this.ofcAddress = bvsaa;
	  	}
	  	public String getOfc() {
	  		return ofcAddress;
	  	}
	  	
		public void setresAddress(String mahindra) {
	  		this.resAddress = mahindra;
	  	}
	  	public String getRes() {
	  		return resAddress;
	  	}
}
	  	
//DOUBT--- IF I AM PASSING STRING AS PARAMETER THEN, I AM ASSIGNING THE VALUE DIRECTLY, BUT IN CASE OF INTEGER, I NEED TO MENTION THE NEW VARIABLE NAME 
//  OR SOME OTHER VARIABLE NAME THAT WILL BE USED IN SETTER METHOD....WHY?

//FIRST WE HAD ASSIGNED THE VALUE AS PRIVATE
//THEN CREATED SETTER METHOD TO ASSIGN NEW NAME AS "SANTOSH" FOR VARIABLE "NAME"
//THAN CREATED GETTER METHOD TO FETCH THE NEW VALUE