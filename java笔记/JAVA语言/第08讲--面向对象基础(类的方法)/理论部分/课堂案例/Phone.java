/*
 * Phone.java
 * 手机类
 */
public class Phone {
	public void playMusic() {
		System.out.println("正在播放" + downloadMusic());
	}

	public String downloadMusic() {
		return "好汉歌";
	}

	public void chargeCell() {
		Cell cell = new Cell();
		/* 充电时要调用电池类的方法 */
		cell.brand = "iPhone";
		cell.getPower();
	}
}
