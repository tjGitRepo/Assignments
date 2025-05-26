package assignmments;

public class Assignment2_Arrays {

	public static void main(String[] args) {
		

		
//		String[] Semester = new String[6] ;
		//Or
//		String[] Sem = {"Sem1","Sem2","Sem3","Sem4","Sem5"};
		
		//For SEM1 
			//- Two 1D Arrays - one for all list of subjects and another for corresponding marks obtained against each subject
			String [] Sem1_Subjects = {"M1","Physics","Chemistry","CP","ED","Basic Electrical"};
			String [] Sem1_Marks = {"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(78)","Pass(79)"};
			String[][] Sem1_SubjectsAndMarks= {Sem1_Subjects, Sem1_Marks};
		
		//For SEM2 
			//- Two 1D Arrays - one for all list of subjects and another for corresponding marks obtained against each subject
			String [] Sem2_Subjects = {"M2","Mechanics","EnvironmentalSci.","Basic Electronics","Eng Physics","Eng Graphics"};
			String [] Sem2_Marks = {"Pass(82)","Pass(77)","Fail(93)","Fail(19)","Fail(24)","Pass(90)"};	
			String[][] Sem2_SubjectsAndMarks= {Sem2_Subjects, Sem2_Marks};
			
		//For SEM3 
			//- Two 1D Arrays- one for all list of subjects and another for corresponding marks obtained against each subject
			String [] Sem3_Subjects = {"Data Structures","Discrete Mathematics","Digital Electronics","Operating Systems","Signal and Systems","Object Oriented Prog."};
			String [] Sem3_Marks = {"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"};	
			String[][] Sem3_SubjectsAndMarks= {Sem3_Subjects, Sem3_Marks};
			
		// For SEM4 
			//- Two 1D Arrays - one for all list of subjects and another for corresponding marks obtained against each subject
			String[] Sem4_Subjects = {"Algorithms","Computer Networks","Database Systems","Microprocessors","Communication Eng.","Software Engineering"};
			String[] Sem4_Marks = {"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"} ;
			//- One 2D Array - for Representing both Marks and Subjects combined, for one Semester
			String[][] Sem4_SubjectsAndMarks = {Sem4_Subjects,Sem4_Marks};
			
		//For SEM5
			//- Two 1D Arrays - one for all list of subjects and another for corresponding marks obtained against each subject
			String[] Sem5_Subjects = {"Probability & Stats","Machine Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"};
			String[] Sem5_Marks = {"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"};
			//- One 2D Array - for Representing both Marks and Subjects combined, for one Semester
			String [][] Sem5_SubjectsAndMarks = {Sem5_Subjects,Sem5_Marks} ;
		
			
		
		//One 3D Array for Consolidated Subjects and Marks across Semesters
			
			String [][][] ConsolidatedMarks = {
												Sem1_SubjectsAndMarks,
												Sem2_SubjectsAndMarks,
												Sem3_SubjectsAndMarks,
												Sem4_SubjectsAndMarks,
												Sem5_SubjectsAndMarks
											  };
		
	
		// Printing out names of Subject #4 & #5 for Semester-2
			System.out.println("4th Subject Name in Semester#2 is : " + ConsolidatedMarks[1][0][3]);
			System.out.println("5th Subject Name in Semester#2 is : " + ConsolidatedMarks[1][0][4] + "\n");
			
			
		// Printing out Status/Marks for Subject #3 & #6 for Semester-4
			System.out.println("Status/Marks for 3rd Subject in Semester#4 is : " + ConsolidatedMarks[3][1][2]);
			System.out.println("Status/Marks for 6th Subject in Semester#4 is : " + ConsolidatedMarks[3][1][5]);
		
	}

}
