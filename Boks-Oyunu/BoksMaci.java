public class BoksMaci {
    public static void main(String[] args) {

        Fighter f1 = new Fighter("Ali", 15, 100, 115,40);
        Fighter f2 = new Fighter("Salihe", 20, 90, 95,30);

        Match match=new Match(f1,f2,90,105);
        match.run();

    }
}
