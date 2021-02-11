package oOPSAssignment2;



class Book //a
{
	
	private int bookno;
	private String title;
	private float price;
	
	private String category;
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBookno() {
		return bookno;
	}
	public void setBookno(int bookno) {
		this.bookno = bookno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
}

class EngineeringBook extends Book //b
{
	public static void main(String[] args) {
		Book b1 = new Book();
		b1.setBookno(2);
		System.out.println(b1.getBookno());
		b1.setTitle("JAVA FUNDAMENTALS");
		System.out.println(b1.getTitle());
		b1.setPrice(30);
		System.out.println(b1.getPrice());
		b1.setCategory("Engineering book");
		System.out.println(b1.getCategory());
		System.out.println();
	}

}



 public class BookDetails extends Book

	{
		
		public static void main(String[] args) {
		
			Book b = new Book();
			b.setBookno(1);
			System.out.println(b.getBookno());
			b.setTitle("Harry Potter");
			System.out.println(b.getTitle());
			b.setPrice(30);
			System.out.println(b.getPrice());
			System.out.println();
	}
}
