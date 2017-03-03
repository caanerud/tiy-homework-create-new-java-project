import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by chrisaanerud on 3/2/17.
 */
public class Main {

    public static void main(String[] args) {

        int grade1 = 90;
        int grade2 = 91;
        int grade3 = 92;
        int grade4 = 93;
        int grade5 = 94;
        int grade6 = 95;
        int grade7 = 96;
        int grade8 = 97;
        int grade9 = 98;
        int grade10 = 99;
                double version1 = 1.1;
                double version2 = 1.2;
                double version3 = 1.3;


        // add two integers together and then prints out the answer on its own line
        System.out.println(5 + 4);
        // subtracts two integers and then prints out the answer on a separate line
        System.out.println(9 - 1);
        //multiplies two integers and then prints out the answer on a separate line
        System.out.println(1 * 0);
        // finds the remainder of two assigned variables and prints it out on its own line
        System.out.println(grade1 % grade2);
        //takes my variable named "grade10" and divides it by another variable named "grade8" and then prints the answer on its own line
        System.out.println(grade10 / grade8);
        //prints the word hello followed by a space followed by the word everyone; the + sign is the operator
        System.out.println("hello" + " " + "everyone");
        //these are double variables since they are pointing to numbers that have decimals; the variable 'version1' is being divided by the variable 'version2'
        System.out.println(version1 / version2);
        //adds each variable from left to right since they are inside the parentheses and then divides by 10 and prints
        System.out.println((grade1 + grade2 + grade3 + grade4 + grade5 + grade6 + grade7 + grade8 + grade9 + grade10) / 10);
        //concatenates text in quotes with a number thanks to the addition operator after the second double quote and then prints it
        System.out.println("you are a perfect " + 10);
        //boolean statement that prints 'true' because 12 is in fact greater than 5
        System.out.println(12 > 5);
    }


}
