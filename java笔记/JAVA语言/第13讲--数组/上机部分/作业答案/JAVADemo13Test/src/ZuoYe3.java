import java.util.Arrays;

/*
 *  第9讲：数组
 *  上机作业3：
 *    有一列乱序的字符，'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z'，排序并按照英文字母表的逆序输出
 */
public class ZuoYe3 {

	public static void main(String[] args) {
		// 声明数组用于保存提供的字符
		char list[] = { 'a', 'c', 'u', 'b', 'e', 'p', 'f', 'z' };
		// 输出排序前的字符数组
		System.out.println("排序前：");
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		// 使用Arrays的sort方法排序
		Arrays.sort(list);
		// 输出排序后的字符数组
		System.out.println("\n排序后：");
		for (int i = list.length - 1; i >= 0; i--) {
			System.out.print(list[i] + "\t");
		}
	}
}
