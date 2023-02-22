package metodusok;

public class MetodusokGyak1 {

    
    public static void main(String[] args) {
        feladatok();
    }
    
    public static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 1;
        }
        return osszeg;
    }
    
    public static int osszead(int a, int b) {
        return a+b;
    }
    
    private static void kiiras(String szoveg){
        System.out.print(szoveg);
    }
    
    public static void elsoTiz() {
        int osszeg = elso10SzamOsszege();
        String szoveg = String.format("az elso 10 szam osszege: %d", osszeg );
        kiiras(szoveg+"\n");
    }
    
    public static void negySzam() {
        int osszeg;
        // 4 szam osszege
        osszeg = osszead(1, osszead(2, osszead(3,4)));
        kiiras("1+2+3+4="+osszeg+"\n");
    }
    
    public static void gyok() {
        int osszeg;
        
        // gyok
        osszeg = (int) Math.sqrt(osszead(2, osszead(3,4)));
        kiiras("2+3+4 gyoke="+osszeg+"\n");
    }
    
    public static void feladatok() {
        elsoTiz();
        negySzam();
        gyok();
    }
    
}
