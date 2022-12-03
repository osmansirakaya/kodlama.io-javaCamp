import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();

    }
    public static void creatFile(){
        File file = new File("C:\\btk-java\\workingWithFiles\\files\\students.txt");
        try {
            if (file.createNewFile()){ // üretirse true döner. varsa üretmez false döner
                System.out.println("dosya oluşturuldu.");
            }else{
                System.out.println("dosya zaten mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace(); //  hata mesajını metin olarak yazdırır.
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\btk-java\\workingWithFiles\\files\\students.txt");
       if( file.exists()){ // böyle bir dosya(dosya yolundaki) varsa true, yoksa false döner
           System.out.println("dosya adi: " + file.getName()); // dosyanın adını verir
           System.out.println("dosya yolu: " + file.getAbsolutePath()); // dosyanın yolunu verir.
           System.out.println("dosya okunabilir mi mi?: " + file.canRead()); // okunabilir mi mi?
           System.out.println("dosya yazılabilir mi?: " + file.canWrite()); // azılabilir mi?
           System.out.println("dosya boyutu(byte): " + file.length()); // dosya boyutu
            }
    }

    public static void readFile(){
        File file = new File("C:\\btk-java\\workingWithFiles\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){ // okunacak satır varsa
                String line = reader.nextLine(); // yeni bir satır varsa okur bir sonraki satıra geçer
                System.out.println(line);
            }
            reader.close(); // dosyayla işimiz bitince bellekten uçurur..
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(){
        try {
            BufferedWriter writer = new BufferedWriter ( new FileWriter("C:\\btk-java\\workingWithFiles\\files\\students.txt",true)); // true üzerine yazar
            writer.write("osman");
            System.out.println("dosyaya yazıldı");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}