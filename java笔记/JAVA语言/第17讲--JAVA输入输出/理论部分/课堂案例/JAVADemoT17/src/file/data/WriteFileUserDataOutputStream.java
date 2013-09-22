package file.data;

import java.io.*;

/*
 * 使用DataOutputStream书写具有一定格式的文件
 */
public class WriteFileUserDataOutputStream {
	public static void main(String[] args) {
		short sh[] = { 1, 3, 134, 12 };
		MyData data = new MyData(true, 100, "JAVA语言", sh);
		writeFile(data);
	}

	/**
	 * 将MyData对象按照一定格式写入文件中
	 * 
	 * @param data
	 *            数据对象
	 */
	public static void writeFile(MyData data) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		try {
			// 创建用于将文件写入磁盘的输出流对象
			fos = new FileOutputStream("test.my");
			// 在文件流对象的基础上建立数据输出流————流的嵌套
			dos = new DataOutputStream(fos);
			// 依次写入数据
			dos.writeBoolean(data.b);
			dos.writeInt(data.n);
			dos.writeUTF(data.s);
			// 写入数组
			int len = data.sh.length;
			dos.writeInt(len);// 将数组的长度先写进文件
			// 然后依次写入数组元素
			for (int i = 0; i < len; i++) {
				dos.writeShort(data.sh[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();// 关闭装饰流对象
				fos.close();// 关闭文件流对象
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
