import java.util.*;

public class Huiwen {
	public static void main(String[] args) {
		int val, r_digit;
		Scanner input = new Scanner(System.in);
		System.out.print("请输入一个整数: ");
		val = input.nextInt();
		System.out.print("反转后的整数是：");
		while (val != 0) {
			r_digit = val % 10;
			System.out.print(r_digit);
			val = val / 10;
		}
	}

}
