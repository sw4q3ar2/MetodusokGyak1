package metodusok;


import java.util.Random;

public class Equalizer {
    
    private static Random rnd = new Random();
    
    public static void main(String[] args) {
        equalizer_5_sor();
    }
    public static void equalizer_5_sor() {
        
        eq();
        eq(15,true);
        eq();
        eq(6, true);
        eq();
        
    }
    
    public static void eq() {
        eq(false);
    }

    public static void eq(int db) {
        eq(db, false);
    }
    
    public static void eq(boolean ertekLatszik) {
        int db = rnd.nextInt(7-3+1)+3;
        eq( db, ertekLatszik);
    }
    
    public static void eq(int db, boolean ertekLatszik) {
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            System.out.print(szin + " ");
        }
        if(ertekLatszik){
            szin = "\u001B[40m";
            System.out.print(szin + "" + "(" + db + ")");
        }
        System.out.println("");
    }
}
