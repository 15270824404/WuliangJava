package synchronizeddemo;

/**
 * 包含同步方法的类
 * 
 * @author ZHT
 * 
 */
public class NewData {
	int n;

	public NewData() {
		n = 5;
	}

	// 同步方法
	public synchronized void saleTicket(String name) {
		if (n <= 0)
			return;
		System.out.println(name + "：" + n + "号票！");
		n--;
	}
}
