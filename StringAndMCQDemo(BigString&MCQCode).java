import java.util.Scanner;

public class StringAndMCQDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example string
        String geeg = "Bunny.ok83838";
        System.out.println("Given string: " + geeg);

        // Length of the string
        int length = geeg.length(); // length gives the number of characters
        System.out.println("Length of string: " + length);

        // Check if next input is integer
        System.out.println("Enter a number to check if it is an integer:");
        boolean isInt = sc.hasNextInt();
        System.out.println("Is integer? " + isInt);

        // String to lower case
        String lower = geeg.toLowerCase(); // converts string to lower case
        System.out.println("Lower case: " + lower);

        // String to upper case
        String upper = geeg.toUpperCase(); // converts string to upper case
        System.out.println("Upper case: " + upper);

        // Trim and substring examples
        String de = "bunny ka bazp.   ";
        String trimmed = de.trim(); // removes leading/trailing spaces
        System.out.println("Trimmed: " + trimmed);

        String subFrom9 = trimmed.substring(9); // substring from index 9 to end
        System.out.println("Substring from index 9: " + subFrom9);

        String sub9to12 = trimmed.substring(9, 12); // substring index 9 to 11
        System.out.println("Substring index 9 to 12: " + sub9to12);

        // Replace example
        System.out.println("Replace 'n' with 't': " + de.replace('n', 't'));

        // StartsWith example
        System.out.println("Starts with 'bunn'? " + de.startsWith("bunn"));

        // Character at index
        System.out.println("Character at index 1: " + de.charAt(1));

        // Trim example with spaces
        String sl = "    res       ";
        String fe = sl.trim();
        System.out.println("Trimmed '    res       ': " + fe);

        // Index examples
        String d = "hheehheeeheeeheheheehh";
        System.out.println("Index of 'h': " + d.indexOf("h"));
        System.out.println("Index of 'e': " + d.indexOf("e"));
        System.out.println("Index of 'heh' starting from 5: " + d.indexOf("heh", 5));
        System.out.println("Last index of 'eh': " + d.lastIndexOf("eh"));
        System.out.println("Last index of 'eeh' within first 5 chars: " + d.lastIndexOf("eeh", 4));

        // MCQ Example
        System.out.println("\nQuestion no.1: What is idly?");
        System.out.println("[a]. Living thing");
        System.out.println("[b]. Non-living thing");
        System.out.println("[c]. Food");
        System.out.println("[d]. A vehicle");
        System.out.println("Enter answer:");
        String answer = sc.nextLine();

        System.out.println("Analysing answer...");
        System.out.println("Exact match (case-sensitive): " + answer.equals("c"));
        System.out.println("Match ignoring case: " + answer.equalsIgnoreCase("c"));
    }
}