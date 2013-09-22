package map.xiaoji4;

/*
 * 创建一个BookTest测试类，添加main方法，要求： 
 * 使用HashMap进行存储，键为Book对象的编号，值为Book对象 
 * 通过某一个编号获取Book对象，并打印该Book对象的标题
 */
import java.util.*;

public class BookTest {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// 声明一个HashMap集合
		Map map = new HashMap();
		// 创建三个对象
		Book b1 = new Book("A001", "JAVA基础教程");
		Book b2 = new Book("A002", "JSP应用技术");
		Book b3 = new Book("A003", "数据库");
		// 将三个对象放入集合中
		map.put(b1.getId(), b1);
		map.put(b2.getId(), b2);
		map.put(b3.getId(), b3);
		// 通过键值取出其中一个对象：注意要强制类型转换
		Book book = (Book) map.get("A001");
		// 输出信息
		System.out.println(book);
	}
}
