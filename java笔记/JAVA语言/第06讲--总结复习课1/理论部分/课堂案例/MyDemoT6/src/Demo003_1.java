/*
 * 共有1000瓶汽水，
 * 每喝完一瓶后得到一个空瓶子，
 * 每3个空瓶子又能换1瓶汽水，
 * 喝掉后又得到一个空瓶子，
 * 问总共喝多少瓶汽水，最后还剩余多少个空瓶子？
 * 思路1：
 * 1、每次喝一瓶，每有三个空瓶子就去换一瓶新的汽水（汽水数量加1），直到最后没有汽水为止
 * 2、在程序中记忆汽水的数量和空瓶的数量即可
 */
public class Demo003_1 {
	public static void main(String[] args) {
		int num = 1000;// 汽水数量
		int drinkNum = 0;// 喝掉的汽水数量
		int emptyNum = 0;// 空瓶子的数量
		// 因为没有明确的次数，所以使用while循环
		while (num > 0) {// 只要有汽水可喝，就循环
			num--;// 喝掉一瓶
			emptyNum++;// 空瓶子数量增加1;
			drinkNum++;// 记录喝掉汽水的总数量
			if (emptyNum % 3 == 0) {// 只要有三个空瓶子，就去换一瓶汽水，让汽水数量加1
				num++;// 让汽水数量加1
				emptyNum = 0;// 空瓶子数量清零
			}
		}
		// 循环结束后，就得到喝掉多少汽水及剩下的空瓶数
		System.out.println("总共喝掉汽水：" + drinkNum + "瓶！");
		System.out.println("剩余空瓶子数：" + emptyNum + "个！");
	}
}
