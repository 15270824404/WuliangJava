package kehou.zuoye3;

public class Dog extends Pet {

	public Dog(String petName, String speakType) {
		super(petName, speakType);
	}
	public void speakInfo() {
		System.out.println("Dog�е�speakInfo���������֣�" + this.getPetName() + "   �������ͣ�"
				+ this.getSpeakType());
	}
}
