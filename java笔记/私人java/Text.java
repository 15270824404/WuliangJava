//�����£�������̫���ˣ��ٷ���һ�Σ��´�һ��ע�⣬������˼����ʦ
//�������˵�ͷ�����ԣ�ͷ�������ԣ��ȵȡ���
//tomèס������jacky��jacky����
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
//�����������ĵ�һ��ͷ��
/*public class Text{
	public static void main(String[] args){
	   Person person1 = new Person();
	   Person person2 = new Person();
	   person1.name = "����";
	   person2.name = "����";
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
    	System.out.println(this.name+"���� "+hair.total+"��"+hair.person.name+"ͷ��");
  }	
}
class Hair{
   int total;	
  Person person;
}*/
public class Text{
	public static void main(String[] args){
	   Person person = new Person();
	   person.name = "����";
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
    	System.out.println(this.name+"���� "+hair.total+"��"+hair.person.name+"ͷ��");
  }
}
class Hair{
   int total;	
  Person person;
}