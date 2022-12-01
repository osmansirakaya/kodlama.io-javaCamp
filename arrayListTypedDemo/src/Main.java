import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> sehirler = new ArrayList<String>();
        sehirler.add("ankara");
        sehirler.add("istanbul");

        for(String i : sehirler){
            System.out.println(i);
        }
    }
}