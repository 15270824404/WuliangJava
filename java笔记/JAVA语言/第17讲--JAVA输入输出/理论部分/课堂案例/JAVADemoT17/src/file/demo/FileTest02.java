package file.demo;

/*
 * �����ļ���
 */
import java.io.File;

public class FileTest02 {
	public static void main(String[] args) {
		File f = new File("d:" + File.separator + "source");
		f.mkdir();
	}
}
