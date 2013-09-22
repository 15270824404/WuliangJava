/**
 * 小结2:现场编程
 */
public class XiaoJie2 {

	public static void main(String[] args) {

		double f; // 华氏
		double c = 0; // 摄氏
		int count = 1; // 条目
		System.out.println("摄氏温度" + "\t华氏温度");
		do {
			f = c * 9 / 5.0 + 32; // 转换
			System.out.println(c + "\t" + f);
			c = c + 20;
			count++;
		} while (count <= 10 && c <= 250);
	
	}

}
