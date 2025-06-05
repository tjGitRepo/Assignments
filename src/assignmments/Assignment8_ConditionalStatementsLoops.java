package assignmments;

import java.util.LinkedList;
import java.util.List;

public class Assignment8_ConditionalStatementsLoops {

	public static void main(String[] args) {
		
		List<Integer> txn = new LinkedList<> ();
		
		txn.add(50000);
		txn.add(-2000);
		txn.add(3000);
		txn.add(-15000);
		txn.add(-200);
		txn.add(-300);
		txn.add(4000);
		txn.add(-3000);
		
		//1 - No of Txns:
			
			//System.out.println("Total no of txns: "+txn.size());
			
			//Using for loop:
			int a= 0;
			for (int i=0; i<=txn.size(); i++) {
				a=i;
			}
			
			System.out.println("1. Total no of txns: "+a);
			
			
		//2 - Print the total amount credited and debited in account
			
			int negAmnt =0;
			int posAmnt =0;
			
				for (int x : txn) {
					
					if (x>1) {
						posAmnt = posAmnt + x;
					}
					
					if (x<1) {
						negAmnt = negAmnt + x;
					}
					
				}
			System.out.println("2.\n  a.Total amount credited = "+ posAmnt);
			System.out.println("  b.Total amount debited = "+ negAmnt);
			
		//3 Print total amount remaining at the end in Bank Account
			
			System.out.println("3. Total amount remaining = "+ (posAmnt+negAmnt));
			
		//4. Suspicious credit / debit	
			int Suspicion =0;
			
			System.out.println("4. \n a. Suspicious txns below (if any) ");
			for (int x : txn) {
				
				if (x>=10000 || x<=-10000 ) {
					
					System.out.println("    ~Suspicious credit/debit, Amount: "+ x);
					Suspicion = Suspicion+1;
					
				}
				
			}
			System.out.println(" b. Total No. of Suspicious Txns= "+Suspicion );

	
 }
}
			/**
			 * Assignment -8 (Conditional Statements & Loops)
			
			Bank Transactions
			Positive value refers Credit and Negative refers Debit Transaction
			Transactions Amount
				1		 50000
				2 		 -2000
				3		  3000
				4 		 -15000
				5 		 -200
				6 		 -300
				7		  4000
				8		 -3000
			First Store all the transactions in any data structure of Your Choice from collections, and by using
			Loops and conditional statements
			1. Print total number of credit and debit transactions completed
			2. Print the total amount credited and debited in account
			3. Print total amount remaining at the end in Bank Account
			4. If any transaction limit exceeds +/- 10000 then print the message “Suspicious credit/ debit
			Transaction with Amount” and also print total number of suspicious transactions
			 */