package day3;

public class CD extends MediaItem {
	private String artist;
	private String genre;

	public CD(int identificationNo, String title, int numberCopies, int runtime, String artist, String genre) {
		super(identificationNo, title, numberCopies, runtime);
		this.artist = artist;
		this.genre = genre;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
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
