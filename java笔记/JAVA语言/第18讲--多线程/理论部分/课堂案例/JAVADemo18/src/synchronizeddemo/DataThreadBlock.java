package synchronizeddemo;
/**
 * 使用了同步代码块
 * @author ZHT
 *
 */
public class DataThreadBlock extends Thread {

	Data data;
	String name;

	public DataThreadBlock(Data data, String name) {
		this.data = data;
		this.name = name;
		start();
	}

	public void run() {
		try {
			while (true) {
				//同步代码块
				synchronized (data) {
					if (data.n > 0) {
						System.out.println(name + "：" + data.n + "号票！");
						data.n--;
						Thread.sleep(100);
					} else {
						break;
					}
				}
			}
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		System.out.println("同步语句块：");
		Data data = new Data();
		DataThreadBlock d1 = new DataThreadBlock(data, "售票员1");
		DataThreadBlock d2 = new DataThreadBlock(data, "售票员2");
	}

}