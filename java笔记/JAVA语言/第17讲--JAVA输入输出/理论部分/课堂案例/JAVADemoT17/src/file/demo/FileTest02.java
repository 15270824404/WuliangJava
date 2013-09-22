package file.demo;

/*
 * 创建文件夹
 */
import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File f = new File("d:" + File.separator + "source");
		f.mkdir();
	}
}
