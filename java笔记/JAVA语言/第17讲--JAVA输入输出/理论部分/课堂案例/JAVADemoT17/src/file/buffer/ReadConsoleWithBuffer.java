package file.buffer;

import java.io.*;

/*
 * 使用BufferedReader读取控制台输入
 */
public class ReadConsoleWithBuffer {

	public static void main(String[] args) {
		BufferedReader br = null;// 声明缓冲装饰流
		String s = null;// 用于保存用户输入的字符串

		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("请输入：");// 提示用户输入
				// 按行输入
				s = br.readLine();
				// 在控制台输出用户的输入
				System.out.println(s);
			} while (!s.equals("quit"));
			System.out.println("结束输入！");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
