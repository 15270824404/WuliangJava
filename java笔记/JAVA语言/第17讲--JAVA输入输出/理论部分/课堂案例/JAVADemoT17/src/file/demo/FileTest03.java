package file.demo;

/*
 * 列出指定目录下的文件
 */
import java.io.File;

public class FileTest03 {

	public static void main(String[] args) {
		File f = new File("c:" + File.separator);
		String[] str = f.list();
		for (int i = 0; i < str.length; i++) {
			File temp = new File("c:\\" + str[i]);
			System.out.print((temp.isDirectory() ? "目录：" : "文件："));
			System.out.println(str[i]);
		}
	}
}
