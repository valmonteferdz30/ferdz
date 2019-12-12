import java.util.Scanner;
public class LabExer1B{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
			System.out.print("Enter a number:");
			int a=sc.nextInt();
			
			showNumberPlus10(a);
			showNumberPlus100(a);
			showNumberPlus1000(a);
		
	}
		public static void showNumberPlus10(int adder){
		
			int a= 10 + adder;
			System.out.println(adder + " plus 10 is " + a);
			}
			
		public static void showNumberPlus100(int adder1){
		
		int a= 100 + adder1;
		System.out.println(adder1 +" plus 100 is "+ a);
		}
		
		public static void showNumberPlus1000(int adder2){
		int a = 1000 + adder2;
		System.out.println(adder2 +" plus 1000 is " +a);
		}
}