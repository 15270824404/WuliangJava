package kehou03;

/*
 * ��д����MyDog�������е��������ø����е����ԣ����ṩ��������species(���)
 */
public class MyDog extends MyPet {
	private String species;

	public MyDog(String name, String ownerName, int age, String color,
			double weight, String species) {
		super(name, ownerName, age, color, weight);
		this.species = species;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

}
