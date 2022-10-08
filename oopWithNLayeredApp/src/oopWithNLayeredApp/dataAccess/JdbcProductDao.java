package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao { // JdbcProductDao, ProductDao'nun kurallarýna uymak zorunda. onun referansýný tutar.
	public void add(Product product) {
		//sadece db eriþim kodlarý buraya yazýlýr... SQL 
		System.out.println("jdbc ile veritabanýna eklendi");
	}
}
