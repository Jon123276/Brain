package brain;

import java.util.*;
public class Parser {
	public static List<Integer> parse(String[] ray){
		Scanner a = new Scanner(System.in);
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<String> looping = new ArrayList<String>();
		arr.add(0);
		int counter = 0;
		int ascii = 0;
		boolean loopa = false;
		boolean asc = false;
		for (int i = 0; i < ray.length; i++) {
			switch(ray[i]) {
				case ">":
					if (loopa) {
						looping.add(">");
						break;
					}
					arr.add(0);
					counter++;
					break;
				case "<":
					if (loopa) {
						looping.add("<");
						break;
					}
					if (counter == 0) {
						counter = 1;
					}
					counter--;
					break;
				case "+":
					if (loopa) {
						looping.add("+");
						break;
					}
					arr.set(counter, arr.get(counter)+1);
					break;
				case "-":
					if (loopa) {
						looping.add("-");
						break;
					}
					arr.set(counter, arr.get(counter)-1);
					break;
				case ".":
					if (loopa) {
						looping.add(".");
						break;
					}
					System.out.println(arr.get(counter));
					break;
				case ",":
					if (loopa) {
						looping.add(",");
						break;
					}
					System.out.print("Enter a number: ");
					arr.set(counter, a.nextInt());
					break;
				case "[":
					looping.add("[");
					loopa = true;
					break;
				case "]":
					looping.add("]");
					Looping.loops(arr, looping, counter);
					loopa = false;
				default:
					break;
			}
			if (asc) {
				arr.set(counter, ascii);
			}
		}
		return arr;
	}
}
