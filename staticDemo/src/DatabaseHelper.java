public class DatabaseHelper {
    public static class Crud{
        public static void Delete(){
            System.out.println("Silindi");
        }
        public static void Update(){
            System.out.println("Güncellendi");
        }
        public static class Connection{
            public static void CreateConnection(){
                System.out.println("Bağlantı oluşturuldu");
            }
        }
    }
}
