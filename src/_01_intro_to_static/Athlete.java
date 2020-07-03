package _01_intro_to_static;

public class Athlete {
    static int nextBibNumber;
    static String raceLocation = "Boston";
    static String raceStartTime = "9.00am";

    String name;
    int speed;
    int bibNumber;

    Athlete (String name, int speed){
        this.name = name;
        this.speed = speed;
        bibNumber = nextBibNumber ++;
      
    }
    

    public static void main(String[] args) {
    	System.out.println(nextBibNumber);
        Athlete bob = new Athlete("Bob", 2);
        System.out.println(nextBibNumber);
        System.out.println(bob.name + " " + bob.bibNumber + " " + raceLocation);
        System.out.println(nextBibNumber);
        Athlete alice = new Athlete("alice", 3);
        System.out.println(nextBibNumber);
        System.out.println(alice.name + " " + alice.bibNumber + " " + raceLocation);
        System.out.println(nextBibNumber);
    }
}