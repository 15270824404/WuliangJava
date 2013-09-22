/**
 * KehouZuoye2.java
 * 第2讲上机：课后作业2
 */
public class KehouZuoye2 {
	public static void main(String[] args) {
          int base = 3000;     //基本工资
          double ga;           //物价津贴
          double hra;          //房屋津贴
          double salary;       //薪水
          
          ga = base * 40 / 100;
          hra = base * 25 /100;
          salary = base + ga + hra; 
          
          /*输出工资细目*/
          System.out.println("该员工的工资细目为： ");
          System.out.println("基本工资为： " + base);
          System.out.println("物价津贴为： " + ga);
          System.out.println("房租津贴为： " + hra);
          System.out.println("员工薪水是： " + salary);
	}
}
