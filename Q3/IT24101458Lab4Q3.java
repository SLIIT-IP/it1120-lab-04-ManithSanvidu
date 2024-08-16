import java.util.Scanner;
	public class IT24101458Lab4Q3{
		public static void main(String[]args){
			Scanner scanner=new Scanner(System.in);

			System.out.print("Enter a number:");
			int n=scanner.nextInt();
	
			String output=((n>0)?"Positive":(n<0)?"Negative":"Zero");

			System.out.println("The number is:"+output);
		}
}