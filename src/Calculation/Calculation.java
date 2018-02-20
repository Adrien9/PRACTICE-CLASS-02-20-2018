package Calculation;
import java.util.Scanner;
public class Calculation {

	public static void main(String[]args){
	
		Scanner scanner=new Scanner(System.in);

		
		System.out.println("Enter number 1");
		double a= scanner.nextDouble();
		System.out.println("Enter number 2");
		double b= scanner.nextDouble();

		System.out.println("What calcuation do you want to perform? You can enter 1 for addition, 2 for subtraction, 3 for mutliplication, and 4 for division.");
		double answer=scanner.nextDouble();
	

		if(answer==1){
		
		double add= add(a,b);
		System.out.println("The sum is " + add );
		}
		
		else if(answer==2){
			
			double sub= subtract(a,b);
			System.out.println("The difference is " + sub );
		}
		
		else if(answer==3){
			
			double mult=multiply(a,b);
			System.out.println("The product is " + mult );

		}
		
		else if (answer==4){
			
		double div=divide(a,b);
		System.out.println("The quotient " + div );
		
		}
	}


				public static double add(double num1, double num2){

					double add= num1+num2;
					return add;

				}

				public static double subtract(double num1, double num2){

					double subtract= num1-num2;
					return subtract;
				}

				public static double multiply(double num1, double num2){

					double multiply= num1*num2;
					return multiply;
				}
				public static double divide(double num1, double num2){

					double divide= num1/num2;
					return divide;
				}
			}
