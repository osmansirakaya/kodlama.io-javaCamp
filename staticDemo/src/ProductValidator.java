public class ProductValidator { // ürünlerin kurallara uygun olup olmadıgını kontrol eder
    // ana class static olamaz
    static {
        System.out.println("Static blok calisti");
    }
    public static boolean isValid(Product product){ // static olmasının sebebi bu metodu new'lemeden kullanabilmek
        if (product.price > 0 && !product.name.isEmpty()){
            return true;
        }
        else {
            return false;
        }
    }
}
