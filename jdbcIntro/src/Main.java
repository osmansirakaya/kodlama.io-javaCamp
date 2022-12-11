import javax.naming.Name;
import java.sql.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement=null; //
        ResultSet resultSet; // sorgunun sonucunda gelen data

        try{
            connection =  helper.getConnection();
            String sql = "delete from country where Capital = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 66); // yukarıdaki ? işartine göre sırala
            statement.executeUpdate(); // çaılstır. etkilenen kayıt sayısı gelir
            System.out.println("kayıt silindi");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close(); // iş bitince bağlantıyı sonlandır
        }
    }
    public static void selectDemo() throws SQLException{
        Connection connection = null;
        DbHelper helper = new DbHelper();
        Statement statement=null; // sql cümleciği
        ResultSet resultSet; // sorgunun sonucunda gelen data
        ArrayList<City> cities = new ArrayList<City>();
        try{
            connection =  helper.getConnection(); // bağlantıyı aç
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Name,CountryCode, District from city");
            while (resultSet.next()){ // tek tek gezer
                cities.add(new City(
                        resultSet.getString("Name"),
                        resultSet.getString("CountryCode"),
                        resultSet.getString("District")
                ));
            }
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            connection.close(); // iş bitince bağlantıyı sonlandır
        }
    }
    public static void insertData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement=null; //
        ResultSet resultSet; // sorgunun sonucunda gelen data

        try{
            connection =  helper.getConnection();
            String sql = "insert into country (Code,Name, Capital, Code2) values(?,?,?,?)";
            statement = connection.prepareStatement(sql);
            statement.setString(1, "TTR");
            statement.setString(2, "yozgat");
            statement.setInt(3, 66);
            statement.setString(4, "AB");
            statement.executeUpdate(); // çaılstır. etkilenen kayıt sayısı gelir
            System.out.println("kayıt eklendi");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close(); // iş bitince bağlantıyı sonlandır
        }
    }
    public void updateData() throws SQLException {
        Connection connection = null;
        DbHelper helper = new DbHelper();
        PreparedStatement statement=null; //
        ResultSet resultSet; // sorgunun sonucunda gelen data

        try{
            connection =  helper.getConnection();
            String sql = "update country set Name='Yozgatt' where Capital = ?";
            statement = connection.prepareStatement(sql);
            statement.setInt(1, 66); // yukarıdaki ? işartine göre sırala
            statement.executeUpdate(); // çaılstır. etkilenen kayıt sayısı gelir
            System.out.println("kayıt güncellendi");
        }catch (SQLException exception){
            helper.showErrorMessage(exception);
        }finally {
            statement.close();
            connection.close(); // iş bitince bağlantıyı sonlandır
        }
    }
}
