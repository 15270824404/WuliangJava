package file.demo;

import java.io.*;

/*
 * 小结1
 * 编写代码：
 * 显示某个文件夹下的所有文件和文件夹
 * 删除某个文件夹下所有文件和文件夹
 * 思路：
 * 第一个问题：
 * 输出当前名称，判断当前File对象是文件还是文件夹，
 * 如果是文件夹，则显示此文件夹下的所有文件和文件夹，再用递归方法实现
 * 
 * 第二个问题：
 * 判断是文件还是文件夹，如果是文件则直接删除，
 * 如果是文件夹，则删除此文件夹下所有子文件和子文件夹，
 * 同样使用递归调用此方法处理所有子文件和子文件夹
 */
public class XiaoJie1 {
	public static void main(String[] args) {
		XiaoJie1.deleteAllFile(new File("f:/textfile"));
	}

	/**
	 * 
	 * @param f
	 *            要显示的文件或文件夹
	 */
	public static void printAllFile(File f) {
		// 打印当前文件名
		System.out.println(f.getName());
		// 判断是否是文件夹
		if (f.isDirectory()) {
			// 如果是文件夹，就取出这个文件夹下所有内容
			File[] files = f.listFiles();
			// 循环处理这个文件夹的内容
			for (int i = 0; i < files.length; i++) {
				// 递归调用：调用自己这个方法
				printAllFile(files[i]);
			}
		}
	}

	/**
	 * 
	 * @param f
	 *            要删除的文件或文件夹
	 */
	public static void deleteAllFile(File f) {
		// 如果是文件就直接删除
		if (f.isFile()) {
			f.delete();
		} else {
			// 如果是文件夹就再处理
			File[] files = f.listFiles();
			for (int i = 0; i < files.length; i++) {
				// 递归处理
				deleteAllFile(files[i]);
			}
			// 是文件夹，删除自己
			f.delete();
		}
	}
}
