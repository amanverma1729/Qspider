package OOPS.Sports;

public class Hockey extends Sports {

    public Hockey() {
        super("Hockey", 300, 50);
    }

    
    @Override
    public void play() {
        System.out.println("Playing Hockey! Scoring a Goal!");
    }
}
