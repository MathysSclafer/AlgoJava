import java.util.Collections;

public class TP2 {

    public static void PrintTable(int[] Tableau){
        for(int i = 0; i < Tableau.length; i++){
            System.out.println(Tableau[i]);
        }
    }

    public static int ReturnHighestNumber(int[] Tableau, int TableauIndex0){
        int max = TableauIndex0;
        for(int i = 0; i < Tableau.length; i++){
            if(Tableau[i] > max){
                max = Tableau[i];
            }
        }
        return max;
    }

    public static boolean isNumberLessThan10(int[] Tableau){
        for(int i = 0; i < Tableau.length; i++){
            if(Tableau[i] < 10){
                return true;
            }
        }
        return false;
    }
}
