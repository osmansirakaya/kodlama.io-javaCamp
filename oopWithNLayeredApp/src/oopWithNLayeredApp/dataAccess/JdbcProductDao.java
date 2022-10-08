package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao { // JdbcProductDao, ProductDao'nun kurallar�na uymak zorunda. onun referans�n� tutar.
	public void add(Product product) {
		//sadece db eri�im kodlar� buraya yaz�l�r... SQL 
		System.out.println("jdbc ile veritaban�na eklendi");
	}
}
