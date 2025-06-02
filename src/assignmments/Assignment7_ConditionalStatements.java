package assignmments;

public class Assignment7_ConditionalStatements {

	/**
	 * Problem Statement:
	 * A bank evaluates loan applicants based on the following criteria:
			1. Credit Score:
			o If the credit score is above 750, the loan is automatically approved.
			o If the credit score is between 650 and 750, additional checks are performed.
			o If the credit score is below 650, the loan is denied.
			
			2. Income:
			o For credit scores between 650 and 750, the customer’s income must be at least $50,000
			for the loan to be considered.
			
			3. Employment Status:
			o If the customer’s income is at least 50,000, the system checks whether the customer is
			employed.
			o If the customer is unemployed, the loan is denied.
			
			4. Debt-to-Income Ratio:
			o If the customer is employed, the system checks the debt-to-income (DTI) ratio.
			o If the DTI ratio is less than 40%, the loan is approved.
			o If the DTI ratio is 40% or greater, the loan is denied.
	 * @param args
	 */
	
	public static void main(String[] args) {
	
					Assignment7_ConditionalStatements obj = new Assignment7_ConditionalStatements();
					obj.ApplicationProcessing();
			}
	
	//Given
			String customerName = "John Doe";
			int creditScore = 720;
			double income = 35000.0;
			boolean isEmployed = false;
			double debtToIncomeRatio = 41.0;
	
	//Logic start
	public void ApplicationProcessing() 
	
		{
		

					if (creditScore>750 && debtToIncomeRatio <40 ) 
					{
						System.out.println("Credit score is >750 and debtToIncomeRatio <40");
						System.out.println("Loan Approved!");
						ApplicantDetails();
					}
								
					else if( creditScore >=650 && creditScore <=750 && debtToIncomeRatio <= 40 && income > 50000 ) 
					{
						
							System.out.println("Credit score in between 650-750, \n Hence additional checks being performed: Checking if income >= 50000 and Employment status is true");
									
								if (income >= 50000 && isEmployed ) 
								
											{
												ApplicantDetails();
												System.out.println("Loan Approved!");
												
											}
								else 	{
												
									System.err.println("Loan is Denied! Details below:");
											
												if (isEmployed == false) {
													System.err.println("Reason(s): Employment status is false for customer");
												}
										
												if (income < 50000) {
													System.err.println("Reason(s): Customer income is less than 50000");
										
												}
												ApplicantDetails();	
								            }
					}
					else if (creditScore < 650 ||isEmployed == false || debtToIncomeRatio >= 40 || income < 50000  )
					{
						
						System.err.println("Loan Denied!, ");
						
							if (creditScore < 650) {
								System.err.println("Reason(s): creditScore is less than 650");
							}
							
							if (isEmployed == false) {
								System.err.println("Reason(s): Employment status is false for customer");
							}
							if (debtToIncomeRatio >= 40) {
								System.err.println("Reason(s): debtToIncomeRatio is greater than 40%");
							}
							if (income < 50000) {
								System.err.println("Reason(s): Customer income is less than 50000");
							}
						ApplicantDetails();
						
					}
		
		

		}

	public void ApplicantDetails()
		{
		
		System.out.println("\n========== Application details below ==========\nYour creditScore is: " +creditScore+"\n"
				+"Your employment status is: " + isEmployed+"\n"
				+"Your debtToIncomeRatio is: " + debtToIncomeRatio+"%"+"\n"
				+"Your income is: " + income+"\n==========");
		
		}

	

	}


