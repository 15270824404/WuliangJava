/*
 * 共有1000瓶汽水，
 * 每喝完一瓶后得到一个空瓶子，
 * 每3个空瓶子又能换1瓶汽水，
 * 喝掉后又得到一个空瓶子，
 * 问总共喝多少瓶汽水，最后还剩余多少个空瓶子？
 * 思路2：
 * 1、一次把所有汽水喝完，获得所有空瓶子，再全部换成汽水，
 * 2、然后再一次全部喝完，再获得所有空瓶子，依次类推，直到没有汽水可喝为止
 */
public class Zuoye3_2 {
	public static void main(String[] args) {
		int num = 1000;// 汽水数量
		int drinkNum = 0;// 喝掉的汽水数量
		int emptyNum = 0;// 空瓶子的数量
		// 因为没有明确的次数，所以使用while循环
		while (num > 0) {// 只要有汽水可喝，就循环
			drinkNum += num;// 喝掉所有汽水
			emptyNum += num;// 空瓶子数量等于上次剩余的加上这次喝掉的数量
			num = emptyNum / 3;// 现有空瓶能够兑换的汽水数量
			emptyNum -= num * 3;// 兑换后剩余的空瓶子数量
		}
		// 循环结束后，就得到喝掉多少汽水及剩下的空瓶数
		System.out.println("总共喝掉汽水：" + drinkNum + "瓶！");
		System.out.println("剩余空瓶子数：" + emptyNum + "个！");
	}
}
