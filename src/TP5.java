import java.util.Random;
import java.util.Arrays;

public class TP5 {
    public static void main(String[] args) {
        int[] ListNumbers = {3, 19, 37, 84, 63, 29, 28};

        int First = 0;
        int Last = ListNumbers.length-1;
        int IndexMilieu = (First+Last)/2;

        Arrays.sort(ListNumbers);
        BinarySearch(ListNumbers, First, Last, 84, Last);
    }

    /**
     * Fonction de recherche binaire pour chercher l'index d'un nombre dans un tableau de maniere recursive
     * @param List utilisé pour chercher
     * @param First Index de depart pour le tableau
     * @param Last index de fin pour le tableau
     * @param NumberToGet Chiffre qu'on veut chercher dans le tableau
     * @param start Chiffre pour savoir quand s'arreter (En fonction de la taille du tableau)
     */
    public static void BinarySearch(int[] List, int First, int Last,  int NumberToGet, int start){
        int IndexMilieu = (First + Last)/2;
        if(start > 0){

            // Chiffre recherché est equal au chiffre dans le tableau
            if(List[IndexMilieu] == NumberToGet){
                System.out.println("L'index est: " + IndexMilieu);
            }
            else{
                if(List[IndexMilieu] < NumberToGet){
                    First = IndexMilieu +1;
                }
                else if(List[IndexMilieu] > NumberToGet){
                    Last = IndexMilieu -1;
                }
                // Appelle la fonction de maniere récurisve en enlevant -1 a la variable pour vérifier quand s'arreter de vérifier
                BinarySearch(List, First, Last, NumberToGet, start-1);
            }
        }
        else{
            System.out.println("L'index est: -1");
        }
    }
}
