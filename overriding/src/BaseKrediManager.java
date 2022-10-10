public class BaseKrediManager {
    public double hesapla(double tutar){
        return tutar * 1.18;
    }
}
   /* public final double hesapla(double tutar){
        return tutar * 1.18;

 Not: "final" keyword'u ile, diğer class'daki "hesapla" metoduyla BaseKerdiManager'daki "hesapla" metodunu ezemez.
       Üzerine yazamaz.
    }*/
