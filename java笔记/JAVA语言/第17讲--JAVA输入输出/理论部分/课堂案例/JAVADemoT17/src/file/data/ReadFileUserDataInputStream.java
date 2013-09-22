package file.data;

import java.io.*;

/*
 *ʹ��DataInputSteam ��ȡ�Զ����ʽ���ļ����� 
 * @author ZHT
 *
 */
public class ReadFileUserDataInputStream {
	public static void main(String[] args) {
		MyData data = readFile();
		// �ڿ���̨�����ȡ������
		System.out.println(data.b);
		System.out.println(data.n);
		System.out.println(data.s);
		for (int i = 0; i < data.sh.length; i++) {
			System.out.print(data.sh[i] + "\t");
		}
	}

	public static MyData readFile() {
		MyData data = new MyData();
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			// �������ڴӴ��̶�ȡ�ļ�������������
			fis = new FileInputStream("test.my");
			// ����������������������������Ƕ�ף���ʵ�����л�ȡ���ݣ�
			dis = new DataInputStream(fis);
			data.b = dis.readBoolean();
			data.n = dis.readInt();
			data.s = dis.readUTF();
			// ��ȡ����ŵ�����ĳ���
			int len = dis.readInt();
			data.sh = new short[len];// ʵ�������飬�Ա��������
			for (int i = 0; i < len; i++) {
				data.sh[i] = dis.readShort();
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return data;
	}
}
