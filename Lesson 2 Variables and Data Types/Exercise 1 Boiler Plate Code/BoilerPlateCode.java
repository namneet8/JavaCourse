// The first letter of a class name must be capital and not begin with numbers
// Also, the class name must be same as file name

public class BoilerPlateCode {
    public static void main (String args[]){

    }
    
}

/*
In order to run a java file, go to file location in terminal 
type command- javac filename.java, here you are calling java compiler to compile the java file
type command- java filename.java to see the output
after compiling the file using javac there is no need to compile it again in vscode even if you change the code, just use 2nd command to run
*/

//Also notice the single line comments (starting with //) and multi-line comments (enclosed in /* */)

//compiling and execution process
//source code(.java) is coverted into Byte code (.class) by the compiler
// this byte code can be run on any OS, thats why java is called portable language
// JVM converts this byte code into native code (native to OS being used) and shows the output