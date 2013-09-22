package shangji;

/*
 * 上机作业1
 * 
 * 编写一个类Book，代表教材:
 * 具有属性：名称（title）、页数（pageNum），其中页数不能少于200页，否则输出错误信息，并赋予默认值200
 * 为各属性设置赋值和取值方法
 * 具有方法：detail，用来在控制台输出每本教材的名称和页数
 * 编写测试类BookTest进行测试：为Book对象的属性赋予初始值，并调用Book对象的detail方法，看看输出是否正确
 */
class Book {
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

	// 在控制台输出每本教材的名称和页数
	public void detail() {
		System.out.println("名称：" + this.title + "\n页数：" + this.pageNum);
	}
}

/*
 * 测试类
 */
public class BookTest {

	public static void main(String[] args) {
		Book book = new Book();
		book.setTitle("JAVA基础教程");
		book.setPageNum(377);
		book.detail();
	}
}
