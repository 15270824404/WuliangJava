package errordemo;

class Book {
	private String name = "java基础教程";

	public String getAuthor() {
		return "张三";
	}
}

class Media {
	private String name = " media";

	public String getInfo() {
		return name;
	}
}
//电子图书是书的一种，同时又是一种多媒体 
//但是JAVA不支持多继承，一个类只能有一个父类
//所以不能这样实现，要解决这个问题，需要使用到接口
public class MediaBook extends Book , Media {
	private String name = "mediaBook";
}
