//Question 1
//what will be output of follwing code
// public class Test {
//     public static void main(String[] args){
//         int x = 2, y = 5;
//         int exp1 = (x * y / x);
//         int exp2 = (x * (y / x));
//         System.out.print(exp1 + “ , ”);
//         System.out.print(exp2);
//     }
// }

//solution
//exp1 = 2 * 5 / 2      *, / have same precedence, the leftmost will be solved first
//exp1 = (2 * 5) / 2 = 10 / 2 = 5
//exp2 = 2 * (5 / 2) = 2 * 2 = 4

public class PracticeQuestions_3_I {
    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x);
        int exp2 = (x * (y / x));
        System.out.print(exp1 + " , ");
        System.out.print(exp2);
    }
    
}
