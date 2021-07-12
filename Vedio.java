package day3;

public class Vedio extends MediaItem {
	private String director;
	private String genre;
	private int year;

	public Vedio(int identificationNo, String title, int numberCopies, int runtime, String director, String genre,
			int year) {
		super(identificationNo, title, numberCopies, runtime);
		this.director = director;
		this.genre = genre;
		this.year = year;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	void print() {
		System.out.println("abc");
	};

	void checkIn() {
	};

	void checkOut() {
	};

	void addItem() {
	}

	@Override
	public String toString() {
		return "Vedio [director=" + director + ", genre=" + genre + ", year=" + year + ","
				+ super.toString() + "]";
	}
	
	

	}
