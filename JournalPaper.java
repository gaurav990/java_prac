package day3;

public class JournalPaper extends WrittenItem {
	private int year;

	public JournalPaper(int identificationNo, String title, int numberCopies, String author, int year) {
		super(identificationNo, title, numberCopies, author);
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void Paper() {
	}

	public void addPaper(JournalPaper paper) {
	}

	void print() {
	};

	void checkIn() {
	};

	void checkOut() {
	};

	void addItem() {
	};
}
