import java.util.Scanner;

public class GeometryCalculator {



    public static void main(String[] args) {

        int choice;



        do {

            choice = getMenuChoice();

            String menuChoice;
            switch (choice) {
                case 1:
                    menuChoice = "Calculate the Area of a Circle";
                    System.out.println(menuChoice);
                    circle();
                    break;
                case 2:
                    menuChoice = "Calculate the Area of a Rectangle";
                    System.out.println(menuChoice);
                    rectangle();
                    break;
                case 3:
                    menuChoice = "Calculate the Area of a Triangle";
                    System.out.println(menuChoice);
                    triangle();
                    break;
                case 4:
                    menuChoice = "Quit";
                    System.out.println(menuChoice);

            }

        }while (choice != 4);

    }

    public static int getMenuChoice() {

        //create a scanner object for Keyboard input
        Scanner keyboard = new Scanner(System.in);

        int menuChoice;

        //Display Menu
        System.out.println("Geometry Calculator");
        System.out.println("1. Calculate the Area of a Circle");
        System.out.println("2. Calculate the Area of a Rectangle");
        System.out.println("3. Calculate the Area of a Triangle");
        System.out.println("4. Quit");
        System.out.println("Enter your choice(1-4):");


        menuChoice = keyboard.nextInt();

        while (menuChoice < 1 || menuChoice > 4){
            System.out.println("Error: Enter 1, 2, 3, 4: ");
            menuChoice = keyboard.nextInt();
        }

        return menuChoice;


    }

    public static void circle() {
        double radius;
        //create a scanner object for Keyboard input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        radius = keyboard.nextDouble();
        while (radius <= 0){
            System.out.println("Error: please enter a positive value > 0: ");
            radius = keyboard.nextDouble();
        }
        System.out.println("For a circle with a radius of " + radius + "\nThe area of the circle is: " + Geometry.circleArea(radius));

    }

    public static void rectangle() {
        double length;
        double width;
        //create a scanner object for length input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the length: ");
        length = keyboard.nextDouble();
        while (length <= 0){
            System.out.println("Error: please enter a positive value > 0: ");
            length = keyboard.nextDouble();
        }
        System.out.println("Please enter the width: ");
        width = keyboard.nextDouble();
        while (width <= 0){
            System.out.println("Error: please enter a positive value > 0: ");
            width = keyboard.nextDouble();
        }
        System.out.println("For a rectangle with a length of " + length + " and the width of " + width + "\nThe area of the triangle is: " + Geometry.rectangleArea(length, width));
    }


    public static void triangle() {
        double base;
        double height;
        //create a scanner object for length input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the base: ");
        base = keyboard.nextDouble();
        while (base <= 0){
            System.out.println("Error: please enter a positive value > 0: ");
            base = keyboard.nextDouble();
        }
        System.out.println("Please enter the width: ");
        height = keyboard.nextDouble();
        while (height <= 0){
            System.out.println("Error: please enter a positive value > 0: ");
            height = keyboard.nextDouble();
        }
        System.out.println("For a rectangle with a base of " + base + " and the height of " + height + "\nThe area of the triangle is: " + Geometry.triangleArea(base, height));


    }

}








