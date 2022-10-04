package oop1;

import java.util.Iterator;

public class Main {

		public static void main (String [] args) {
			
			Product product1 = new Product(); 
			product1.setName("kýrmýzý kahve makinesi"); 
			product1.setDiscount(7);
			product1.setUnitPrice(7500);
			product1.setUnitsInStock(3);
			product1.setImageUrl("image1.png");		
			
			Product product2 = new Product(); 
			product2.setName("siyah kahve makinesi"); 
			product2.setUnitPrice(7500);
			product2.setUnitsInStock(3);
			product2.setImageUrl("image1.png");	
			
			Product product3 = new Product(); 
			product3.setName("beyaz kahve makinesi"); 
			product3.setUnitPrice(7500);
			product3.setUnitsInStock(3);
			product3.setImageUrl("image1.png");	
			
			Product[] products = {product1, product2, product3};
			
			for (Product product : products) {				
				System.out.println(product.getName());
			}
			
			IndividualCustomer individualCustomer = new IndividualCustomer();			
			individualCustomer.setId(1);
			individualCustomer.setCutomerNumber("5547232323");
			individualCustomer.setPhone("12345");
			individualCustomer.setFirstName("osman");
			individualCustomer.setLastName("sýrakaya");
			
			CorporateCustomer corporateCustomer = new CorporateCustomer();
			corporateCustomer.setId(2);
			corporateCustomer.setCompanyName("kodlama.io");
			corporateCustomer.setPhone("11111111");
			corporateCustomer.setTaxNumber("1111111");
			corporateCustomer.setCutomerNumber("54752");
			
			Customer[] customers = {individualCustomer, corporateCustomer};		
		}
}
