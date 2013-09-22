import java.util.Scanner;

/*
 * 我们先看一个生活中的例子，
 * 还是吃饺子，这次要先吃一个尝一下，
 * 然后问有没有吃饱，如果没有吃饱，
 * 就再吃一个，每吃一个都问有没有吃饱。
 * 对回答进行判断，只要回答的是：“y”，
 * 就不吃了，也就是循环结束；
 * 回答了否：“n”就接着吃，
 * 也就是循环要继续。 
 */
public class HelloWorld12 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//声明变量用于接收用户的输入
		String answer;
		do {
			System.out.println("吃了一个饺子！");
			System.out.print("吃饱了没有？(y/n)：");
			//接收用户输入
			answer = input.next();
			
		} while (!answer.equals("y"));//对用户输入进行判断，不是“y”就循环
		System.out.println("不吃饺子了！");
	}
}
