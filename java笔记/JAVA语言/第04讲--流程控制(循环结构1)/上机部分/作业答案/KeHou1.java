/**
 * Test.java
 * 上机第4讲：课后作业1：计算100之内偶数之和
 */
public class KeHou1 {
	public static void main(String[] args) {
		int num = 0; //加数
		int sum = 0; //当前之和
		while(num <= 100){  //数字在100以内
			sum = sum + num;  //累加求和
			num = num + 2;    //计算下一个偶数
		}
		System.out.println("100之内的偶数之和是：" + sum);
	}
}
