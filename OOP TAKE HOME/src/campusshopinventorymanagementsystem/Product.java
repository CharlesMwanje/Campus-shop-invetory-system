package campusshopinventorymanagementsystem;

public class Product {

	// encapuslation  implementation with the private attributes 
	  private String productId;
	    private String productName;
	    private String productCategory;
	    private double unitPrice;
	    private int quantityInStock;

	  //constructor helps us to initialize the object identity so that  we can create its state with its relevant values basing on the passed  attributes
	    public Product(String productId, String productName,
	                   String productCategory,
	                   double unitPrice, int quantityInStock) {

	        this.productId = productId;
	        this.productName = productName;
	        this.productCategory = productCategory;
            this.unitPrice = unitPrice;
            this.quantityInStock = quantityInStock;

}
	    
	    // Getters help us to access private attributes outside their created class through the accesors 
	    public String getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public String getProductCategory() {
	        return productCategory;
	    }

	    public double getUnitPrice() {
	        return unitPrice;
	    }

	    public int getQuantityInStock() {
	        return quantityInStock;
	    }

	    // Setters help in updating arguments in our created class in the stated parameters 
	    public void setProductId(String productId) {
	        this.productId = productId;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public void setProductCategory(String productCategory) {
	        this.productCategory = productCategory;
	    }

	    public void setUnitPrice(double unitPrice) {
	        if(unitPrice >= 0) {
	            this.unitPrice = unitPrice;
	        } else {
	            System.out.println("Price shouldnot be a negative.");
	        }
	    }

	    public void setQuantityInStock(int quantityInStock) {
	        if(quantityInStock >= 0) {
	            this.quantityInStock = quantityInStock;
	        } else {
	            System.out.println("Stock quantity shouldnot be negative.");
	        }
	    }
// displaying product information 
	    public void displayProduct() {
	        System.out.println("Product Id : " + productId);
	        System.out.println("Product Name: " + productName);
	        System.out.println("Prouduct Category: " + productCategory);
	        System.out.println(" Product Price: UGX " + unitPrice);
	        System.out.println("Product Stock: " + quantityInStock);
	    }
	}
