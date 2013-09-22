//看了下，忽略了太多了，再发过一次，下次一定注意，不好意思，老师
//忽略了人的头发属性，头发的属性，等等……
//tom猫住了老鼠jacky，jacky哭了
/*public class Text{
	public static void main(String[] args){
		Cat cat = new Cat();
		cat.name = "tom";
		
		Mouse mouse = new Mouse();
		mouse.name = "jacky";
		cat.catchMouse(mouse);
		}
	
	}
class Cat{
	String name;
	public void catchMouse(Mouse mouse){
		mouse.cry();
	}
}
class Mouse{
   String name;
  public  void cry(){
     	System.out.println("this name Mouse cry:"+this.name);
  }
}*/
//张三吃了李四的一个头发
/*public class Text{
	public static void main(String[] args){
	   Person person1 = new Person();
	   Person person2 = new Person();
	   person1.name = "张三";
	   person2.name = "李四";
	   Hair hair1 = new Hair();
	   hair1.total = 1;
	   hair1.person = person2;
	   person1.eat(hair1);
	}
}
class Person{
  String name;
  Hair hair;  

  public void eat(Hair hair){
    	System.out.println(this.name+"吃了 "+hair.total+"根"+hair.person.name+"头发");
  }	
}
class Hair{
   int total;	
  Person person;
}*/
public class Text{
	public static void main(String[] args){
	   Person person = new Person();
	   person.name = "张三";
	   Hair hair1 = new Hair();
	   hair1.total = 1;
	   hair1.person = person;
	   person.eat(hair1);
	}
}
class Person{
  String name;
  Hair hair;  
  boolean fa;

  public void eat(Hair hair){
    	System.out.println(this.name+"吃了 "+hair.total+"根"+hair.person.name+"头发");
  }
}
class Hair{
   int total;	
  Person person;
}