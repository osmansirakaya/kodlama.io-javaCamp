import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> sozluk = new HashMap<String, String>(); // ayrıca String, int gibi kullanılabilir
        sozluk.put("book", "kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
        System.out.println(sozluk.get("table"));

        for(String item : sozluk.keySet()){
            System.out.println("eleman-"+item+" değer-"+sozluk.get(item));
        }
    }
}