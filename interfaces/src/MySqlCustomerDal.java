public class MySqlCustomerDal implements ICustomerDal{
    // ICustomerDal'ı implemente eden her class Add metodunu kullanmak zorunda.
    @Override
    public void Add() {
        System.out.println("MySql eklendi");
    }
}
