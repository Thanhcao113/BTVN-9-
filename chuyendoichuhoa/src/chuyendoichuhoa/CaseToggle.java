package chuyendoichuhoa;

public class CaseToggle {
	 public static String toggleCase(String str) {
	        String result = "";
	        for (char ch : str.toCharArray()) {
	            if (Character.isUpperCase(ch)) {
	                result += Character.toLowerCase(ch);
	            } else if (Character.isLowerCase(ch)) {
	                result += Character.toUpperCase(ch);
	            } else {
	                result += ch; // Giữ nguyên nếu không phải chữ cái
	            }
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        String input = "Hello World";
	        System.out.println(toggleCase(input)); // hELLO wORLD
	    }
	}


