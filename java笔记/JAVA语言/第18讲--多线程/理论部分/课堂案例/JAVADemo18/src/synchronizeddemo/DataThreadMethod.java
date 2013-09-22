package synchronizeddemo;
/**
 * 使用同步方法
 * @author ZHT
 *
 */
public class DataThreadMethod extends Thread {

	NewData data;
	String name;

	public DataThreadMethod(NewData data, String name) {
		this.data = data;
		this.name = name;
		start();
	}

	public void run() {
		try {
			while (true) {
				if (data.n > 0) {
					//在run方法中调用被同步的方法
					data.saleTicket(name);
					Thread.sleep(100);
				} else {
					break;
				}
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		System.out.println("同步方法：");
		NewData data = new NewData();
		DataThreadMethod d1 = new DataThreadMethod(data, "售票员1");
		DataThreadMethod d2 = new DataThreadMethod(data, "售票员2");

	}

}