package brain;

import java.util.ArrayList;
import java.util.Arrays;

public class BrainRunner {

	public static void main(String[] args) {
		
		//System.out.print(Arrays.toString("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.".split(" ")));
		System.out.print(Parser.parse("++++++++[>++++[>++>+++>+++>+<<<<-]>+>+>->>+[<]<-]>>.>---.+++++++..+++.>>.<-.<.+++.------.--------.>>+.>++.".split("")));
		//System.out.print(Parser.parse(Arrays.asList("[", ">", "+", "]")));

	}

}
