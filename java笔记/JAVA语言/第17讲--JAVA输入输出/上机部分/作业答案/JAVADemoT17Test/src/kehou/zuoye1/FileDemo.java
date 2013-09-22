package kehou.zuoye1;

import java.io.*;

/*
 * ��дһ���ࣺFileDemo�� ��Ҫ���д����ʵ�ֹ��ܣ�
 * ����1(mkDir)�������ļ��У��ڱ������Ե�D���ϴ����ļ��У� source
 * ����2(showDir)���г�C�̸�Ŀ¼�������ļ����ļ��е�����
 * ����ڷ����д������󲢵�������������
 * 
 */
public class FileDemo {
	/**
	 * ����1�������ļ��У��ڱ������Ե�D���ϴ����ļ��У� source
	 */
	public void mkDir() {
		File f = new File("d:" + File.separator + "source");
		if (f.mkdir()) {
			System.out.println("Ŀ¼�����ɹ�");
		} else {
			System.out.println("Ŀ¼����ʧ��");
		}
	}

	/**
	 * ����2(showDir)���г�C�̸�Ŀ¼�������ļ����ļ��е�����
	 */
	public void showDir() {
		File f = new File("c:" + File.separator);
		String[] str = f.list(); // ȡ��C����ȫ������
		for (int i = 0; i < str.length; i++) {
			File temp = new File("c:\\" + str[i]);
			// �ж����ļ�����Ŀ¼��Ȼ�����
			String out = (temp.isDirectory() ? "Ŀ¼��" : "�ļ���");
			System.out.println(out + str[i]);
		}
	}

	public static void main(String[] args) {
		FileDemo fd = new FileDemo();
		fd.mkDir();
		fd.showDir();

	}
}
