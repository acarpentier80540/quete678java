public abstract class vehicule {

    public String brand;
    public int kilometers;

    public vehicule(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    public String getBrand(){
        return this.brand;
    }

    public int isKilometers() {
        return this.kilometers;
    }

    public void setBrand(String brand){
        this.brand= brand;
    }

    public  void setKilometers(int kilometers){
        this.kilometers=kilometers;
    }
    public abstract String doStuff();
}
