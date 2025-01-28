import java.util.Scanner; 
public class Atm {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println("welcome to SBI bank");
        System.out.println("enter the pin");
        int pin=sc.nextInt();
        Account a=new Account();
        if(a.PIN==pin){
            while (true) { 
            System.out.println("your choice:\n"+"1.bank balance\n"+"2.cash withdrawal\n"+"3.pin change");
            int option=sc.nextInt();
            switch(option){
                case 1:
                a.balanceenquiry();
                break;
                case 2:
                System.out.println("enter withdrawan amount:");
                int Amount = sc.nextInt();
                a.withdrawan(Amount);
                break;
                case 3:
                System.out.println("enter new pin to change");
                int Newpin =sc.nextInt();
                break;
                case 4:
                a.exit();
                
                default:
                break;
             }
            }
        }
        else{
            System.out.println("Wrong pin, reenter the pin");
        }

        }
    }
class Account{
    int acno=123456;
    String name="kasturi sravya";
    int PIN=1234;
    int balance = 25000;
    public void balanceenquiry(){
        System.out.println("your balance is" + balance);
    }
    public void withdrawan(int Amount){
        if(Amount<=balance){
            System.out.println("take your amount");
        }
    }
    public void Pinchange(int Newpin){
        int PIN = Newpin;
        System.out.println("your new updated pin is: "+PIN);
        
    }
    public void exit(){
        System.exit(0);
    }
        
    


}




    
    

