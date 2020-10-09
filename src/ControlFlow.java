public class ControlFlow {
    public static void main(String[] args) throws Exception {
        /*
        *** Question #1 ***

        int k = 80;

        for (int i = 0; i < 5; i++) {
            k = k - 12;
        }
        
        The for loop adds 1 to i until it reaches 4.
        So, the calculations for each iteration are as follows:
            i = 0: k = 80 - 12 = 68
            i = 1: k = 68 - 12 = 56
            i = 2: k = 56 - 12 = 44
            i = 3: k = 44 - 12 = 32
            i = 4: k = 32 - 12 = 20
        C. The value of k after the for loop is 20. 
        */

        /*** Question #2 ***/
        int asteriskNum = 1; // variable determining how many asterisks will print
        // 1st for loop determines the line printing
        for (int i = 0; i < 5; i++) {
            // 2nd (nested) loop determines number of asterisks printed,
            // determined by starNum variable
            for (int j = 0; j < asteriskNum; j++) {
                System.out.print("*"); // Print asterisk on the same line
            }
            System.out.println(); // Move to next line
            System.out.println(); // Empty space between star lines
            asteriskNum++; // Increase asterisk number variable by 1
        }
    }
}
