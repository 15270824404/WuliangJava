package file.charsetstream;

import java.io.FileWriter;
import java.io.IOException;

/*
 * 使用FileWriter书写具有一定格式的文件——字符流
 * 与字节流对照
 */
public class WriteFileUserFileWriter {

	public static void main(String[] args) {
		String s = "JAVA 基础教程";// 将要被写入的数据
		int n = 100;// 将要被写入的数据
		FileWriter fw = null;// 声明输出流对象

		try {
			// 第1步：创建输出流对象
			fw = new FileWriter("e:\\out.txt");
			char[] c1 = s.toCharArray();// 将要保存的数据转换为字符数组
			char[] c2 = "\r\n".toCharArray();// 文本文件中的换行符
			char[] c3 = String.valueOf(n).toCharArray();

			// 第2步：依次写入数据
			fw.write(c1);// 写入字符串数据
			fw.write(c2);// 写入换行符
			fw.write(c3);// 写入整数数据

		} catch (Exception e) {
			e.printStackTrace();// 异常处理
		} finally {
			try {
				fw.close();// 第3步：关闭输出流——释放资源
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
