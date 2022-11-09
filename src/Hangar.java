public class Hangar {
    public static void main(String[] args) {
        Car clio  = new Car ("clio", 1);
        Boat titanic = new Boat("titanic", 1) {

        };
        System.out.println(clio.doStuff());
        System.out.println(titanic.doStuff());
    }
}
