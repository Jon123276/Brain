package brain;

import java.util.*;

public class Looping {
	public static ArrayList<Integer> loops(ArrayList<Integer> ray, ArrayList<String> first, int counter){
		Scanner a = new Scanner(System.in);
		ArrayList<Integer> arr = ray;
		int count = counter;
		while (ray.get(count) != 0) {
			for (int i = 1; i < first.size()-1; i++) {
				switch(first.get(i)) {
					case ">":
						arr.add(0);
						count++;
						break;
					case "<":
						counter--;
						break;
					case "+":
						arr.set(count, arr.get(count)+1);
						break;
					case "-":
						arr.set(count, arr.get(count)-1);
						break;
					case ".":
						System.out.println(arr.get(count));
						break;
					case ",":
						System.out.print("Enter a number: ");
						arr.set(count, a.nextInt());
						break;
				}
				
			}
		}
			
		return arr;
	}
}
