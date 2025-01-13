// 1. Java automatically convertseach byte, short, or char operand to int when evaluating an expression.
// 2. If one operand is long, float, or double, the whole expression is promoted to long, float, or double respectively.

public class TypePromotion_3 {
    public static void main (String args[]){
        char a= 'a';
        char b = 'b';
        //char c = a-b; throws error because a-b will give an integer which cant be converted to int
        System.out.println(b-a);

        int x = 10;
        float y = 20.25f;
        long z = 234;
        //int ans = x + y + z; //can't covert float to int
        int ans = (int) (x + y + z);
        System.out.println(ans);


    }
    
}
