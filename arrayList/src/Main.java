import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

       ArrayList sayilar = new ArrayList();
       sayilar.add(2);
       sayilar.add("ankara");
       System.out.println(sayilar.get(0));
       sayilar.set(0,3);
       // sayilar.remove(1);

       for(Object i:sayilar ){
           System.out.println(i);
       }

    }
}