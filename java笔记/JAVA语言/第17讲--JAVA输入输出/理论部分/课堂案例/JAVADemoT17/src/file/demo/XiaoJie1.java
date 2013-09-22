package file.demo;

import java.io.*;

/*
 * С��1
 * ��д���룺
 * ��ʾĳ���ļ����µ������ļ����ļ���
 * ɾ��ĳ���ļ����������ļ����ļ���
 * ˼·��
 * ��һ�����⣺
 * �����ǰ���ƣ��жϵ�ǰFile�������ļ������ļ��У�
 * ������ļ��У�����ʾ���ļ����µ������ļ����ļ��У����õݹ鷽��ʵ��
 * 
 * �ڶ������⣺
 * �ж����ļ������ļ��У�������ļ���ֱ��ɾ����
 * ������ļ��У���ɾ�����ļ������������ļ������ļ��У�
 * ͬ��ʹ�õݹ���ô˷��������������ļ������ļ���
 */
public class XiaoJie1 {
	public static void main(String[] args) {
		XiaoJie1.deleteAllFile(new File("f:/textfile"));
	}

	/**
	 * 
	 * @param f
	 *            Ҫ��ʾ���ļ����ļ���
	 */
	public static void printAllFile(File f) {
		// ��ӡ��ǰ�ļ���
		System.out.println(f.getName());
		// �ж��Ƿ����ļ���
		if (f.isDirectory()) {
			// ������ļ��У���ȡ������ļ�������������
			File[] files = f.listFiles();
			// ѭ����������ļ��е�����
			for (int i = 0; i < files.length; i++) {
				// �ݹ���ã������Լ��������
				printAllFile(files[i]);
			}
		}
	}

	/**
	 * 
	 * @param f
	 *            Ҫɾ�����ļ����ļ���
	 */
	public static void deleteAllFile(File f) {
		// ������ļ���ֱ��ɾ��
		if (f.isFile()) {
			f.delete();
		} else {
			// ������ļ��о��ٴ���
			File[] files = f.listFiles();
			for (int i = 0; i < files.length; i++) {
				// �ݹ鴦��
				deleteAllFile(files[i]);
			}
			// ���ļ��У�ɾ���Լ�
			f.delete();
		}
	}
}
