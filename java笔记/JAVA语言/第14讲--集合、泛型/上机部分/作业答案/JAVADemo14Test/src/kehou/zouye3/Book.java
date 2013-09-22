package kehou.zouye3;

/*
 * 创建一个Book类 
 * 包含属性：id(编号)、title（标题），使用构造方法进行初始化 
 * 重写toString()方法，用以返回Title属性的值 
 * 创建一个BookTest测试类，添加main方法，要求： 
 * 使用HashMap进行存储，键为Book对象的编号，值为Book对象 
 * 通过某一个编号获取Book对象，并打印该Book对象的标题
 */
public class Book {
	private String id;
	private String title;

	@Override
	public String toString() {
		return getTitle();
	}

	public Book(String id, String title) {
		this.id = id;
		this.title = title;
	}

	public Book() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
