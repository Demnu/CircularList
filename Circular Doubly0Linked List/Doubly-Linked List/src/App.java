import java.util.Scanner;  // Import the Scanner class

public class App {
    public static void main(String[] args) throws Exception {
        Scanner keyboard = new Scanner(System.in);  // Create a Scanner object

        System.out.println("Hello, World!");
        System.out.println("Done");
        LinkedList test = new LinkedList();

        int command = 0;
        int data = 0;

        while (command!=9)
        {
            System.out.println("[0] add next \n[1] add to tail \n[2] next \n[3] previous\n[4] add to current\n[5] Show LinkedList \n[6] Show current data");
            command = keyboard.nextInt();
            switch (command)
            {
                case 0:
                    System.out.println("What integer do you want to add to the head?");
                    data = keyboard.nextInt();
                    test.addNext(data);
                    break;
                // case 01:
                //     System.out.println("What integer do you want to add to the tail?");
                //     data = keyboard.nextInt();
                //     test.add_to_tail(data);
                //     break;
                // case 2:
                //     test.next();
                //     System.out.println("Current moved to next node");
                //     break;
                // case 3:
                //     test.prev();
                //     System.out.println("Current moved to previous node");
                //     break;
                // case 4:

                //     System.out.println("Data added");
                //     data = keyboard.nextInt();

                //     test.add_to_current(data);
                //     break;

                // case 5: 
                // test.showLinkedList();
                // break;

                // case 6:
                //     System.out.println(test.showCurrent());
                //     break;



                
            }

        }
        
    }

}
