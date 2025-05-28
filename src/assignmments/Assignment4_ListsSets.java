package assignmments;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Assignment4_ListsSets {
	
	
	/**
	 * Assignment (Arrays & Collections)
		1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
			cities combined.
		2. Create a set of the top 10 most visited tourist attractions in the world and print out all
			of them and its size.
		3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
			6th Value.
		4. Create a list of the top 5 highest-grossing movies of all time and print out the third
			movie on the list.
	 * @param args
	 */
	 
	

	public static void main(String[] args) {
		
		//1. Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th cities combined.
		
				List<Integer> LargestCities = new ArrayList <> ();
				
												/** ======== NOTES =======
												 * 
												 * Collections will not allow primitive data types like "int","float"...etc. 
												 * Instead we need to use Wrapper classes for those respective primitive data types.
												 * Because collection framework cannot handle primitive data types directly, it can handle objectonly.
												 * And Thats why we need to use wrapper classes as below, which does the activity of convertiing primitive data type to resp object form.
												 * 
												 *  |	Primitive   |   Wrapper Class  |
												 * 
												 * 	 |  	byte    |   Byte     |
												 *   |	    short   |   Short    |
												 *   |	     int    |   Integer  |
												 *   |     	long    |   Long     |
												 *   |	    float   |   Float    |
												 *   |	    double  |   Double   |
												 *   |	    boolean |   Boolean  |
												 *   |	    float   |   Float    |
												 *   |	    char    |   Character|
												 */
				
				LargestCities.add(92981292);
				LargestCities.add(82178211);
				LargestCities.add(72981292);
				LargestCities.add(62178221);
				LargestCities.add(52981292);
			
				
				System.out.println("1. Combined area of 3rd and 4th Largest cities: "+LargestCities.get(2)+LargestCities.get(3)+"(in Sq Yds)"+"\n");
				
		
	//2. Create a set of the top 10 most visited tourist attractions in the world and print out all of them and its size.
		
				String[] top10Array = {
						"[Tajmahal ->5Cr Tourists]",
						"[RedFort ->4.9Cr Tourists]",
						"[Kashmir ->4.2Cr Tourists]",
						"[GwayOfIndia ->4Cr Tourists]",
						"[Ayodhya ->3.2Cr Tourists]",
						"[Goa ->2.5Cr Tourists]",
						"[Kerala ->1.5Cr Tourists]",
						"[Ooty ->1.1Cr Tourists]",
						"[Charminar ->1Cr Tourists]"
					} ;
				
				//Creating a HashSet Object
				Set<String[]> Top10TouristAttractions = new HashSet<> ();
				
				//adding our array to hashSet object
				Top10TouristAttractions.add(top10Array);
				
				//We cannot print out Array items directly from a hash set, hence we are using below advanced For loop.
				for (String[] Arrayitem: Top10TouristAttractions ) {
				
				System.out.println("2. Top 10 most visited tourist attractions : "+"\n   "+Arrays.toString(Arrayitem)+"\n   ");
				}
	
				
	//3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and 6th Value.
				
				int[] num = {1,2,3,4,12,16,7,8,9,10};
				
				int avgNum = (num[4]+num[5])/2 ;
				
				System.out.println("3. Avg of 5th value" +"("+num[4]+")"+ "and 6th Value"+"("+num[5]+")"+" is: "+avgNum+"\n");
						
	
	//4. Create a list of the top 5 highest-grossing movies of all time and print out the third movie on the list.
							
				
				List<String> var = new ArrayList<>();
				
				var.add("Bahubali2 -2000 Cr");
				var.add("Dangal -2000 Cr");
				var.add("Pushpa2 -1900 Cr");
				var.add("KGF2 -1200 Cr");
				var.add("RRR -1100 Cr");
				
				System.out.println("4. 3rd highest-grossing movies of all time: "+var.get(2));

	}

	
	
}
