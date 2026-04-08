package lab2.Task5;
public class PhDStudent extends Student {

    private String researchArea;

    public PhDStudent(String name, int age, String major, String researchArea) {
        super(name, age, major);
        this.researchArea = researchArea;
    }

    public void assignPet(Animal pet) {

        if (pet instanceof Dog) {
            System.out.println("PhD students cannot own dogs.");
        } else {
            this.pet = pet;
        }
    }

    public String getOccupation() {
        return "PhD Student researching " + researchArea;
    }
}