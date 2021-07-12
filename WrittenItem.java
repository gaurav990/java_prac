package day3;

public abstract class WrittenItem extends Item {
	private String author;

	
	public WrittenItem(int identificationNo, String title, int numberCopies, String author) {
		super(identificationNo, title, numberCopies);
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "WrittenItem [author=" + author + "]";
	}

}
