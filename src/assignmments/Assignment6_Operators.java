package assignmments;

public class Assignment6_Operators {

	public static void main(String[] args) {
		
		String[] Student = {"Suresh","Mahesh","Naresh"};
		int [] Marks = {75, 80, 82};
			
			int NumToBeAdded = 10;
			int Consolidator = 0;
			 
				for (int i=0; i<Marks.length; i++) {
					
					Marks[i] += NumToBeAdded;
					Consolidator=Consolidator+Marks[i];
							
				}
			
		double Avg = (Consolidator/Marks.length);
		System.out.println("Updated Marks");
		System.out.println("Suresh: "+Marks[0]);
		System.out.println("Mahesh: "+Marks[1]);
		System.out.println("Naresh: "+Marks[2]);
		System.out.println("Average Marks: "+ Avg);
		

	}

}
