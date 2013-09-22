package kehou.zuoye1;

import java.io.*;

/*
 * 编写一个类：FileDemo， ，要求编写方法实现功能：
 * 方法1(mkDir)：创建文件夹：在本机电脑的D盘上创建文件夹： source
 * 方法2(showDir)：列出C盘根目录下所有文件和文件夹的名字
 * 在入口方法中创建对象并调用这两个方法
 * 
 */
public class FileDemo {
	/**
	 * 方法1：创建文件夹：在本机电脑的D盘上创建文件夹： source
	 */
	public void mkDir() {
		File f = new File("d:" + File.separator + "source");
		if (f.mkdir()) {
			System.out.println("目录创建成功");
		} else {
			System.out.println("目录创建失败");
		}
	}

	/**
	 * 方法2(showDir)：列出C盘根目录下所有文件和文件夹的名字
	 */
	public void showDir() {
		File f = new File("c:" + File.separator);
		String[] str = f.list(); // 取出C盘下全部内容
		for (int i = 0; i < str.length; i++) {
			File temp = new File("c:\\" + str[i]);
			// 判断是文件还是目录，然后输出
			String out = (temp.isDirectory() ? "目录：" : "文件：");
			System.out.println(out + str[i]);
		}
	}

	public static void main(String[] args) {
		FileDemo fd = new FileDemo();
		fd.mkDir();
		fd.showDir();

	}
}
