/*
 * 编写一个音乐类，并编写测试类显示音乐信息：
 * 音乐名称
 * 音乐类型
 */
public class Music {
	String name;//音乐名称
	String type;//音乐类型

	// 显示对象属性的方法
	public void showMessage() {
		System.out.println("音乐名称：" + name + "\t音乐类型：" + type);
	}
	//入口方法，用于创建并使用对象
	public static void main(String[] args) {
		Music m=new Music();
		m.name="双截棍";
		m.type="流行音乐";
		m.showMessage();
	}
}
