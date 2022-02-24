import java.util.*;

public class ProcessAName5026211172 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Siapakah nama anda ?");
        String name = input.nextLine();

        String[] x = name.split(" ");
        String firstname = x[0];
        String lastname = x[1];
        System.out.println(name.indexOf(" "));
        System.out.println(firstname + ", " + lastname.charAt(0) );

    }
}