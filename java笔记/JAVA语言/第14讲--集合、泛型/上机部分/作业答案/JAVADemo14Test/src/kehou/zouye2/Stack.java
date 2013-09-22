package kehou.zouye2;

/*
 * 课后作业2
 * 创建一个类Stack，代表堆栈（其特点为：后进先出），
 * 添加方法add(Object obj)、以及delete( )，
 * 添加main方法进行验证，要求：
 * 1.	使用LinkedList实现堆栈
 * 2.	在向LinkedList中添加时，使用addLast( )方法
 * 3.	在从LinkedList中取出时，使用removeLast( )方法

 */
import java.util.LinkedList;
@SuppressWarnings("unchecked")
public class Stack {

	public LinkedList list = new LinkedList();

	/**
	 * 添加元素时总是添加到最后面
	 * 
	 * @param obj
	 */
	public void add(Object obj) {
		list.addLast(obj);
	}

	/**
	 * 删除时总是删除最后一个
	 */
	public void delete() {
		list.removeLast();
	}

	public static void main(String[] args) {
		Stack s = new Stack();
		// 添加三个元素
		s.add("a");
		s.add("b");
		s.add("c");
		System.out.print("添加三个元素后：");
		System.out.println(s.list);
		// 删除一个元素
		s.delete();
		System.out.print("删除一个元素后：");
		System.out.println(s.list);

	}
}
