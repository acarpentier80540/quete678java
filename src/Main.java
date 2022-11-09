public class Main {
    public static void main(String[] args) {
       Wilder wilder = new Wilder("Antoine", true);
        Wilder secondWilder = new Wilder("Antoine", false);
        System.out.println(wilder.whoAmI());
        System.out.println(secondWilder.whoAmI());
    }
}