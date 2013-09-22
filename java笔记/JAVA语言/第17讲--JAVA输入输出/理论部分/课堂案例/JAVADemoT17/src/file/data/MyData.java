package file.data;

/*
 * 模拟需要存储到文件中的数据
 * 该类中保存4种类型的数据
 */
public class MyData {
	boolean b;
	int n;
	String s;
	short sh[];// 短整形

	public MyData() {
	}

	public MyData(boolean b, int n, String s, short[] sh) {
		this.b = b;
		this.n = n;
		this.s = s;
		this.sh = sh;
	}

}
