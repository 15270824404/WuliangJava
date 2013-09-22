package xiaojie1;
/*
 * 小结1：
 * 编写一个类Book1，代表教材：
 * 具有属性：名称（title）、页数（pageNum）、类型（type）
 * 具有方法：detail，用来在控制台输出每本教材的名称、页数、类型
 * 具有两个带参构造方法：第一个构造方法中，设置教材类型为“计算机”（固定），其余属性的值由参数给定；
 * 第二个构造方法中，所有属性的值都由参数给定
 * 编写测试类Book1Test进行测试：
 * 分别以两种方式完成对两个Book1对象的初始化工作，并分别调用它们的detail方法，看看输出是否正确
 */
class Book {
	// 名称
	private String title;
	// 页数
	private int pageNum;
	// 类型
	private String type;

	/*
	 * 带三个参数的构造函数
	 */
	public Book(String title, int pageNum, String type) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = type;
	}

	/*
	 * 带两个参数的构造函数
	 */
	public Book(String title, int pageNum) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = "计算机";
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	/*
	 * 详细住处的输出方法
	 */
	public void detail() {
		System.out.println("名称：" + this.title + "\n页数：" + this.pageNum
				+ "\n类型：" + this.type);
	}
}

/*
 * 测试类
 */
public class Book1Test {
	public static void main(String[] args) {
		Book book1 = new Book("JAVA基础教程", 377);
		book1.detail();
		Book book2 = new Book("英语", 177, "外语");
		book2.detail();
	}
}