package superexample;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public void speak(){
        super.speak();
        System.out.println("I am a "+ breed + " dog. ");
    }

    public static void main(String args []){
        Dog d = new Dog("Tommy", "laurey");
        d.speak();
    }
}
