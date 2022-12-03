import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try{
            reader = new BufferedReader(new FileReader("C:\\btk-java\\readingFileDemo\\src\\sayilar.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            }catch (Exception exception){

            }
        }
    }
}