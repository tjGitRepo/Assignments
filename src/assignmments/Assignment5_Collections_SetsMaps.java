package assignmments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collections_SetsMaps {

	public static void main(String[] args) {
		
		
		/**  Assignment
		 * Inside this Assignment Excel There are 3 TestCases with each Testcase having 3 rows of data. 

			Now, By using collections store all the data into one single variable .

			and from that variable,  Print the data  Supplier Name > Office Depot  from Product details table.
		 */
		
		//1. StudentDetails table
				
				/** Strategy :  1. Three LinkedHashMaps to store 3 rows of data in the form of key-value pairs in order 
				 * 					(Key -Column heading, Value -corresponding Cell value in each row)
				 * 				2. Once all cells are collected in form of maps , we will
				 * 				3. Input all these map items (Representing 1 row  into an ArrayList ) 
				 * 				4. Same steps we shall repeat for rest of the rows.
				 * 				 				
				*/
				
				System.out.println("========= 1. Storing StudentDetails table data ========== ");
				
				//Row1 -Mapping
				Map<String,String> s1map = new LinkedHashMap<String,String>();
				s1map.put("Name", "John Doe");
				s1map.put("Age", "Twenty Five");
				s1map.put("Gender", "Male");
				s1map.put("Roll Number", "SBA12346");
				s1map.put("Grade", "A++");
				s1map.put("Major", "Computer Science");
				s1map.put("GPA", "A3.9");
				s1map.put("Email", "Bob@example.com");
				s1map.put("PAN Number", "QWR6543212");
				s1map.put("Address", "123 Elm St");
				
				//System.out.println("\n"+"Row1 is: "+ s1map);
				
				//Row2 -Mapping
				Map<String,String> s2map = new LinkedHashMap<String,String>();
				s2map.put("Name", "Jane Smith");
				s2map.put("Age", "Twenty One");
				s2map.put("Gender", "Female");
				s2map.put("Roll Number", "SJA12416");
				s2map.put("Grade", "B");
				s2map.put("Major", "Computer Science");
				s2map.put("GPA", "C3.9");
				s2map.put("Email", "Jane@example.com");
				s2map.put("PAN Number", "YWR6543232");
				s2map.put("Address", "678 KLM St");
				
				//System.out.println("Row2 is: "+ s2map);
				
				//Row3 -Mapping
				Map<String,String> s3map = new LinkedHashMap<String,String>();
				s3map.put("Name", "Mike Brown");
				s3map.put("Age", "Twenty Two");
				s3map.put("Gender", "Male");
				s3map.put("Roll Number", "SBA22349");
				s3map.put("Grade", "B++");
				s3map.put("Major", "Computer Science");
				s3map.put("GPA", "A3.9");
				s3map.put("Email", "Mike@example.com");
				s3map.put("PAN Number", "AWR6543292");
				s3map.put("Address", "123 Khm St");
				
				//System.out.println("Row3 is: "+ s3map);
				
				//ArrayList to add above rows which were loaded in the form of 3 separate hashMap variables.
				
				List< Map<String, String> > s = new ArrayList<>();
				
					s.add(s1map);
					s.add(s2map);
					s.add(s3map);
				
				// Printing row wise using 
					//System.out.println("Row1 is : "+ s.get(0));
					//System.out.println("Row2 is : "+ s.get(1));
					//System.out.println("Row3 is : "+ s.get(2)+"\n");
					
						
		

		
		//2. EmployeeDetails table
		
				/** Strategy :  1. Three LinkedHashMaps to store 3 rows of data in the form of key-value pairs in order 
				 * 					(Key -Column heading, Value -corresponding Cell value in each row)
				 * 				2. Once all cells are collected in form of maps , we will
				 * 				3. Input all these map items (Representing 1 row  into an ArrayList ) 
				 * 				4. Same steps we shall repeat for rest of the rows.
				 * 				 				
				*/
				
				System.out.println("========= 2. Storing EmployeeDetails table data ========== ");
				
				//Row1 -Mapping
				Map<String,String> e1map = new LinkedHashMap<String,String>();
				e1map.put("Employee ID", "E001");
				e1map.put("Name", "Alice Green");
				e1map.put("Age", "Twenty Five");
				e1map.put("Gender", "Female");
				e1map.put("Department", "HR");
				e1map.put("Postion", "HR Manager");
				e1map.put("Salary", "78K Pounds");
				e1map.put("Email", "Bob@example.com");
				e1map.put("PAN Number", "QWR6543212");
				
				//System.out.println("\n"+"Row1 is: "+ e1map);
				
				//Row2 -Mapping
				Map<String,String> e2map = new LinkedHashMap<String,String>();
				e2map.put("Employee ID", "E002");
				e2map.put("Name", "Bob Johnson");
				e2map.put("Age", "Twenty Eight");
				e2map.put("Gender", "Female");
				e2map.put("Department", "Marketing");
				e2map.put("Postion", "Marketing Manager");
				e2map.put("Salary", "78K Pounds");
				e2map.put("Email", "Bob@example.com");
				e2map.put("PAN Number", "QWR6543212");
				
				//System.out.println("Row2 is: "+ e2map);
				
				//Row3 -Mapping
				Map<String,String> e3map = new LinkedHashMap<String,String>();
				e3map.put("Employee ID", "E003");
				e3map.put("Name", "Carol White");
				e3map.put("Age", "Twenty Eight");
				e3map.put("Gender", "Female");
				e3map.put("Department", "Sales");
				e3map.put("Postion", "Sales Executive");
				e3map.put("Salary", "65K Pounds");
				e3map.put("Email", "carol@example.com");
				e3map.put("PAN Number", "TYR6543212");
				
				//System.out.println("Row3 is: "+ e3map);
				
				//ArrayList to add above rows which were loaded in the form of 3 separate hashMap variables.
				
				List< Map<String, String> > e = new ArrayList<>();
				
					e.add(e1map);
					e.add(e2map);
					e.add(e3map);
				
				// Printing row wise using 
					//System.out.println("Row1 is : "+ e.get(0));
					//System.out.println("Row2 is : "+ e.get(1));
					//System.out.println("Row3 is : "+ e.get(2)+"\n");
				
					
				
		
		//3. Products table
		
				/** Strategy :  1. Three LinkedHashMaps to store 3 rows of data in the form of key-value pairs in order
				 * 					(Key -Column heading, Value -corresponding Cell value in each row)
				 * 				2. Once all cells are collected in form of maps , we will
				 * 				3. Input all these map items (Representing 1 row  into an ArrayList ) 
				 * 				4. Same steps we shall repeat for rest of the rows.
				 * 				 				
				*/
				
				System.out.println("========= 3. Storing Products table data ========== ");
				
				//Row1 -Mapping
				Map<String,String> p1map = new LinkedHashMap<String,String>();
				p1map.put("Product ID", "P001");
				p1map.put("Name", "Laptop");
				p1map.put("Category", "Electronics");
				p1map.put("Price", "12K Pounds");
				p1map.put("Stock Quantity", "Not Available");
				p1map.put("Supplier", "Tech Supplies");
				p1map.put("Warranty", "2 years");
				p1map.put("Rating", "4.5 Stars");
				p1map.put("Manufacturing Date", "Aug 2023");
				p1map.put("Expiry Date", "Aug 2028");
				
				//System.out.println("Row1 is: "+ p1map);
				
				//Row2 -Mapping
				Map<String,String> p2map = new LinkedHashMap<String,String>();
				p2map.put("Product ID", "P002");
				p2map.put("Name", "Desk Chair");
				p2map.put("Category", "Furniture");
				p2map.put("Price", "120K Pounds");
				p2map.put("Stock Quantity", "Two");
				p2map.put("Supplier", "Office Depot");
				p2map.put("Warranty", "1 years");
				p2map.put("Rating", "4 Stars");
				p2map.put("Manufacturing Date", "Sep 2024");
				p2map.put("Expiry Date", "N/A");
				
				//System.out.println("Row2 is: "+ p2map);
				
				//Row3 -Mapping
				Map<String,String> p3map = new LinkedHashMap<String,String>();
				p3map.put("Product ID", "P003");
				p3map.put("Name", "Coffee Maker");
				p3map.put("Category", "Kitchen");
				p3map.put("Price", "130K Pounds");
				p3map.put("Stock Quantity", "Two Hundred");
				p3map.put("Supplier", "KitchenWorld");
				p3map.put("Warranty", "6 Months");
				p3map.put("Rating", "4.2 Stars");
				p3map.put("Manufacturing Date", "Jan 2027");
				p3map.put("Expiry Date", "N/A");
				
				//System.out.println("Row3 is: "+ p3map);
				
				//ArrayList to add above rows which were loaded in the form of 3 separate hashMap variables.
				
				List< Map<String, String> > p = new ArrayList<>();
				
					p.add(p1map);
					p.add(p2map);
					p.add(p3map);
				
					// Our Desired Output cell present at > Row2 , F Column (ie..Key= Supplier) )
						//System.out.println("\n"+"Supplier name for Product#002 is : "+ p.get(1).get("Supplier"));	
				
					
				
		/**Now we have all three table data as 3 different ArrayLists
		 * 
		 * We will now store those 3 ArrayLists into single LinkedHashMap just to give them key names.
		 * So that in future we can call them just by remebering those Key names, (Excel tab names here)
		 *  
		 */
				Map < String, List<Map<String, String>> > excelTabName = new LinkedHashMap<> ();
		 
				excelTabName.put("StudentDetails", s);
				excelTabName.put("EmployeeDetails", e);
				excelTabName.put("ProductDetails", p);
				
				System.out.println("\n"+"All rows inside ProductDetails tab: "+excelTabName.get("ProductDetails"));
				System.out.println("\n"+"Supplier name for Product#002 is i.e.. in row#2 : "+excelTabName.get("ProductDetails").get(1).get("Supplier"));
				
					
	}

}
