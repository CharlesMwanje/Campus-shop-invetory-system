package campusshopinventorymanagementsystem;

public class Main {

	public static void main(String[] args) {
		// passing of the arguments as stipulated by the class constructor  to create the object state of the products 
		
		Product item1 = new Product("PD01", "Manuscript Books ",
                "Stationery", 6000, 100);

        Product item2 = new Product("PD02", "Pen",
                "Stationery", 600, 150);

        Product item3 = new Product("PD03", "Printing Paper",
                "Office Supplies", 15000, 100);

        Product item4 = new Product("PD04", "Flash Disk",
                "Electronics", 20000, 120);

        Product item5 = new Product("PD05", "Calculator",
                "Stationery", 50000, 180);

        
    // object state display of the Product information      
        
        System.out.println("INITIAL PRODUCT DETAILS");
        System.out.println("-------------------------------------");

        item1.displayProduct();
      
        System.out.println("--------------------------------");
        
        item2.displayProduct();
        
        System.out.println("---------------------------------");
        
        item3.displayProduct();
        
        System.out.println("------------------------------------");
        
        item4.displayProduct();
       
        System.out.println("------------------------------------");
        
        item5.displayProduct();

        // Update Product Information for sample objects changing the values
        item1.setUnitPrice(1500);
        item1.setQuantityInStock(100);
        
        item5.setUnitPrice(30000);
        item5.setQuantityInStock(300);

        System.out.println("\nUPDATED PRODUCT DETAILS");
        System.out.println("----------------------------");

        item1.displayProduct();
        
        System.out.println("----------------------------");
        item5.displayProduct();

        // Invalid values to check the negative values 
        System.out.println("\nVALIDATION TEST");
        item3.setUnitPrice(-10000);
        
        item4.setQuantityInStock(-50);
    }
}
		
		
		
		
		
		
		
		


