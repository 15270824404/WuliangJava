/*
 * ��8�����κ���ҵ1�Ĳ�����
 */
import java.util.*;

public class ScoreCalcTest {
	public static void main(String[] args) {
		ScoreCalc sc = new ScoreCalc();
		/* ���ճɼ� */
		Scanner input = new Scanner(System.in);
		System.out.print("������Java�ɼ���");
		sc.java = input.nextInt();
		System.out.print("������HTML�ɼ���");
		sc.html = input.nextInt();
		System.out.print("������SQL�ɼ���");
		sc.sql = input.nextInt();
		/* ���㲢����ɼ� */
		sc.showTotalScore();
		sc.showAvg();
	}
}
