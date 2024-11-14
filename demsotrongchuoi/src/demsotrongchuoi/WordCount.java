package demsotrongchuoi;

public class WordCount {
	public static int countWords(String str) {
        String[] words = str.split("\\s+");  // Tách chuỗi bằng một hoặc nhiều khoảng trắng
        return words.length; // Trả về số lượng từ
    }

    public static void main(String[] args) {
        String input = "Java is fun";
        System.out.println("Number of words: " + countWords(input));  // Kết quả: 3
    }

}
