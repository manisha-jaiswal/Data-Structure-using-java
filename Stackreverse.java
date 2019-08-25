import java.util.*;
 
public class Stackreverse {
   public static void main(String[] args) {
 
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter string: ");
      String str = sc.nextLine();
 
      Stack<Character> stack = new Stack<Character>();
 
      for(int i=0; i<str.length(); i++){
         stack.push(str.charAt(i));
      }
      while(! stack.empty()){
        System.out.print(stack.pop()); 
      }
      System.out.println(""); 
   }
}