//What will be the type of result in thefollowing Java code?
// byte b = 4;
// char c = 'a';
// short s = 512;
// int i = 1000;
// float f = 3.14f;
// double d = 99.9954;
// double result = (f * b) + (i % c) - (d * s);
// result = (3.14f * 4) + (i % c) - (d * s);
// result = 12.56 + (1000 % 97) - (d * s);
// result = 12.56 + 30 - (99.9954 * 512); 
// result = 12.56 + 30 - 51197.6448;
// result = 42.56 - 51197.6448;
// result = 51,155.0848;



public class PracticeQuestions_4 {
    public static void main (String args[]){
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);
    }
    
}
