package metodusok;

public class MetodusokGyak1 {

    
    public static void main(String[] args) {
        int osszeg = elso10SzamOsszege();
        String szoveg = String.format("az elso 10 szam osszege: %d", osszeg );
        kiiras(szoveg+"\n");
        
        int a = 3;
        int b = 4;
        int c = 2;
        int d = 1;
        

        osszeg = osszead(a, b, c, d);
        szoveg = String.format("%d + %d + %d + %d = %d\n", a, b, c, d, a + b + c + d);
        kiiras(szoveg);
        
        osszeg = (int) Math.sqrt(a + b + c);
        
    }
    
    public static int elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 1;
        }
        return osszeg;
    }
    
    public static int osszead(int a, int b, int c , int d) {
        return a+b+c+d;
    }
    
    private static void kiiras(String szoveg){
        System.out.print(szoveg);
    }
    
}
