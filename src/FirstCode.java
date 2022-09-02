import java.util.Scanner;

public class FirstCode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		System.out.println("marks scored in telugu: " +a);
		
		int b=sc.nextInt();
		System.out.println("marks scored in hindi: "+ b);
		int c=sc.nextInt();
		System.out.println("marks scored in english: "+c);
		int d=sc.nextInt();
		System.out.println("marks scored in phssics: "+d);
		int e=sc.nextInt();
		System.out.println("marks scored in science: "+e);
		double per=(a+b+c+d+e)*100/500;
		System.out.println("the total percentage is :"+per);
		sc.close();
		
		// TODO Auto-generated method stub

	}

}
