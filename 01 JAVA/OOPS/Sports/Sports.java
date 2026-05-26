package OOPS.Sports;

public class Sports {

    String sportsName;
    int matchTicketFee;
    int qty;

    public Sports() {
        this.sportsName = "General Sports";
        this.matchTicketFee = 0;
        this.qty = 0;
    }

    public Sports(String sportsName, int matchTicketFee, int qty) {
        this.sportsName = sportsName;
        this.matchTicketFee = matchTicketFee;
        this.qty = qty;
    }

    public void play() {
        System.out.println("Playing some general sports...");
    }

    public void displayDetails() {
        System.out.println("Sport: " + sportsName);
    }

    public void displayDetails(boolean showExtra) {
        System.out.println("Sport: " + sportsName);
        if (showExtra) {
            System.out.println("Ticket Fee: Rs." + matchTicketFee);
            System.out.println("Quantity Available: " + qty);
        }
    }
}
