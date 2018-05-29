


public class Account {
String cus_name = "S.N. Jayaweera";
int cus_acc_number = 2143216745;
double current_bal = 3000;

public void deposit(){

	current_bal = current_bal + 2000;
	System.out.println("Current balance after deposit:"+current_bal);

}

public void withDraw(){

    current_bal = current_bal - 2050;
    System.out.println ("Current balance after withdraw:"+current_bal);

}


    public static void main(String[] args) {
   Account acc = new Account();
       
           System.out.println ("Customerr name:"+acc.cus_name);
               System.out.println ("Customer account number:"+acc.cus_acc_number);
               acc.deposit();
               acc.withDraw();
    }
    
}
