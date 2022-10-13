public abstract class GameCalculator { // abstract class oluşturduk
    public abstract void hesapla(); // kim inherit ederse bu methodu override etmek zorunda. abstract method olmasada olurdu.

    public final void gameOver(){
        System.out.println("Oyun bitti.");
    }
}
