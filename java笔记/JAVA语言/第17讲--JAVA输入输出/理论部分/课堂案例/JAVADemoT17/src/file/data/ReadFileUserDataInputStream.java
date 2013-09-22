package file.data;

import java.io.*;

/*
 *使用DataInputSteam 读取自定义格式的文件内容 
 * @author ZHT
 *
 */
public class ReadFileUserDataInputStream {
	public static void main(String[] args) {
		MyData data = readFile();
		// 在控制台输出读取的数据
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
			// 创建用于从磁盘读取文件的输入流对象
			fis = new FileInputStream("test.my");
			// 建立数据输入流，————流的嵌套（从实体流中获取数据）
			dis = new DataInputStream(fis);
			data.b = dis.readBoolean();
			data.n = dis.readInt();
			data.s = dis.readUTF();
			// 读取所存放的数组的长度
			int len = dis.readInt();
			data.sh = new short[len];// 实例化数组，以便接收数据
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
