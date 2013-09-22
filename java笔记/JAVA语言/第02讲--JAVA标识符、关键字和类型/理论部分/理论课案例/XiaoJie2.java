
/*
 * 根据天数（46）计算周数和剩余的天数
 */
public class XiaoJie2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int days=46;
		int week=days/7;
		int day=days%7;
		System.out.println(days+"天一共是："+week+"周另"+day+"日");

	}

}
