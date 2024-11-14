package daonguocchuoi;

public class ReverseString {
	public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "hello";
        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reverse(input));
    }
}

