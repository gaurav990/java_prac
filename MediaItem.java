package day3;

public abstract class MediaItem extends Item {

	private int runtime;

	public MediaItem(int identificationNo, String title, int numberCopies, int runtime) {
		super(identificationNo, title, numberCopies);
		this.runtime = runtime;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	void print() {
	};

	void checkIn() {
	};

	void checkOut() {
	};

	void addItem() {
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + ","+ super.toString() + "]";
	}

	
	

}
