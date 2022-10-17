public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.customerDal = new OracleCustomerDal();
        customerManager.add();
    }
}
/*

- interface'ler new'lenemez. new'lenen class'lar interface'leri implemente eder.
- class'lar birden fazla interface'i implemente edebilir ama class'ı extend eden sadece bir class olabilir.
- interface'ler referasn tutucudur.

 */
