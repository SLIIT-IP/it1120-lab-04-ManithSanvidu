import java.util.Scanner;
public class IT24101458Lab4Q2{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);

		System.out.print("Please enter exam marks(out of 100):");
		int m=scanner.nextInt();
		if(m<0||m>100){
			System.out.print("Invalid input for exam marks.Terminating program.");
			return;
			}
		System.out.print("Please enter lab submission marks(out of 100):");
		int sm=scanner.nextInt();
		if(m<0||m>100){
			System.out.print("Invalid input for exam marks.Terminating program.");
			return;
			}
		System.out.print("Please enter the percentage given for the exam:");
		int pe=scanner.nextInt();
	
		System.out.print("Please enter the percentage given for the lab submission:");
		int plb=scanner.nextInt();


		if(pe+plb!=100){
			System.out.println("The percentages must add upto 100.Terminating program.");
			return;
			}
			double final_mark=(m*pe/100)+(sm*plb/100);
			
			System.out.println("Final Exam Mark is:"+final_mark);
	}
}