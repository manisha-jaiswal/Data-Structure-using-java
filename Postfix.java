import java.util.*;

public class Postfix {
    public static void main(String[] args) {
        System.out.println(postfixEvaluate("1 2 +"));               // 3
        System.out.println(postfixEvaluate("1 2 3 * + 4 +"));       // 11
        System.out.println(postfixEvaluate("5 2 4 * + 7 -"));       // 6
        System.out.println(postfixEvaluate("2 3 + 4 5 * +"));       // 25
        System.out.println(postfixEvaluate("8 5 * 7 4 2 + * +"));   // 82
        System.out.println(postfixEvaluate("6 8 2 / 1 - *"));       // 18
    }
    
    // Evaluates the given postfix expression string and returns the result.
    // Precondition: expression consists only of integers, +-*/, and spaces in
    //               proper postfix format such as "2 3 - 4 *"
    public static int postfixEvaluate(String exp) {
	 	
		Scanner tokens = new Scanner(exp);
		
		while (tokens.hasNext()) {
			if (tokens.hasNextInt()) {
				s.push(tokens.nextInt());
			} else {
				int num2 = s.pop();
				int num1 = s.pop();
				String op = tokens.next();
				
				if (op.equals("+")) {
					s.push(num1 + num2);
				} else if (op.equals("-")) {
					s.push(num1 - num2);
				} else if (op.equals("*")) {
					s.push(num1 * num2);
				} else {
					s.push(num1 / num2);
				}
				
			//  "+", "-", "*", "/"
			}
		}
		return s.pop();
    }
}


