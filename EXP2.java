import java.util.*;

class EX2 {
    ArrayList<String> a = new ArrayList<String>();

    void append(String c) {
        a.add(c);
    }

    void insert(int p, String c) {
        if (p >= 0 && p <= a.size())
            a.add(p, c);
        else
            System.out.println("Invalid Index");
    }

    boolean search(String c) {
        return a.contains(c);
    }

    void display() {
        System.out.println("Cities: " + a);
    }

    void displayByLetter(char ch) {
        boolean found = false;
        System.out.println("Cities beginning with '" + ch + "':");

        for (String city : a) {
            if (city.toLowerCase().startsWith(String.valueOf(Character.toLowerCase(ch)))) {
                System.out.println(city);
                found = true;
            }
        }

        if (!found)
            System.out.println("No city found.");
    }

    public static void main(String args[]) {
        EX2 obj = new EX2();
        Scanner s = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Append City");
            System.out.println("2. Insert City");
            System.out.println("3. Search City");
            System.out.println("4. Display Cities");
            System.out.println("5. Display Cities Beginning with Letter");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();

            if (choice == 1) {
                System.out.print("Enter city name: ");
                obj.append(s.next());
            }
            else if (choice == 2) {
                System.out.print("Enter index: ");
                int index = s.nextInt();
                System.out.print("Enter city name: ");
                obj.insert(index, s.next());
            }      
            else if (choice == 3) {
                System.out.print("Enter city to search: ");
                if (obj.search(s.next()))
                    System.out.println("City Found");
                else
                    System.out.println("City Not Found");
            }
            else if (choice == 4) {
                obj.display();
            }
            else if (choice == 5) {
                System.out.print("Enter first letter: ");
                char ch = s.next().charAt(0);
                obj.displayByLetter(ch);
            }
            else if (choice == 6) {
                System.out.println("Program Ended");
            }
            else {
                System.out.println("Invalid Choice");
            }

        } while (choice != 6);

        s.close();
    }
}
