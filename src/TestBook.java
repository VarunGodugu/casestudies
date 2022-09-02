
import java .util.Scanner;
public class TestBook {

	public static void main(String[] args) {
		Computer ob1=new Computer();
		Scanner sc = new Scanner(System.in);
		System.out.println("..................ENTER THE DETAILS OF COMPUTERBOOK:............." );
		System.out.println("ENTER BOOK TYPE:");
		ob1.setType(sc.next());
		System.out.println("enter book no:");
		ob1.setBookNO(sc.nextInt());
		System.out.println("enter book title:");
		ob1.setTitle(sc.next());
		System.out.println("enter book publication:");
		ob1.setPublication(sc.next());
		System.out.println("enter book author:");
		ob1.setAuthor(sc.next());
		System.out.println("enter book price:");
		ob1.setPrice(sc.nextFloat());
		
		Mathematics ob2=new Mathematics();
		System.out.println("...................ENTER THE DETAILS OF MATHEMATICS BOOK:..........");
		System.out.println("enter the book type:");
		ob2.setType(sc.next());
		System.out.println("enter book no:");
		ob2.setBookNO(sc.nextInt());
		System.out.println("enter book title:");
		ob2.setTitle(sc.next());
		System.out.println("enter book publication:");
		ob2.setPublication(sc.next());
		System.out.println("enter book author:");
		ob2.setAuthor(sc.next());
		System.out.println("enter book price:");
		ob2.setPrice(sc.nextFloat());
		
		
		System.out.println("details of the computer book"+"\t"+ ob1.getBookNO()+"\t"+ob1.getTitle()+"\t"+ob1.getPublication()+"\t"+ob1.getAuthor()+"\t"+ob1.getPrice());
		
		System.out.println("details of the computer book"+"\t"+ ob2.getBookNO()+"\t"+ob2.getTitle()+"\t"+ob2.getPublication()+"\t"+ob2.getAuthor()+"\t"+ob2.getPrice());
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}

