package kehou.zuoye3;

public class Cat extends Pet {

	public Cat(String petName, String speakType) {
		super(petName, speakType);
	}

	public void speakInfo() {
		System.out.println("Cat�е�speakInfo���������֣�" + this.getPetName() + "   �������ͣ�"
				+ this.getSpeakType());
	}
}
