/**
 * HelloWorld9.java  演示switch结构
 */
public class HelloWorld09 {
    public static void main(String[] args) {
        int mingCi = 1;  //名次
        switch (mingCi){
            case 1:
            	System.out.println("出任班长");
                break;
            case 2:
            	System.out.println("出任大队长");
                break;
            case 3:
            	System.out.println("出任小组长");
                break;
            default:
            	System.out.println("留级");
            	break;
        }
    }
}
