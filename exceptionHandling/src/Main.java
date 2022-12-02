public class Main {
    public static void main(String[] args) {
        try{
            int [] sayilar = new int[]{1,2,3};
            System.out.println(sayilar[4]);
        } catch (StringIndexOutOfBoundsException exception) { // String'e girmeyeceği için Array'e gidecektir.
            System.out.println("hata alındı" + exception);
        }catch (ArrayIndexOutOfBoundsException exception) { //
            System.out.println("hata alındı" + exception);
        }catch (Exception exception) {
            System.out.println("loglandi" + exception);
        }finally {
            System.out.println("her türlü çalışır burası. olayı kapatmak için");
        }
    }
}