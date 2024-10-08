/**
 * Affiche la moyenne et appelle des fonctions de la class TP2
 */
public class Main {
    /**
     * Affiche la moyenne et appelle des fonctions de la class TP2
     */
    public static void main(String[] args) {
        int[] Numbers = {11, 27, 13, 64, 37, 83, 60};
        float AllNumbers = 0;

        TP2 tp2 = new TP2();

        for(int i = 0; i < Numbers.length; i++){
            AllNumbers += Numbers[i];
        }

        System.out.println("Moyenne: " + AllNumbers/Numbers.length);
        tp2.PrintTable(Numbers);
        System.out.println("Plus gros chiffre: " + tp2.ReturnHighestNumber(Numbers, Numbers[0]));
        System.out.println(tp2.isNumberLessThan10(Numbers));
    }
}