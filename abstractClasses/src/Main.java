public class Main {
    public static void main(String[] args) {

        GameCalculator[] gameCalculators = {new WomanGameCalculator(), new ManGameCalculator(), new KidsGameCalculator()};
        for (GameCalculator gameCalculator : gameCalculators) {
            gameCalculator.hesapla();
        }
    }
}