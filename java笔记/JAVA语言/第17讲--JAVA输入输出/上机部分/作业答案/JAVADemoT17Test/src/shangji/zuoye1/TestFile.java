package shangji.zuoye1;

import java.io.*;

/*
 * �ϻ���ҵ1��
 * ��дһ���ࣺTestFile��Ҫ���д����ʵ�ֹ��ܣ�
 * �жϱ������Ե�C�����Ƿ�����ļ�1.txt
 * �������򴴽���������ɾ��
 * ����ļ������ƺ�·��
 * �ж��ļ��Ƿ��д
 * �ж��ṩ���ļ����ǲ���Ŀ¼
 * ��ʾ�ļ��ĳ���
 */
public class TestFile {
	public static void main(String[] args) throws IOException {
		// ʹ����Ҫ�жϵ��ļ���·���������ļ�����
		File f = new File("C:/1.txt");
		// �ж��ļ��Ƿ����
		if (f.exists()) {
			f.delete();// ���ھ�ɾ��
		} else {
			f.createNewFile();// �����ھʹ������ļ�
		}
		// getName()�������ڻ�ȡ�ļ�����
		System.out.println("�ļ����ƣ�" + f.getName());
		// getPath()�������ڻ�ȡ�ļ�·��
		System.out.println("�ļ�·����" + f.getPath());
		// canWrite()���������ж��ļ��Ƿ��д���������true����ʾ�ļ���д
		System.out.println(f.canWrite() ? "�ļ���д" : "�ļ�����д");
		// isDirectory()���������ж��ļ��Ƿ���Ŀ¼���������true����ʾ����һ��Ŀ¼�������ļ�
		System.out.println(f.isDirectory() ? "��Ŀ¼" : "����Ŀ¼");
		// length()�������ڻ�ȡ�ļ�����
		System.out.println("�ļ����ȣ�" + f.length() + "�ֽ�");
	}
}
