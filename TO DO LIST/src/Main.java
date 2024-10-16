import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introduce an Array list to hold all info
        ArrayList<String> toDoList = new ArrayList<>();

        //Create a loop to keep prompting user
        while (true) {
            System.out.println("Please choose an option:");
            System.out.println("1 - Add");
            System.out.println("2 - Remove");
            System.out.println("3 - View");
            System.out.println("4 - Clear");
            System.out.println("5 - Quit");
            System.out.println();
            Integer option = Integer.valueOf(scanner.nextLine());
            System.out.println();

            //add functionality for to do list
            if (option == 1) {
                addToList(toDoList, scanner);
                continue;
            }

            //removal functionality for to do list
            else if (option == 2) {
                removeFromList(toDoList, scanner);
                continue;
            }

            //view functionality for to do list
            else if (option == 3) {
                viewList(toDoList);
                continue;
            }

            //clear functionality for to do list
            else if (option == 4) {
                clearList(toDoList);
            }

            //quit option for to do list
            else if (option == 5) {
                break;
            }

            //Wrong input functionality
            else {
                System.out.println("Sorry we did not catch that");
                System.out.println("Please enter a number 1 through 5");
                continue;
            }
        }
    }

    public static void addToList(ArrayList<String> toDoList, Scanner scanner) {
        System.out.print("Add a task: ");
        String task = scanner.nextLine();
        toDoList.add(task);
        System.out.println("Task added: " + task);
    }

    public static void removeFromList(ArrayList<String> toDoList, Scanner scanner) {
        int length = toDoList.size();
        System.out.println("What task do you want to remove: ");
        System.out.println("Enter the number of the task starting from 0");
        for (int i = 0; i < length; i++) {
            System.out.println(toDoList.get(i));
        }
        int itemRemovalIndex = Integer.valueOf(scanner.nextLine());
        toDoList.remove(itemRemovalIndex);

    }

    public static void viewList(ArrayList<String> toDoList) {
        int length = toDoList.size();
        for (int i = 0; i < length; i++) {
            System.out.println(toDoList.get(i));
        }
    }

    public static void clearList(ArrayList<String> toDoList){
        toDoList.clear();
    }
}
