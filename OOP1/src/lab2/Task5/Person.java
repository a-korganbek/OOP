package lab2.Task5;
public abstract class Person {

    protected String name;
    protected int age;
    protected Animal pet;
    protected Animal tempPet; 

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void assignPet(Animal pet) {
        this.pet = pet;
    }

    public void removePet() {
        pet = null;
    }

    public boolean hasPet() {
        return pet != null;
    }

    public void leavePetWith(Person other) {

        if (pet == null) {
            System.out.println(name + " has no pet to leave.");
            return;
        }

        if (other instanceof PhDStudent && pet instanceof Dog) {
            System.out.println("PhDStudent cannot take care of dogs.");
            return;
        }

        other.assignPet(pet);
        tempPet = pet;
        pet = null;
    }

    public void retrievePetFrom(Person other) {

        if(tempPet!=null) {
        	this.pet = tempPet;
        	other.removePet();
        	tempPet = null;
        }
    }

    public abstract String getOccupation();

    public String toString() {

        String petInfo = (pet == null) ? "no pet" : pet.toString();

        return name + " (" + age + "), " + getOccupation() + ", Pet: " + petInfo;
    }
    

    @Override
    public int hashCode() {
        return name.hashCode() + age;
    }
}
