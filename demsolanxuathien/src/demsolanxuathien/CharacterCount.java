package demsolanxuathien;

public class CharacterCount {
	public static int countOccurrences(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++; // Tăng biến đếm mỗi khi gặp ký tự cần tìm
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "hello world";
        char characterToFind = 'o';
        System.out.println("Occurrences of '" + characterToFind + "': " + countOccurrences(input, characterToFind)); // Kết quả: 2
    }

}
