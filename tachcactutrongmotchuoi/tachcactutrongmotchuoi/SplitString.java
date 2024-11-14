package tachcactutrongmotchuoi;

public class SplitString {
	public static String[] splitWords(String str) {
        return str.split(" "); // Tách chuỗi bằng khoảng trắng
    }

    public static void main(String[] args) {
        String input = "Java is fun";
        String[] words = splitWords(input);
        
        // In từng từ trong mảng
        for (String word : words) {
            System.out.println(word);
        }
    }

}
