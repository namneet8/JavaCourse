//What will be the value of x & y in the following program:
// int a=63, b=36;
// boolean x= (a<b)?true:false;
// int y= (a>b)?a:b;

//solution
// x= (a<b)?true:false; -> 63<36 is false, hence 2nd statement will be assigned to x i.e. x = false
// y=(a>b)?a:b; -> 63>36 is true, hence first stat will be assigned to y i.e. y = a = 63

public class Question_3 {
    public static void main(String[] args) {
        int a=63, b=36;
        boolean x= (a<b)?true:false;
        int y= (a>b)?a:b;
        System.out.println("x = " + x + ", y = " + y);
    }
    
}
