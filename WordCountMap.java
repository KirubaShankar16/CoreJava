package jan22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCountMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		Scanner scan = new Scanner(System.in);
		String choice, input, arr[];
		int l;
		do {
			System.out.println("Enter the sentence: ");
			input = scan.nextLine();
			map.clear();
			arr = input.toLowerCase().split(" ", 0);
			for(int i=0; i < arr.length; i++) {
				if(map.containsKey(arr[i])) {
					l = map.get(arr[i]);
					l++;
					map.replace(arr[i], l);
				}
				else {
					map.put(arr[i], 1);
				}
			}
			System.out.println(map);
			System.out.println("Enter y if you want to continue: ");
			choice = scan.nextLine();
		}while( choice.equals("y"));
		
	}
}
