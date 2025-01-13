// Explicit conversion or type casting or narrowing conversion is done as follows-
// (int) b whwre b can be long, double, float....

public class ExplicitConversion_2 {
    public static void main(String args[]){
        float a = 12.03f;
        //int b = a; throws error
        int b = (int) a;
        System.out.println(b);

        //also each character has a digit associated with it
        char ch = 'c';
        int c = ch;
        char cha = '.';
        int fullstop = cha;
        System.out.println(c);
        System.out.println(fullstop);

    }
    
}
