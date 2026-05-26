package OOPS.Sports;

public class Kabaddi extends Sports {

    public Kabaddi() {
        super( "Kabaddi", 200, 80);
    }

    
    @Override
    public void play() {
        System.out.println("Playing Kabaddi! Kabaddi... Kabaddi... Kabaddi...");
    }
}
