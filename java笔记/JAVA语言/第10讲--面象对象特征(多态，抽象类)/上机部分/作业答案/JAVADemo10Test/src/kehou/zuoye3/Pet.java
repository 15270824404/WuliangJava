package kehou.zuoye3;

/*
 * �κ���ҵ3
 * ��������Pet���ṩ����petName��speakType������speakInfo
 * �ṩPet���Զ�Ӧ��getter/setter������
 * ��pet���� ������Ϊ����petName��speakType��ֵ
 * ��������Dog,Cat���ṩ����petName��speakType���� �Զ�Ӧ��getter/setter����������д������speakInfo ����
 */
public class Pet {
	private String petName;
	private String speakType;

	public void speakInfo() {
		System.out.println("�����е�speakInfo���������֣�" + this.petName + "   �������ͣ�"
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
