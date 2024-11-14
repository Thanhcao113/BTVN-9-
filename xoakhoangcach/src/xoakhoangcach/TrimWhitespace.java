package xoakhoangcach;

public class TrimWhitespace {
	public static String removeExtraSpaces(String str) {
        return str.trim().replaceAll("\\s+", " "); // Xóa khoảng trắng ở đầu, cuối và thay thế khoảng trắng liên tiếp thành một khoảng trắng
    }

    public static void main(String[] args) {
        String input = "   Hello   World   ";
        System.out.println("Original: '" + input + "'");
        System.out.println("Trimmed: '" + removeExtraSpaces(input) + "'");
    }

}
