import java.util.Scanner;

public class Hello {
	public static void main(String[] args){
		int number=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello to the Daemons World");
		System.out.print("Enter number to print table: ");
		System.out.println();
		for(int i=0;i<=10;i++){
			if(i%2==0){
				System.out.println(number+" * "+i+" = "+(number*i));
			}
		}
		System.out.println("Thanks");
	}
}

