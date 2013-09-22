package shangji.zuoye1;

/*
 * 编写一个类Book1，代表教材：
 * 具有属性：名称（title）、页数（pageNum）、类型（type）
 * 具有方法：detail，用来在控制台输出每本教材的名称、页数、类型
 * 具有两个带参构造方法：
 * 第一个构造方法中，设置教材类型为“计算机”（固定），其余属性的值由参数给定；
 * 第二个构造方法中，所有属性的值都由参数给定
 * 
 */
public class Book1 {
	private String title;
	private int pageNum;
	private String type;

	/*
	 * 用来在控制台输出每本教材的名称、页数、类型
	 */
	public void detail() {
		System.out
				.println("教材名称：" + title + "\t页数：" + pageNum + "\t类型：" + type);
	}

	/*
	 * 构造方法中，设置教材类型为“计算机”（固定），其余属性的值由参数给定
	 */
	public Book1(String title, int pageNum) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = "计算机";
	}

	/*
	 * 构造方法中，所有属性的值都由参数给定
	 */
	public Book1(String title, int pageNum, String type) {
		this.title = title;
		this.pageNum = pageNum;
		this.type = type;
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

}
