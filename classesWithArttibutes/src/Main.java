public class Main {
    public static void main(String[] args) {
        Product product = new Product(1,"leptop","asus",2000,300);

        ProductManager productManager = new ProductManager();
        productManager.Add(product);
    }

}