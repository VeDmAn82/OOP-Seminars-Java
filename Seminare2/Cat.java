public class Cat extends Animal {
    private String name;
    private int age;
    private String breed;

    public Cat(String name, String breed, int age) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void tellAboutYourself() {
        System.out.printf("Привет, меня зовут %s, мой возраст %d, моя порода %s \n", this.name, this.age, this.breed);
    }

    @Override
    void sayVoice() {
        System.out.println("Мяу");
        
    }
}

