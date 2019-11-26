import java.util.*;
public class prefixTopost{
	static boolean check(char x) {
		switch (x) {
		case '+':
		case '-':
		case '*':
		case '/':
		case '^':
			return true;
		}
		return false;
	}
	static String preToPost(String str) {
		Stack<String> stack=new Stack<String>();
		int len=str.length();
		for(int i=len-1;i>=0;i--) {
			if(check(str.charAt(i))) {
				String a=stack.pop();
				String b=stack.pop();
				String z=a+b+str.charAt(i);
				stack.push(z);
			}

		else
		{
			stack.push(str.charAt(i)+"");
		}
		}

	return stack.pop();

}
 
	public static void main(String x[])
	{
		String str="*-A/BC-/AKL";
		System.out.println("Prefix: "+preToPost(str));
	}
}
