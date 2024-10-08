import java.util.Collections;

/**
 * Regroupe des fonctions
 */
public class TP2 {

    /**
     * Affiche un tableau dans la console
     * @param Tableau le tableau qui va être affiché
     */
    public static void PrintTable(int[] Tableau){
        for(int i = 0; i < Tableau.length; i++){
            System.out.println(Tableau[i]);
        }
    }

    /**
     * Retourne la valeur max d'un tableau
     * @param Tableau Tableau utilisé pour avoir la valeur max
     * @param TableauIndex0 Chiffre max par defaut
     * @return la valeur max du tableau
     */
    public static int ReturnHighestNumber(int[] Tableau, int TableauIndex0){
        // Définie que max est égal a l'index 0 du tableau
        int max = TableauIndex0;
        for(int i = 0; i < Tableau.length; i++){
            // Si le chiffre du tableau > max actuelle alors on remplace l'ancien max par le nouveau
            if(Tableau[i] > max){
                max = Tableau[i];
            }
        }
        return max;
    }

    /**
     * Retourne Vrai si au moins 1 chiffre est inferieu a 10
     * @param Tableau utilisé pour récuperer les chiffres
     * @return si un chiffre est inferieure a 10 ou non
     */
    public static boolean isNumberLessThan10(int[] Tableau){
        for(int i = 0; i < Tableau.length; i++){
            if(Tableau[i] < 10){
                return true;
            }
        }
        return false;
    }
}
