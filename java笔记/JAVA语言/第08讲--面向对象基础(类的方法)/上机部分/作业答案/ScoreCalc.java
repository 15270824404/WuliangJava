/*
 * ��8�����κ���ҵ1
 * 

 */
public class ScoreCalc {
	int java; // Java�ɼ�

	int html; // HTML�ɼ�

	int sql; // SQL�ɼ�

	/**
	 * �����ܳɼ�
	 * 
	 * @return total
	 */
	public int calcTotalScore() {
		int total = java + html + sql;
		return total;
	}

	/**
	 * ��ʾ�ܳɼ�
	 */
	public void showTotalScore() {
		System.out.println("�ܳɼ��ǣ� " + calcTotalScore());
	}

	/**
	 * ����ƽ���ɼ�
	 * 
	 * @return avg
	 */
	public int calcAvg() {
		int avg = (java + html + sql) / 3;
		return avg;
	}

	/**
	 * ��ʾƽ���ɼ�
	 */
	public void showAvg() {
		System.out.println("ƽ���ɼ��ǣ� " + calcAvg());
	}
}
