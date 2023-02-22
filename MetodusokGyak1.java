package metodusok;

public class MetodusokGyak1 {

    
    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        String szoveg = String.format("az elso 10 szam osszege: %d", osszeg );
        kiiras(szoveg+"\n");
        
        int a = 5;
        int b = 5;
        
        osszeg = osszead(a, b);
        szoveg = String.format("%d + %d = %d\n", a, b, a + b);
        kiiras(szoveg);
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
    
    
}
