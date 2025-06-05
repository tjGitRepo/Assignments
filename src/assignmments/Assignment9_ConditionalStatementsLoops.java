package assignmments;


import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assignment9_ConditionalStatementsLoops {

	public static void main(String[] args) {
		

	
		//Row1
		Map<String,String> row1= new LinkedHashMap<> (); 
		row1.put("Name", "AliceJohnson"); row1.put("Base Salary", "75000.0"); row1.put("Experience (Years)", "5.1");
		row1.put("EOY_Rating", "4.2"); 	
		//System.out.println(row1.get("Base Salary"));
		
		//Row2
		Map<String,String> row2 = new LinkedHashMap<> ();
		row2.put("Name","BobSmith"); row2.put("Base Salary", "68000.0"); row2.put("Experience (Years)", "3.2");
		row2.put("EOY_Rating", "3.8"); 
		//System.out.println(row2.get("Experience (Years)"));
		
		//Row3
		Map<String,String> row3 = new LinkedHashMap<> ();
		row3.put("Name", "CarolDavis");row3.put("Base Salary", "82000.0"); row3.put("Experience (Years)", "7.1");
		row3.put("EOY_Rating", "4.5"); 
		//System.out.println(row3.get("EOY_Rating"));
		
		//Row4
		Map<String,String> row4 = new LinkedHashMap<> ();
		row4.put("Name", "DavidBrown");row4.put("Base Salary", "90000.0"); row4.put("Experience (Years)", "10.2");
		row4.put("EOY_Rating", "2.5"); 
	
		//Row5
		Map<String,String> row5 = new LinkedHashMap<> ();
		row5.put("Name", "EvaGreen");row5.put("Base Salary", "60000.0"); row5.put("Experience (Years)", "2.4");
		row5.put("EOY_Rating", "3.5"); 
		
		// LinkedList for storing rows in form of Array
		
		List<Map<String,String>> table = new LinkedList<>();
		
		table.add(row1); table.add(row2); table.add(row3); table.add(row4); table.add(row5); 
		
		//System.out.println(table.get(0).get("Base Salary"));
		
		
		//Calculating Hike
		
		Map <String,Double> hikeMapWithRefToName = new LinkedHashMap<> ();
		for (int i=0;i<table.size();i++) 
		
		{
		
				double variblePayPercentage ;
				double HikePercentage=0;
				double bonus ;
				double rating=   Double.parseDouble( table.get(i).get("EOY_Rating") )   ;
				double experience = Double.parseDouble( table.get(i).get("Experience (Years)") )  ;
				double baseSalary = (Double.parseDouble( table.get(i).get("Base Salary") ));
				String empName=   table.get(i).get("Name");
				
				
				if (rating >= 4.0)
				
						{
							  variblePayPercentage = 15;
							  bonus = 1500;
							  double reward=0;
								  if (experience >5)
								  {
									reward = 5000;  
								  }
								  
				
							  double hike =  (baseSalary* (variblePayPercentage/100)) + bonus + reward  ;
							
							  HikePercentage = (hike/baseSalary)*100;
							  
						}
				
				if (rating >= 3 && rating <4 )
					
						{
							  variblePayPercentage = 10;
							  bonus = 1200;
							  double reward=0;
								  if (experience >5)
								  {
									reward = 5000;  
								  }
								  
							  double hike =  (baseSalary* (variblePayPercentage/100)) + bonus + reward  ;
							
							  HikePercentage = (hike/baseSalary)*100;
							  
						}
				
				
				if (rating < 3 )
					
						{
							  variblePayPercentage = 3;
							  bonus = 300;
							  double reward=0;
								  if (experience >5)
								  {
									reward = 5000;  
								  }
								  
							  double hike =  (baseSalary* (variblePayPercentage/100)) + bonus + reward  ;
							
							  HikePercentage = (hike/baseSalary)*100;
						  
						}
		
				
				System.out.println("Hike Percentage of "+empName +": "+ HikePercentage );
				
				//Consolidating Percentages against names as a map
				
				hikeMapWithRefToName.put(empName, HikePercentage);
				
				
		}
		 	
			System.out.println("====Consolidated Hike% of each individual====\n"+hikeMapWithRefToName);
		
		
	}

}




/**
 * Assignment -9 (Conditional Statements & Loops)

Employee Table
S.No Name 		Base Salary  Experience (Years)  Year-End Rating (Out of

1 Alice Johnson  	75000.0 	 5.1  					  4.2
2 Bob Smith			68000.0 	 3.2 					  3.8
3 Carol Davis		82000.0 	 7.1 					  4.5
4 David Brown		90000.0 	 10.2 					  2.5
5 Eva Green 		60000.0  	 2.4 					  3.5

Hike
Rating				 % of base Salary as variable pay	 Bonus
> =4.0						 15.0						 1500
>=3 && < 4					 10.0						 1200
< 3.0 						 3.0 						 300

Extra Perks
Employees with Experience >= 5 Years get extra Reward of 5000;

There are 5 Employee records. Now Calculate the Hike percentage of each Employee and store the
Values in Map with EmployeeName and HikePercentagevalue and Print them.

Ex: Map<String, Double> output ;

Hike = ( Base Salary * variable pay % ) + Bonus + Reward ;
Hike % = Hike / Base Salary .
 * 
 * 
 * 
 */ 
