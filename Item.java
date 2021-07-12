package day3;

public abstract class Item {
	private int identificationNo;
	private String title;
	private int numberCopies;
	
	

	public Item(int identificationNo, String title, int numberCopies) {
		super();
		this.identificationNo = identificationNo;
		this.title = title;
		this.numberCopies = numberCopies;
	}

	public int getIdentificationNo() {
		return identificationNo;
	}

	public void setIdentificationNo(int identificationNo) {
		this.identificationNo = identificationNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberCopies() {
		return numberCopies;
	}

	public void setNumberCopies(int numberCopies) {
		this.numberCopies = numberCopies;
	}

	@Override
	public String toString() {
		return "Item [identificationNo=" + identificationNo + ", title=" + title + ", numberCopies=" + numberCopies
				+ "]";
	}
	
	abstract void print();

	abstract void checkIn();

	abstract void checkOut();

	abstract void addItem();
}
