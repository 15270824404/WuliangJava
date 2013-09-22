/*
 * 第8讲，课后作业1
 * 

 */
public class ScoreCalc {
	int java; // Java成绩

	int html; // HTML成绩

	int sql; // SQL成绩

	/**
	 * 计算总成绩
	 * 
	 * @return total
	 */
	public int calcTotalScore() {
		int total = java + html + sql;
		return total;
	}

	/**
	 * 显示总成绩
	 */
	public void showTotalScore() {
		System.out.println("总成绩是： " + calcTotalScore());
	}

	/**
	 * 计算平均成绩
	 * 
	 * @return avg
	 */
	public int calcAvg() {
		int avg = (java + html + sql) / 3;
		return avg;
	}

	/**
	 * 显示平均成绩
	 */
	public void showAvg() {
		System.out.println("平均成绩是： " + calcAvg());
	}
}
