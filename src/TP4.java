import java.util.Random;
import java.util.Arrays;

public class TP4 {
    public static void main(String[] args) {
        int[] ListNumbers = new int[7];
        Random random = new Random();

        for(int i = 0; i < ListNumbers.length; i++){
            ListNumbers[i] = random.nextInt(101);
        }

        BinarySearch(ListNumbers, 0, ListNumbers.length-1, 37);
    }

    /**
     * Fonction de recherche binaire pour chercher l'index d'un nombre dans un tableau
     * @param List utilisé pour chercher
     * @param First Index de depart pour le tableau
     * @param Last index de fin pour le tableau
     * @param NumberToGet Chiffre qu'on veut chercher dans le tableau
     */
    public static void BinarySearch(int[] List, int First, int Last,  int NumberToGet){
        Arrays.sort(List);
        int IndexMilieu = (First + Last)/2;
        while(First <= Last){
            if(List[IndexMilieu] == NumberToGet){
                System.out.println("L'index est: " + IndexMilieu);
                break;
            }
            else{
                if(List[IndexMilieu] < NumberToGet){
                    First = IndexMilieu +1;
                }
                else{
                    Last = IndexMilieu -1;
                }
            }
            IndexMilieu = (First + Last)/2;
            if(First > 1){
                System.out.println("L'index est: -1");
            }
        }
    }
}
