public class Main {
    public static void main(String[] args) {
        int Numbers[] = {3, 9, 13, 64, 37, 83, 60};
        float Moyenne = 0;

        for(int i = 0; i < Numbers.length; i++){
            System.out.println(Numbers[i]);
            Moyenne += Numbers[i];
        }

        System.out.println("Moyenne: " + Moyenne/Numbers.length);
    }
}