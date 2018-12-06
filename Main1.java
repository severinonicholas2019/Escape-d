import java.util.Scanner;

public class Main {

    public static Scanner sc;
    public static int moves = 30;
    public static String  enter = "You find yourself in a large foyer. There is a door to the north. To the west is a bench\nagainst the wall. To the east is a chest on the floor. In the center of the room is a large\ncandle. The candle is unlit.\n";
    public static boolean foyer = true;
    public static boolean library = false;
    public static boolean conse = false;
    public static boolean openchest = false;
    public static boolean gotmatc = false;
    public static boolean candleon = false;
    public static boolean fdl = true;
    public static boolean fdo = false;
    public static boolean pen = false;
    public static boolean book = false;
    public static boolean sdl = true;
    public static boolean sdo = false;
    public static boolean trumpet = false;
    public static boolean gtrumpet = false;

    public static void main(String[] args) {
        System.out.print(enter);
        for (int i = 1; i <= 30; i++) {
            go();
            moves--;
            if (trumpet) {
                break;
            }
        }
        if (trumpet) {
            System.out.println("A door opens, and you escape with a sweet saxaphone to accompany you on your journey home");
            System.out.println("Congratulations! You have completed the escape room challenge successfully in with " +moves+" to spare.");
        }
        else {
            System.out.println("You have failed the escape room challenge. Try again!");
        }
    }

    public static void go() {
        if (foyer) {
            firstr();
        }
        else if (library) {
            secondr();
        }
        else if (conse) {
            thirdr();
        }
    }

    public static void firstr() {
        System.out.print("You have " + moves+ " turns to escape.\n\n>>");
        sc = new Scanner(System.in);
        String command = sc.nextLine();


        switch (command) {
            case  "look":
                System.out.println("\n"+enter);
                break;
            case  "look bench":
                System.out.println("\nThere is a bench on the western wall. There is a small note here.");
                break;
            case  "look candle":
                System.out.println("\nThe candle in the center of the room is not lit.");
                break;
            case "read note":
                System.out.println("\nThe note is written on a piece of embossed vellum paper. In script writing you can make out\nthe phrase 'May my light show you the way.'");
                break;
            case "look chest":
                System.out.println("\nYou see a chest. It is closed. It doesn't appear to be locked.");
                break;
            case "open chest":
                openchest = true;
                System.out.println("\nYou open the chest. There is a box of matches here.");
                break;
            case "get matches":
                gotmatc = true;
                if(openchest) {
                    System.out.println("\nYou take the box of matches out of the chest.");
                }else{System.out.println("Matches? What are matches?");}
                break;
            case "light candle":
                if (gotmatc) {
                    candleon = true;
                    fdl = false;
                    System.out.println("\nYou light the candle, and fierce wind blows through the room, extinguishing the match in your\nhand, but making the candle burn brighter. You hear a loud metal grinding sound from the\nnorth.");
                }
                else {
                    System.out.println("\nYou don't have any matches.");
                }
                break;

            case "look door":
                if (!fdl) {
                    if(fdo){
                        System.out.println("\nThe door to the north is closed, but unlocked");
                    }
                    else {
                        System.out.println("\nThe door is unlocked, but closed.");
                    }
                }
                else {
                    System.out.println("\nThe door is locked.");
                }
                break;

            case "open door":
                if (!fdl) {
                    fdo = true;
                    System.out.println("\nThe north door is open.");
                }
                break;
            case "go north":
                if (fdo) {
                    foyer = false;
                    library = true;
                    System.out.println("\nYou leave the foyer, the door behind you closes with a loud slam, and you hear the locking\nmechanism relock the door. You cannot return to the foyer.");
                    System.out.println("  ");
                    System.out.println("You now find yourself in a library full of shelves of books. In the center of the room is a\ndesk. On the desk is a pen and a scroll. There is a door to the north.");
                }
                break;
        }
    }
    public static void secondr() {
        System.out.print("\nYou have "+ moves+" turns to escape.\n\n>>");
        sc = new Scanner(System.in);
        String command = sc.nextLine();
        switch (command) {
            case "look shelf":
                System.out.println("\nThere is a book titled 'The Autobiography of ...' with the rest of the title empty.");
                break;
            case "look shelves":
                System.out.println("\nThere is a book titled 'The Autobiography of ...' with the rest of the title empty.");
                break;
            case "get pen":
                pen = true;
                System.out.println("\nYou have acquired the pen.");
                break;
            case "read scroll":
                System.out.println("\nThe scroll says, 'Share your story.'");
                break;
                case"look scroll":
                System.out.println("\nThe scroll says, 'Share your story.'");
                break;
            case "write book":
                book = true;
                sdl = false;
                if(pen) {
                    System.out.println("\nYou have completed the autobiography You heard a metal grinding sound from the north.");
                }else{
                    System.out.println("What are you going to write with?");}

                break;
            case "look door":
                if(!sdl) {
                    if (sdo) {
                        System.out.println("\nThe door is unlocked and open.");
                    } else {
                        System.out.print("\nThe door is unlocked, but closed.");
                    }
                    }
                    else {
                        System.out.print("\nThe door is locked.");
                    }


                     break;

            case "open door":
                if (!sdl) {
                    sdo = true;
                    System.out.print("\nThe north door is open.");
                }
                break;
            case "go north":
                if (sdo) {
                    library = false;
                    conse = true;
                    System.out.print("\nYou have left the library. On your way out, the door slammed and locked. \nYou are now in the conservatory and cannot return to the library. In the conservatory there are a variety of instruments. \n A drum, trumpet, and piano. There is a sheet of music on a stand.");
                }
                break;
        }
    }
    public static void thirdr()  {
        System.out.print("\nYou have "+ moves +" turns to escape.\n\n>>");
        sc = new Scanner(System.in);
        String command = sc.nextLine();
        switch (command) {
            case "read sheet":
                System.out.println("\nThe music sheet is a Trumpet Solo");
                break;
            case "get trumpet":
                System.out.println("\nTrumpet is in an optimal position for playing");
                gtrumpet=true;
                break;
            case "get drums":
                System.out.println("\nThe drums are broken and have no stick... try again!");
                break;
            case "get piano":
                System.out.println("\nThe piano is broken... try again!");
                break;
                case "play trumpet":
                    if (gtrumpet){
                    System.out.println("\nA sweet melody comes out and suddenly the grinding metal sound halts.");
                    trumpet = true;
                    break;
            } else{
                System.out.println("\nFind the trumpet");
            }
                    break;

            case "open door":
                if(trumpet){
                    boolean tdo= true;
                }
                else {
                    System.out.println("The door is locked");
                }
                case "go north":
                        System.out.println("A door opens, and you escape with a sweet saxaphone to accompany you on your journey home");
                        System.out.println("Congratulations! You have completed the escape room challenge successfully in with " +moves+" to spare.");
                        break;


        }
        }
    }
