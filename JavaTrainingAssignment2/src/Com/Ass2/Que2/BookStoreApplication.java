package Com.Ass2.Que2;

import java.util.Scanner;

public class BookStoreApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Here is the menu!!");
		
		System.out.println("Enter 1 to display books");
		System.out.println("Enter 2 to order new books");
		System.out.println("Enter 3 to sell books");
		System.out.println("Enter 0 to exit the system");
		int num = sc.nextInt();
		
		Book[] books = {new Book("The Law of Success", "Napoleon Hill", "47289", 64), new Book("The Magic (The Secret Book 3)", "Rhonda Byrne", "89345", 43)};
		
		switch (num) {
		case 1:
			printBookInto(books);
			break;
		case 2:
			
			break;
		case 3: 
			
			break;
		case 0 :
			System.out.println("Exited!!");
			break;
		default:
			break;
		}
	}
	
	public static void printBookInto(Book[] books) {
		System.out.println("bookTitle " + " " + " bookAuthor " + " " + " ISBN " + " " + " numOfCopies ");
		for(int i=0;i<books.length;i++) {
			books[i].display();
		}
	}

}
