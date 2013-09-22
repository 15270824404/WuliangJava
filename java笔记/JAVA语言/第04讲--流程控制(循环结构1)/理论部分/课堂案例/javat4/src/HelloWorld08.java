import java.util.Scanner;

/*
 * 还是吃饺子，不过这次可以随便吃，
 * 只不过每吃一个就要问一下，还要不要吃下一个，
 * 如果要吃，就再吃一个，
 * 就这样循环，直到不想吃才停下来
 * HelloWorld08.java
 */

public class HelloWorld08 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("要不要吃饺子：");
		String answer = input.next();
		while (answer.equals("y")) {
			System.out.println("吃饺子。");
			System.out.print("还吃饺子么？(y/n)");
			answer = input.next();
		}
	}

}
