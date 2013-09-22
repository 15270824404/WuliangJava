package lang.stringbuffer;

/*
 * insert()方法：将字符串插入此字符序列中
 */
public class TestInsert {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ZTE");
		sb.insert(2, "123");
		System.out.println(sb);
	}
}
