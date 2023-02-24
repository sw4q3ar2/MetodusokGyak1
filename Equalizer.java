package metodusok;


import java.util.Random;

public class Equalizer {
    
    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        equalizer_5_sor();
    }
    public static void equalizer_5_sor() {
        
        eq();
        eq(12);
        eq();
        eq(2);
        eq();
        
    }
    
    public static void eq() {
        int db = rnd.nextInt(3,8);
        eq(db);
    }
    
    public static void eq(int hossz) {
        String szin = "\u001B[45m";
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + " ");
        }
        System.out.println("");
    }
}
