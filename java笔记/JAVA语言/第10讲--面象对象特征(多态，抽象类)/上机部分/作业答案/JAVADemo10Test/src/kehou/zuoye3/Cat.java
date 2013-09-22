package kehou.zuoye3;

public class Cat extends Pet {

	public Cat(String petName, String speakType) {
		super(petName, speakType);
	}

	public void speakInfo() {
		System.out.println("Cat中的speakInfo方法：名字：" + this.getPetName() + "   语言类型："
				+ this.getSpeakType());
	}
}
