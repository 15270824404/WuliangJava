package file.demo;

/*
 * 判断文件是否存在，不存在则创建，存在则删除
 */
import java.io.File;

public class FileTest01 {

	public static void main(String[] args) {
		File f = new File("c:/1.txt");
		if (f.exists()) // 判断文件是否存在
			f.delete(); // 删除文件
		else
			try {
				f.createNewFile(); // 创建新文件
			} catch (Exception e) {
				e.printStackTrace();
			}
		System.out.println("文件名称：" + f.getName());
		System.out.println("文件路径：" + f.getPath());
		System.out.println(f.canWrite() ? "文件可写" : "文件不可写");
		System.out.println(f.isDirectory() ? "是目录" : "不是目录");
		System.out.println("文件长度:" + f.length() + "Bytes");
		
		f = new File("E:\\demo");
		System.out.println(f.isDirectory() ? "是目录" : "不是目录");
	}
}
