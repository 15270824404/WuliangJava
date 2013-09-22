package shangji.zuoye3;

import java.io.*;

/*
 * �ڶ�д�ļ�����(ReadAndWriter)�д���������
 * ����1(writerFile)������������Ķ���Ȼ�󽫶��������λ��D�̸�Ŀ¼�Ĵ����ļ���test.my��
 * ����2(readerFile)����ȡ���ļ�test.my�е����ݣ���ʾ�ڿ���̨
 * Ҫ��ʹ��װ����DataInputStream��DataOutputStream�����
 */
public class ReadAndWriter {

	/**
	 * ����1(writerFile)������������Ķ���Ȼ�󽫶��������λ��D�̸�Ŀ¼�Ĵ����ļ���test.my��
	 * 
	 * @param data
	 */
	public static void writerFile(MyData data) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			// �������ڽ��ļ�д����̵����������
			fos = new FileOutputStream("test.my");
			// ���ļ�������Ļ����Ͻ������������������������Ƕ��
			dos = new DataOutputStream(fos);
			dos.writeBoolean(data.b); // ����д������
			dos.writeInt(data.n);
			dos.writeUTF(data.s);
			int len = data.sh.length; // д������
			dos.writeInt(len); // ������ĳ�����д���ļ�
			// Ȼ������д������Ԫ��
			for (int i = 0; i < len; i++) {
				dos.writeShort(data.sh[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close(); // �ر�װ��������
				fos.close(); // �ر��ļ�������
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * ����2(readerFile)����ȡ���ļ�test.my�е����ݣ����ظ�������
	 * 
	 * @return ��ȡ������MyData����
	 */
	public static MyData readerFile() {
		FileInputStream fis = null;
		DataInputStream dis = null;

		MyData data = null;
		try {
			data = new MyData();
			// �������ڴӴ��̶�ȡ�ļ�������������
			fis = new FileInputStream("test.my");
			// ����������������������������Ƕ�ף���ʵ�����л�ȡ���ݣ�
			dis = new DataInputStream(fis);
			data.b = dis.readBoolean();
			data.n = dis.readInt();
			data.s = dis.readUTF();
			// ��ȡ����ŵ�����ĳ���
			int len = dis.readInt();
			data.sh = new short[len]; // ʵ�������飬�Ա��������
			for (int i = 0; i < len; i++) {
				data.sh[i] = dis.readShort();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return data;
	}
}
