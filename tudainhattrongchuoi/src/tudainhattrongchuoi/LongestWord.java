package tudainhattrongchuoi;

public class LongestWord {
	 public static String findLongestWord(String str) {
	        String[] words = str.split("\\s+"); // Tách chuỗi thành mảng từ
	        String longest = ""; // Khởi tạo biến chứa từ dài nhất

	        for (String word : words) {
	            if (word.length() > longest.length()) {
	                longest = word; // Cập nhật từ dài nhất
	            }
	        }
	        return longest;
	    }

	    public static void main(String[] args) {
	        String input = "I love programming";
	        System.out.println("Longest word: " + findLongestWord(input)); // Kết quả: "programming"
	    }

}
