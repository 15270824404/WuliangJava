package file.data;

import java.io.*;

/*
 * ʹ��DataOutputStream��д����һ����ʽ���ļ�
 */
public class WriteFileUserDataOutputStream {
	public static void main(String[] args) {
		short sh[] = { 1, 3, 134, 12 };
		MyData data = new MyData(true, 100, "JAVA����", sh);
		writeFile(data);
	}

	/**
	 * ��MyData������һ����ʽд���ļ���
	 * 
	 * @param data
	 *            ���ݶ���
	 */
	public static void writeFile(MyData data) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			// �������ڽ��ļ�д����̵����������
			fos = new FileOutputStream("test.my");
			// ���ļ�������Ļ����Ͻ������������������������Ƕ��
			dos = new DataOutputStream(fos);
			// ����д������
			dos.writeBoolean(data.b);
			dos.writeInt(data.n);
			dos.writeUTF(data.s);
			// д������
			int len = data.sh.length;
			dos.writeInt(len);// ������ĳ�����д���ļ�
			// Ȼ������д������Ԫ��
			for (int i = 0; i < len; i++) {
				dos.writeShort(data.sh[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();// �ر�װ��������
				fos.close();// �ر��ļ�������
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
