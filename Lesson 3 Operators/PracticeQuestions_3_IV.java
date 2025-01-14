// Question 4
// Identify the output
// int x = 9, y = 12;
// int a = 2, b = 4, c = 6;
// int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
// System.out.println(exp);

//solution
//exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y)
//exp = 4/3 * (9 + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y)
//exp = 4/3 * 43 + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y)
//exp = 4/3 * 43 + 9 * (2 + 4 * 6) + (3 + y * (2 + a)) / (a + b*y)
//exp = 4/3 * 43 + 9 * (2 + 24) + (3 + y * (2 + a)) / (a + b*y)
//exp = 4/3 * 43 + 9 * 26 + (3 + y * (2 + 2)) / (a + b*y)
//exp = 4/3 * 43 + 9 * 26 + (3 + 12 * 4) / (a + b*y)
//exp = 4/3 * 43 + 9 * 26 + (3 + 48) / (a + b*y)
//exp = 4/3 * 43 + 9 * 26 + 51 / (a + b*y)
//exp = 4/3 * 43 + 9 * 26 + 51 / (2 + 4*12)
//exp = 4/3 * 43 + 9 * 26 + 51 / (2 + 48)
//exp = 4/3 * 43 + 9 * 26 + 51 / 50
//exp = 1 * 43 + 9 * 26 + 51 / 50
//exp = 43 + 9 * 26 + 51 / 50
//exp = 43 + 234 + 51 / 50
//exp = 43 + 234 + 1
//exp = 152


public class PracticeQuestions_3_IV {
    public static void main(String args[]){
        int x = 9, y = 12;
        int a = 2, b = 4, c = 6;
        int exp = 4/3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b*y);
        System.out.println(exp);
    }
    
}
