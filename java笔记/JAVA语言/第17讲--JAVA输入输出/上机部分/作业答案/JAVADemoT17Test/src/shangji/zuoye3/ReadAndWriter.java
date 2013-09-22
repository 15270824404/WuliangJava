package shangji.zuoye3;

import java.io.*;

/*
 * 在读写文件的类(ReadAndWriter)中创建方法：
 * 方法1(writerFile)：创建数据类的对象，然后将对象输出到位于D盘根目录的磁盘文件：test.my中
 * 方法2(readerFile)：读取出文件test.my中的数据，显示在控制台
 * 要求使用装饰流DataInputStream和DataOutputStream类完成
 */
public class ReadAndWriter {

	/**
	 * 方法1(writerFile)：创建数据类的对象，然后将对象输出到位于D盘根目录的磁盘文件：test.my中
	 * 
	 * @param data
	 */
	public static void writerFile(MyData data) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			// 创建用于将文件写入磁盘的输出流对象
			fos = new FileOutputStream("test.my");
			// 在文件流对象的基础上建立数据输出流————流的嵌套
			dos = new DataOutputStream(fos);
			dos.writeBoolean(data.b); // 依次写入数据
			dos.writeInt(data.n);
			dos.writeUTF(data.s);
			int len = data.sh.length; // 写入数组
			dos.writeInt(len); // 将数组的长度先写进文件
			// 然后依次写入数组元素
			for (int i = 0; i < len; i++) {
				dos.writeShort(data.sh[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close(); // 关闭装饰流对象
				fos.close(); // 关闭文件流对象、
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 方法2(readerFile)：读取出文件test.my中的数据，返回给调用者
	 * 
	 * @return 读取出来的MyData对象
	 */
	public static MyData readerFile() {
		FileInputStream fis = null;
		DataInputStream dis = null;

		MyData data = null;
		try {
			data = new MyData();
			// 创建用于从磁盘读取文件的输入流对象
			fis = new FileInputStream("test.my");
			// 建立数据输入流，————流的嵌套（从实体流中获取数据）
			dis = new DataInputStream(fis);
			data.b = dis.readBoolean();
			data.n = dis.readInt();
			data.s = dis.readUTF();
			// 读取所存放的数组的长度
			int len = dis.readInt();
			data.sh = new short[len]; // 实例化数组，以便接收数据
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
