package satish;

	class EMP {

		  // Static variable to store the company name (common for all employees)
		  static String companyName = "ANUDEEPMNC";

		  public EMP(int eid, String ename) {
		    this.eid = eid;
		    this.ename = ename;
		  }

		  // Instance variables for employee id and name
		  int eid;
		  String ename;

		  // Static method to get the company name
		  public static String getCompanyName() {
		    return companyName;
		  }

		  // (Optional) You can add getter methods for eid and ename if needed
		}

		public class EmployeeMain {

		  public static void main(String[] args) {

		    // Create employee objects
		   EMP e1 = new EMP ( 50, "Marks");
		    EMP e2 = new EMP(250, "ramesh");

		    // Print employee details using static method to get company name
		    System.out.println("Employee 1 Details:");
		    System.out.println("ID: " + e1.eid);
		    System.out.println("Name: " + e1.ename);
		    System.out.println("Company: " + EMP.getCompanyName());

		    System.out.println("\nEmployee 2 Details:");
		    System.out.println("ID: " + e2.eid);
		    System.out.println("Name: " + e2.ename);
		    System.out.println("Company: " + EMP.getCompanyName());
		  }
		}

