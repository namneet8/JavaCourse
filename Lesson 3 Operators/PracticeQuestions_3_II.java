//Question 2
//what will be the output of the following code?
// int x = 200, y = 50, z = 100;
// if(x > y && y > z){                            x>y(200>50) -> true, y>z(50>100) -> false   true && false -> false
//     System.out.println("Hello");
// }
// if(z > y && z < x){                            z>y(100>50) -> true, z<x(100<200) -> true   true && true -> true
//     System.out.println("Java");                Java printed to console
// }
// if((y+200) < x && (y+150) < z)                 (y+200)<x && (y+150)<z -> (50+250)<x && (y+150)<z -> 300<x && (50+150)<z
//{                                               300<x && 200<z -> 300<200 && 200<100 -> false 
//     System.out.println("Hello Java");          
// }
//solution
//java

public class PracticeQuestions_3_II {
    public static void main (String args[]){
        int x = 200, y = 50, z = 100;
        if(x > y && y > z){
            System.out.println("Hello");
        }
        if(z > y && z < x){
            System.out.println("Java");
        }
        if((y+200) < x && (y+150) < z){
            System.out.println("Hello Java");
        }
    }
}
