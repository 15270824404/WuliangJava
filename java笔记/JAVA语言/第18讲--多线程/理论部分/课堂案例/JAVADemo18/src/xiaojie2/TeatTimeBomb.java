package xiaojie2;

import java.util.*;

/*
 * 测试炸弹的类
 */
public class TeatTimeBomb {

	public static void main(String[] args) {
		// 创建一个炸弹对象，创建时，线程会被启动
		TimeBombThread tbt = new TimeBombThread();
		// 接收控制台输入
		Scanner br = new Scanner(System.in);
		String input;

		try {
			while (true) {
				System.out.println("输入quit结束线程：");
				// 接收输入
				input = br.next();
				// 判断是否是quit
				if (input.equals("quit")) {
					tbt.stopThread();// 停止炸弹的线程
					break;// 结束循环
				}
			}
		} catch (Exception e) {
		}
	}

}
