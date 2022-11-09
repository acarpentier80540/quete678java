public class Car extends vehicule{

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return "Je suis"+" "+ this.brand+" " +"et je fais vroum vroum !";
    }
}
