package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.Logging.Logger;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) { // birden fazla logger gelebilir.
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception{
		// is kurallar�
		if(product.getUnitPrice()<10) {
			throw new Exception("�r�n fiyat� 10'dan k�c�k olamaz.");
		}
		productDao.add(product);
		
		for (Logger logger : loggers) { // [db, file, mail]
			logger.log(product.getName());
			
		}
	}
}