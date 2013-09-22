package kehou.zuoye3;

/*
 * 课后作业3
 * 建立父类Pet并提供属性petName、speakType，方法speakInfo
 * 提供Pet属性对应的getter/setter方法，
 * 在pet构造 方法中为属性petName、speakType赋值
 * 建立子类Dog,Cat并提供属性petName、speakType及属 性对应的getter/setter方法，并重写父类中speakInfo 方法
 */
public class Pet {
	private String petName;
	private String speakType;

	public void speakInfo() {
		System.out.println("父类中的speakInfo方法：名字：" + this.petName + "   语言类型："
				+ this.speakType);
	}

	public Pet(String petName, String speakType) {
		this.petName = petName;
		this.speakType = speakType;
	}

	public String getPetName() {
		return petName;
	}

	public void setPetName(String petName) {
		this.petName = petName;
	}

	public String getSpeakType() {
		return speakType;
	}

	public void setSpeakType(String speakType) {
		this.speakType = speakType;
	}

}
