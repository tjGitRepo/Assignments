package assignmments;

public class Assignment3_ClassesAndObjects {
	
	

	public static void main(String[] args) {
		
		// Printing Out in following format "Employee Name: Bharath, Employee ID: 1234"
		
		EmpDetailsClass printt = new EmpDetailsClass();
		printt.PrintOutEmpDetails();
	
	}
	
	//Class1
	 static class EmpNameAndIdClass {
		
		//Names
		String Emp1 = "Bharath";
		String Emp2 = "Vijay";
	    String Emp3 = "Teja";
		
		//EmpIds
		 int Emp1_Id = 12126;
		 int Emp2_Id = 33199;
		 int Emp3_Id = 12452;
	}
	 
	 
	 
		
				//Class2
					 static class EmpDetailsClass extends EmpNameAndIdClass {
						 
						 //Array1 to read Emp.Names (via object)
						 
						 	EmpNameAndIdClass obj = new EmpNameAndIdClass();
							
						 	 String[] EmpNames = {obj.Emp1, obj.Emp2, obj.Emp3};
						
						//Array2 to read Emp.Ids  (via extend functionality)
							
						     int[] EmpIds = {Emp1_Id,Emp2_Id,Emp3_Id};
						    
							 public void PrintOutEmpDetails()
							 {
								
								String a1 = "Employee Name: "+EmpNames[0]+", "+"Employee ID: "+EmpIds[0] ;
								String a2 = "Employee Name: "+EmpNames[1]+", "+"Employee ID: "+EmpIds[1] ;
								String a3 = "Employee Name: "+EmpNames[2]+", "+"Employee ID: "+EmpIds[2] ;
								 
								System.out.println(a1);
								System.out.println(a2);
								System.out.println(a3);
								
							 }
 
				 }
				
}


