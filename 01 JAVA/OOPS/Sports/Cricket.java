package OOPS.Sports;

public class Cricket extends Sports {

   
    public Cricket() {
        super("Cricket", 500, 100);
    }

    @Override
    public void play() {
        System.out.println("Playing Cricket! Hitting a Six!");
    }
}
