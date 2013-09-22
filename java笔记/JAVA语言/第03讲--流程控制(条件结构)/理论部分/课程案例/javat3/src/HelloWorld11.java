/*
 * 不能使用String类型作为switch后面的变量
 */
public class HelloWorld11 {
	public static void main(String[] args) {
		String day = "星期一";
		switch (day){
		      case "星期一":
		           System.out.println("星期一：青菜  ");
		           break;
		      case "星期二":
		           System.out.println("星期二：鱼  ");
		           break;
		      case "星期三":
			       System.out.println("星期三：海鲜  ");
			       break;
		      default:
		    	   break;
		}
	}
}
