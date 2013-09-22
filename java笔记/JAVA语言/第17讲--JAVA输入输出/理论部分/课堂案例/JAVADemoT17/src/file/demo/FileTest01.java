package file.demo;

/*
 * �ж��ļ��Ƿ���ڣ��������򴴽���������ɾ��
 */
import java.io.File;

public class FileTest01 {

	public static void main(String[] args) {
		File f = new File("c:/1.txt");
		if (f.exists()) // �ж��ļ��Ƿ����
			f.delete(); // ɾ���ļ�
		else
			try {
				f.createNewFile(); // �������ļ�
			} catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("�ļ����ƣ�" + f.getName());
		System.out.println("�ļ�·����" + f.getPath());
		System.out.println(f.canWrite() ? "�ļ���д" : "�ļ�����д");
		System.out.println(f.isDirectory() ? "��Ŀ¼" : "����Ŀ¼");
		System.out.println("�ļ�����:" + f.length() + "Bytes");
		
		f = new File("E:\\demo");
		System.out.println(f.isDirectory() ? "��Ŀ¼" : "����Ŀ¼");
	}
}
