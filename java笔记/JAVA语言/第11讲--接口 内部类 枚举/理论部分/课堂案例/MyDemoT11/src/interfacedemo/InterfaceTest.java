package interfacedemo;

/*
 * 摄像头类不仅实现了其自身摄像的功能，还实现了USB接口
 */
class Camera implements USB {
	public void start() {
		System.out.println("开始摄像...");
	}

	public void stop() {
		System.out.println("停止摄像！");
	}
}

/*
 * 打印机类不仅实现了其自身打印的功能，还实现了USB接口
 */
class Printer implements USB {
	public void start() {
		System.out.println("开始打印...");
	}

	public void stop() {
		System.out.println("停止打印！");
	}
}
/*
 * 测试接口
 */
public class InterfaceTest {
	public static void main(String[] args) {
		USB camera = new Camera();
		USB printer = new Printer();
		camera.start();
		printer.start();
	}
}
