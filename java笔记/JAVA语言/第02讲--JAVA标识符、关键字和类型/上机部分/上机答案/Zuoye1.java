/*
 * 上机作业1
 */
public class Zuoye1 {

	/*
	 * 客户	购买商品	单价		个数	折扣
	 *	1	T恤		￥420.78 	1	9.5
	 *	2	网球		￥45 		3	无
	 */
	public static void main(String[] args) {
		double shirtPrice = 420.78;  //Ｔ恤单价
		int shirtNo = 1;  //购Ｔ恤件数
		double tennisPrice = 45;  //网球单价
		int tennisNo = 3;  //购网球个数
		
		double shirtMoney = shirtPrice * shirtNo * 0.95;  //张三消费金额
		double tennisMoney = tennisPrice * tennisNo;     //李四消费金额
		
		System.out.println("客户\t" + "消费金额");
		System.out.println("张三\t" + shirtMoney);
		System.out.println("李四\t" + tennisMoney);
	}
}
