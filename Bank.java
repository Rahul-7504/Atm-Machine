import java.util.Scanner;
class Bank{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
  double balance=1000;
    String bankholdername;
    double money;
    int pin;
 System.out.println("Enter bankHolderName");
   bankholdername=sc.next();
  
 
   
   
    System.out.println("Enter Pin");
      pin=sc.nextInt();
   
     System.out.println("bankHolderName is: "+bankholdername);
    
     System.out.println("correct pin:"+pin);
int choise;
do{
   System.out.println("select option");
   System.out.println("1. Check balance");
   System.out.println("2. Deposit balance");
   System.out.println("3. Withdrawal");
   System.out.println("4. Exit");


  
   choise=sc.nextInt();
  
  
   switch(choise){
    case 1:
    System.out.println("balance is: "+balance);
   
    break;
    case 2:
    System.out.println("enter amount you want to deposit ");
     money=sc.nextFloat();
     balance +=money;
     System.out.println("Deposit sucessful");
     System.out.println("balance is: "+balance);
     break;
 case 3:
 System.out.println("enter amount for withdrawal");
 money=sc.nextFloat();
  balance -=money;
   System.out.println("Withdrawal successful");
   System.out.println("balance is: "+balance);
break;
case 4: System.out.println("Exiting....");
break;
default:System.out.println("Invalid choise!");

   }
}while(choise !=4);
}
}