class PizzaOrder {
public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    DecimalFormat dF = new dF("#.##");

    //  Variables
    String first_Name; // first name of customer
    char crust_Type;
    String crust; // name of crust
    String toppings = "Plain";
    int inches; // size of pizza
    double cost = 0.00; // pizza cost
    final double tax_Rate = 0.05; // amount in tax owed
    double total; // total cost of pizza & toppings
    double last_Total; // total of all items
    

    // Asks for users' name
    System.out.println("Enter your name: ");
    first_Name = keyboard_nextLine();
    
    //Asks for distance 
    double distance = 0;
    double delivery_fee = 0;
    System.out.println("Enter total distance in miles from pizza shop:");
    System.out.println("If picking up from the store, enter '0' for total distance: ");
    distance = keyboard_nextDouble();
    if (distance == 0) {
        delivery_fee = 0;
    } else if (distance > 0) {
        deliveryfee = ((distance * 0.5) + 1.5);
        System.out.println("Your delivery fee is: $" + dF.format(delivery_fee));
    }

    // Prompts for pizza size
    System.out.print("What size of pizza would you like (diameter in inches)? (8, 12, 16, or 20) ");
    inches = keyboard_nextInt();
    if (inches == 8) {
      cost = 9.50;
    } else if (inches == 12) {
        cost = 11.50;
    } else if (inches == 16) {
        cost = 14.50;
    } else if (inches == 20) {
        cost = 18.00;
    } else if (inches != inches) {
        System.out.println("Invalid response! Please enter what size pizza you would like. ");
    }
    keyboard_nextLine();

    // Asks customer for crust preference
    System.out.print("What type of crust do you want? (P)an-Made, (T)hin-Crust, (O)ven-Baked, or (N)ew-York Buttery (enter P, T, O, or N,): ");
    crustType = keyboard_nextLine().charAt(0);
    
    if (crust_Type == 'P') {
        crust = "Pan-Made";
    } else if (crust_Type == 'T') {
        crust = "Thin-Crust";
    } else if (crust_Type == 'O') {
        crust = "Oven-Baked";
    } else if (crust_Type == 'N') {
      crust = "New-York Buttery";
    } else if (crustType != 'P' && crustType != 'T' && crustType != 'O' && crustType != 'N') {
        System.out.println("You have entered an invalid crust type. Please try again! ");
    }

 // Calculations total cost
    System.out.println(cost);
    System.out.println(deliveryfee);
    total = (cost) + (deliveryfee);
    tax = total * taxRate;
    lastTotal = total * (1 + taxRate);

    // Payment Confirmation
    System.out.println(firstName + ", here's your order:");
    System.out.println(inches + " inch pizza");
    System.out.println(crust);
    System.out.println("Order Cost: $" + df.format(total));
    System.out.println("Tax: $" + df.format(tax));
    System.out.println("Total Due: $" + df.format(lastTotal));
  }
