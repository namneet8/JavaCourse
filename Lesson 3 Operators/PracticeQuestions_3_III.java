// Question 3
// Identify the output-
// int x, y, z;
// x = y = z = 2;                                 x = 2, y = 2, z = 2
// x += y;                                        x += y -> x +=2 -> 4  (x=4)
// y -= z;                                        y-= z -> y-=2 -> 0  (y=0)
// z /= (x + y);                                  z /= (x+y) -> z /= 4 -> z = 0 (0.5 is float and z is int)
// System.out.println(x + " " + y + " " + z);

public class PracticeQuestions_3_III {
    public static void main(String args[]){
        int x, y, z;
        x = y = z = 2;
        x += y;
        y -= z;
        z /= (x + y);
        System.out.println(x + " " + y + " " + z);
    }
    
}
