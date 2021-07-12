package day3;

public class Product {
	int productNo;
	String productName ;
	float price;
	int quantity;
	
	
	 

	public int getProductNo() {
		
		return productNo;
	}




	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}




	public String getProductName() {
		return productName;
	}




	public void setProductName(String productName) {
		this.productName = productName;
	}




	public float getPrice() {
		return price;
	}




	public void setPrice(float price) {
		this.price = price;
	}




	public int getQuantity() {
		return quantity;
	}




	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


		


	@Override
	public String toString() {
		return "Product [productNo=" + productNo + ", productName=" + productName + ", price=" + price + ", quantity="
				+ quantity + "]";
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p = new Product();
		System.out.println(p);
	}

}
