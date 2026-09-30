import java.util.Scanner;
public class TaxWithholding {
public static void main(String[]args){
    Scanner input = new Scanner(System.in);
System.out.print("Enter your weekly income: $");
double income = input.nextDouble();
double taxRate;
if (income < 500){
    taxRate = 0.10;
}else if (income < 1500){
    taxRate = 0.15;
}else if (income <2500){
taxRate = 0.20;
}
else{
    taxRate = 0.30;
} 
double tax = income * taxRate;
System.out.print("Your weekly tax is: $" + tax);

}    
}
