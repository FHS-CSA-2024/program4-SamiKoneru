//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        int num4 = 0;  //declare variables
      
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = myObj.nextInt();
        System.out.println("Enter second number: ");
        num2 = myObj.nextInt();
        System.out.println("Enter third number: ");
        num3 = myObj.nextInt();
        System.out.println("Enter fourth number: ");
        num4 = myObj.nextInt();  //take input for all variables
        double sum = num1 + num2 + num3 + num4;  //calculate sum, double so ave is double
        double ave = sum / 4;  //calculate average with sum, double
        System.out.println("The sum of the four numbers is " + Math.round(sum));  //round it to remove the .0 at the end
        System.out.print("\nThe average of the four numbers is " + ave);  //output
    }
}


//Paste console output below:
/*
Enter first number: 
475
Enter second number: 
821
Enter third number: 
369
Enter fourth number: 
562
The sum of the four numbers is 2227

The average of the four numbers is 556.75

*/
