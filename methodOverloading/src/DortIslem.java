public class DortIslem {

    // iki method'da aynı isimli(topla) ama aldıgı parametre farklı buna methodOverloading deniyor(aşırı yükleme)
    public int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
    public int topla(int sayi1, int sayi2,int sayi3){
        return sayi1+sayi2+sayi3;
    }
}
