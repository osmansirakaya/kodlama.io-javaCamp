public class Product {

    public Product (int id, String name, String description, double price, int stockAmount){ //constructor yapıcı metod gibi düşünebilirz.
        System.out.println("yapıcı blok çalıstı");
        this._id=id;
        this.name=name;
        this.price=price;
        this.stockAmount=stockAmount;
    }

    // attribute | field
    private int _id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;

    //getter
    public int getId() {
        return _id;
    }

    //setter
    public void setId(int id) {
        _id = id; //this içinde bulunduğum clas demek
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
