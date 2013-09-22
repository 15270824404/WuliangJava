public class HelloWorld6 {
	public static void main(String[] args) {

		int html = 89; // HTML分数
		int java = 90; // Java分数
		int sql = 78; // SQL分数
		int diffen; // 分数之差
		double avg; // 平均分
		// 输出成绩单代码
		System.out.println("-----------------");
		System.out.println("HTML\tJAVA\tSQL");
		System.out.println(html + "\t" + java + "\t" + sql);
		System.out.println("-----------------");

		diffen = java - sql; // 计算java 课和sql课的成绩差
		System.out.println("Java和SQL的成绩差：" + diffen);

		avg = (html + java + sql) / 3; // 计算平均分
		System.out.println("三门课的平均分是: " + avg);

	}
}