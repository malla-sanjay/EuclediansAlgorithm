import java.util.Scanner;

public class Main
{
    private static int m;
    private static int n;
    private static boolean counter = true;
    
    //method to insert number N
    public static void setM() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Greater number M ");
        n = scan.nextInt();
    }
    //method to insert number M
    public static void setN() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Smaller number N ");
        m = scan.nextInt();
    }
    //main method to utilize these method for calculation
    public static void main (String[] args){
        int temp;
        //try catch to make sure that only numbers are being inserted
        try{
            do{
                System.out.println("Eucledians algorithm!!");
                setM();
                setN();
                
                //to make sure the numbers are in proper order
                while (m >= n) {
                    System.out.println("Please ensure that N is greater than M");
                    setM();
                    setN();
                }
                //the main calculation
                do {
                    temp = n % m;
                    n = m;
                    m = temp;
                } while(m != 0);
                
                System.out.println("The greatest common divisior for these numbers is " + n);
                contd();
            }while(counter == true);
        
            System.out.println("Thank-you for using this program");
        }
        //the error message
        catch(Exception e){
            System.out.println("Please refrain from using anything other than string and Try again");
        }
    }
    //method to perform calculation again
    public static void contd(){
        boolean check;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Would you like to perform another calculation? (y/n) ");
            String temp1 = scan.next();
            
            if(temp1.equalsIgnoreCase("y")) {
                counter = true;
                check = false;
            }
            
            else if (temp1.equalsIgnoreCase("n")) {
                counter = false;
                check = false;
            }
            
            else{
                check = true;
                System.out.println("Please answer in Y/N");
            }
        } while (check == true);  
    }
}
