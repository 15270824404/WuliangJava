package file.demo;

/*
 * �г�ָ��Ŀ¼�µ��ļ�
 */
import java.io.File;

public class FileTest03 {

	public static void main(String[] args) {
		File f = new File("c:" + File.separator);
		String[] str = f.list();
		for (int i = 0; i < str.length; i++) {
			File temp = new File("c:\\" + str[i]);
			System.out.print((temp.isDirectory() ? "Ŀ¼��" : "�ļ���"));
			System.out.println(str[i]);
		}
	}
}
