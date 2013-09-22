/*
 * 小结2
 * 
 * 编写一个类Book2，代表教材：
 * 具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
 * 具有方法：detail，用来在控制台输出每本教材的名称和页数
 * 具有带参数的构造方法：用来完成对象的初始化工作，并在构造方法中完成对页数的最小值限制
 * 编写测试类Book2Test进行测试：初始化一个Book2对象，并调用该Book2对象的detail方法，看看输出是否正确
 */
class Book2 {
	// 名称
	private String title;
	// 页数
	private int pageNum = 200;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageNum() {
		return pageNum;
	}

	//通过封装，限制页数必须大于200
	public void setPageNum(int pageNum) {
		if (pageNum < 200) {
			this.pageNum = 200;
		} else {
			this.pageNum = pageNum;
		}
	}

	//带参数的构造函数
	public Book2(String title, int pageNum) {
		this.title = title;
		setPageNum(pageNum);
	}

	// 在控制台输出每本教材的名称和页数
	public void detail() {
		System.out.println("名称：" + this.title + "\n页数：" + this.pageNum);
	}
}
/*
 * 测试类
 */
public class Book2Test {
	public static void main(String[] args) {
		Book2 book = new Book2("JAVA基础教程",377);
		book.detail();
	}
}
