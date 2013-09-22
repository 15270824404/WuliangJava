package kehou03;

/*
 * 编写子类MyDog，子类中的属性沿用父类中的属性，并提供子类属性species(类别)
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
