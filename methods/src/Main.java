public class Main {
    public static void main(String[] args) {
       int[] sayilar = new int[] {1,2,5,7,9,0};
       int aranacak = 0;
       boolean varMi = false;

       for (int sayi : sayilar){
           if (sayi == aranacak){
               varMi = true;
               break;
           }
       }
       String mesaj="";

       if(varMi){
        mesaj = "sayi mevcuttur:" + aranacak;
        mesajVer(mesaj);
       }else {
           mesaj = "sayi mevcut değil:" + aranacak;
           mesajVer(mesaj);
       }
    }
    public static void mesajVer(String mesaj){
        System.out.println(mesaj);
    }
 }