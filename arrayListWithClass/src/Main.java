import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"osman","sirakaya"));
        customers.add(new Customer(2,"emir","görürüm"));
        customers.add(new Customer(3,"erva","görürüm"));

        customers.remove(new Customer(1,"osman","sirakaya")); // ref tip olduğu için silmez. new dediğimiz için ne tip ref tipi oluştu onu kaldırır amcımıza ulaşamayız.
        // remove edebilmek için new'lediğimiz veriyi bir değişkene atıp o değişkeni remove ederiz.
        for(Customer customer : customers){
            System.out.println(customer.firstName+" "+customer.lastName);
        }
    }
}