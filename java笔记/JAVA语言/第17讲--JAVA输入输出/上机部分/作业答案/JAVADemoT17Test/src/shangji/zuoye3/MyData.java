package shangji.zuoye3;

/*
 * 用一个类（MyData）模拟需要存储到文件中的数据 这个类有四种数据：
 * boolean、int、String、短整形数组
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
