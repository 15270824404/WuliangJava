package kehou.zuoye3;

public class Dog extends Pet {

	public Dog(String petName, String speakType) {
		super(petName, speakType);
	}
	public void speakInfo() {
		System.out.println("Dog中的speakInfo方法：名字：" + this.getPetName() + "   语言类型："
				+ this.getSpeakType());
	}
}
