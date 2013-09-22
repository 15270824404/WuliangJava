package shangji.zuoye1;

import java.io.*;

/*
 * 上机作业1：
 * 编写一个类：TestFile，要求编写方法实现功能：
 * 判断本机电脑的C盘上是否存在文件1.txt
 * 不存在则创建，存在则删除
 * 输出文件的名称和路径
 * 判断文件是否可写
 * 判断提供的文件名是不是目录
 * 显示文件的长度
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		// 使用需要判断的文件及路径来创建文件对象
		File f = new File("C:/1.txt");
		// 判断文件是否存在
		if (f.exists()) {
			f.delete();// 存在就删除
		} else {
			f.createNewFile();// 不存在就创建新文件
		}
		// getName()方法用于获取文件名称
		System.out.println("文件名称：" + f.getName());
		// getPath()方法用于获取文件路径
		System.out.println("文件路径：" + f.getPath());
		// canWrite()方法用于判断文件是否可写，如果返回true，表示文件可写
		System.out.println(f.canWrite() ? "文件可写" : "文件不可写");
		// isDirectory()方法用于判断文件是否是目录，如果返回true，表示这是一个目录，不是文件
		System.out.println(f.isDirectory() ? "是目录" : "不是目录");
		// length()方法用于获取文件长度
		System.out.println("文件长度：" + f.length() + "字节");
	}
}
