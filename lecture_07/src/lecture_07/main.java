package lecture_07;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class main {

	public static void main(String[] args) {
		 ArrayList<String> friends = new ArrayList<>();
		 friends.add("nam");
		 friends.add("an");
		 friends.add("bình");
		 friends.add("hoà");
		 friends.add("tuấn");
		 System.out.println("danh sách bạn bè:"+ friends);
		 
		 ArrayList<Integer>numbers = new ArrayList<>();
		 for(int i = 1; i <= 10; i++) {
			 numbers.add(i);
		 }
		 numbers.remove(Integer.valueOf(5));
		 System.out.println("danh sách sau khi xóa số 5"+ numbers);
		 
		 ArrayList<String>cities = new ArrayList<>();
		 cities.add("hà nội");
		 cities.add("hải phòng");
		 cities.add("hội an");
		 cities.add("huế");
		 cities.add("đà nẵng");
		 System.out.println("danh sách thành phố");
		 for(String city:cities) {
			 System.out.print(city);
		 }
		 ArrayList<String> keywords = new ArrayList<>();
		 keywords.add("java");
		 keywords.add("python");
		 keywords.add("c++");
		 keywords.add("javascript");
		 System.out.println("python có trong danh sách không?"+keywords.contains("python"));
		 
		 ArrayList<Integer>nums = new ArrayList<>();
		 for(int i = 1; i <=5; i++) {
			 nums.add(i);
		 }
		 nums.set(2, 100);
		 System.out.println("danh sách sau khi cập nhập phần từ thứ 3"+ nums);
		 
		 ArrayList<Integer> unsortednums = new ArrayList<>();
		 unsortednums.add(5);
		 unsortednums.add(2);
		 unsortednums.add(4);
		 unsortednums.add(8);
		 unsortednums.add(3);
		 Collections.sort(unsortednums);
		 System.out.println("danh sách sau khi xắp xếp"+ unsortednums);
		 
		 ArrayList<Integer> arrayListtoconvert = new ArrayList<>();
		 arrayListtoconvert.add(1);
		 arrayListtoconvert.add(2);
		 arrayListtoconvert.add(3);
		 arrayListtoconvert.add(4);
		 arrayListtoconvert.add(5);
		 Integer[] array = arrayListtoconvert.toArray(new Integer[0]);
		 System.out.println("mảng sau khi chuyển đổi");
		 for(Integer num : array) {
			 System.out.print(num);
		 }		 	 		 		 		 		 		 		 		 					

	}

}
