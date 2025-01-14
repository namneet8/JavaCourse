//Question 5
//Identify the output
// int x = 10, y = 5;
// int exp1 = (y * (x / y + x / y));
// int exp2 = (y * x / y + y * x / y);
// System.out.println(exp1);
// System.out.println(exp2);

//solution
//exp1 = (y * (x / y + x / y)); 
//exp1 = (y * (10 / 5 + 10 / 5));
//exp1 = (y * (2 + 10 / 5));
//exp1 = (y * (2 + 2));
//exp1 = (5 * 4);                        (exp1 = 20)
//exp2 = (y * x / y + y * x / y);
//exp2 = (5 * 10 / 5 + 5 * 10 / 5)
//exp2 = (50 / 5 + 5 * 10 / 5)
//exp2 = (10 + 5 * 10 / 5)
//exp2 = (10 + 50 / 5)
//exp2 = (10 + 10)                     (exp2 = 20)

public class PracticeQuestions_3_V {
    public static void main (String args[]){
        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));
        int exp2 = (y * x / y + y * x / y);
        System.out.println(exp1);
        System.out.println(exp2);
    }
    
}
