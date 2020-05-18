package bankaccount;
import java.util.*;

public class BankAccount {
	int balance;
	int Previous_transection;
	String Customer_name;
	String Customer_id;
	
	BankAccount(String name,String id){
Customer_name=name;
		Customer_id=id;
		}
	void Deposit(int amount) {
		if(amount!=0) {
		balance=balance+amount;
		Previous_transection=amount;
		}
		}
	void withdrow(int amount) {
		if(amount<balance && amount!=0)
		{
			balance=balance-amount;
			Previous_transection=-amount;
		}
	}
	void get_Previous_transection()
	{
		if(Previous_transection>0) {
		System.out.println("deposite="+Previous_transection);
		}
		else if(Previous_transection<0)
		{
			System.out.println("withdraw="+Math.abs(Previous_transection));
		}
		else {
			System.out.println("no transection occured");
		}
	}
	void show_Menue(){
		char Option='0';
		Scanner scan=new Scanner(System.in);
		
		System.out.println("welcome  "+Customer_name);
		System.out.println("Customer_id  "+Customer_id);
		System.out.println();
		System.out.println("A. CheckBalance");
		System.out.println("B. Deposite");
		System.out.println("C. Withdrow");
		System.out.println("D. Previous Transection");
		System.out.println("E. Exit");
		
		do {
			System.out.println("***************");
			System.out.println("Enter an option");
			System.out.println("***************");
			Option=scan.next().charAt(0);
			System.out.println("***************");
			switch(Option)
			{
			case 'A':
				System.out.println("***************");
				System.out.println("Balance="+balance);
				System.out.println("***************");
				System.out.println("");
				break;
			case 'B':
				System.out.println("********************************");
				System.out.println("Enter an amount to deposite");
				System.out.println("*********************************");
				int amount=scan.nextInt();
				Deposit(amount);
				System.out.println("");
				break;
			case 'C':
				System.out.println("********************************");
				System.out.println("Enter an amount to withdow");
				System.out.println("*********************************");
				int Amount=scan.nextInt();
				withdrow(Amount);
				System.out.println("");
				break;
			case 'D':
				System.out.println("********************************");
				get_Previous_transection();
				System.out.println("*********************************");
				System.out.println("");
				break;
			case 'E':
				System.out.println("********************************");
				break;
				default:
					System.out.println("Invalid Option! please enter again");
					
			}
		}
			while(Option!='E');
			System.out.println("Thank you for using our services");	
			
		
			
			}
		
}

	
	

