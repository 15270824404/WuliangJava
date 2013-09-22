

import java.util.Arrays;

/*
 *  第12讲：数组
 *  小结4：
 *    有一列乱序的字符，'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'，排序并按照英文字母表的逆序输出
 */
public class XiaoJie4 {

	public static void main(String[] args) {
		char list[] = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		System.out.println("排序前：");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		// 排序
		Arrays.sort(list);
		System.out.println("\n排序后：");
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.print(list[i] + "\t");
		}

	}

}
