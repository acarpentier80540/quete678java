public class Boat extends vehicule {
    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }


    public String doStuff() {
        return  "Je suis" + " "+ this.brand +" " +"et je fais glou glou !";
    }
}
