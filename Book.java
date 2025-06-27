package oopsProblems;
import java.util.ArrayList;

public class Book {

	String title;
	String author;
	int ISBN;
	//declaring static arraylist to store collection of book objects
	private static ArrayList<Book> bookCollection=new ArrayList<Book>();
	//CONSTRUCTOR
public Book(String title,String author,int ISBN) {
this.title=title;
this.author=author;
this.ISBN=ISBN;

}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title=title;
	
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author=author;
}
public int getISBN() {
	return ISBN;
}
public void setISBN(int ISBN) {
	this.ISBN=ISBN;
}
//static method to add book to collection of Books
public static void addBook(Book book) {
	//Add provided book object to bookcollection arraylist
	bookCollection.add(book);
	
}
//Static method to remove a book from the book collection
public static void removeBook(Book book) {
	bookCollection.remove(book);
}
//Static method to retrieve the entire book collection
public static ArrayList<Book>ggetBookCollection(){
	return bookCollection;
}
public static void main(String[]args) {
	Book book1=new Book("Harry Potter","Sanika",12345); 
	Book book2=new Book("LA LA LAND","ANIRUDHA",34567);
	
	
	Book.addBook(book2);
	Book.addBook(book1);
	// Retrieve the book collection and store it in an ArrayList named bookCollection
	ArrayList<Book>bookCollection=Book.ggetBookCollection();
	// Print a heading for the list of books
	System.out.println("LIST OF BOOK");
	// Iterate over each book in the bookCollection
	for(Book book:bookCollection) {
		System.out.println(book.getTitle()+"by"+book.getAuthor()+",ISBN"+book.getISBN());
	}
	
	
	
	
}
}
