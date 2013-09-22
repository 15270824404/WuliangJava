

/*
 * 第13讲：数组
 * 小结3：
 *    小明要去买一部手机，他询问了4家店的价格，
 *    分别是2800元，2900元，2750元和3100元，显示输出最低价
 */
public class XiaoJie3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] list = { 2800, 2900, 2750, 3100 };
		int min = list[0]; // 存储最小值
		for (int i = 0; i < list.length; i++) {
			if (min > list[i]) {
				min = list[i]; // 交换
			}
		}
		System.out.println("价格最低的是：" + min);
	}
}
