public class Wilder {
    public String firstname;
    public boolean aware;

    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstName() {
        return this.firstname;

    }
    public boolean getAware(){
        return this.aware;
    }

    public boolean isAware() {
        return this.aware;
    }

    public void setFirstname(String firstname){
        this.firstname= firstname;
    }

    public  void setAware(boolean aware){
        this.aware=aware;
    }

    public String whoAmI(){
        if (aware==true){
            return "Je m'appelle" +" "+ this.firstname +" "+ "et je suis aware";
        }
else{
        return "Je m'appelle" + " "+ this.firstname +" "+"et je ne suis pas aware";
    }
}}
