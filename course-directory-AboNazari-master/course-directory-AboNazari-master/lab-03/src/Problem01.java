import java.util.Scanner;

public class Problem01 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Calculator of Rational Numbers");
        System.out.println("==============================");
        System.out.println("Press Ctrl-Z/D to exit");

//       Reading First Rational
//       Checking the Exceptions

        while (true) {

            Rational first = null;
            while (true) {
                System.out.print("First rational: ");
                String a = null;
                try {
                    if (sc.hasNextLine()) {
                        a = sc.nextLine();
                        first = Rational.parseRational(a);
                        break;
                    } else {
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Can't parse" + e.getMessage().split(":")[1] + " as input. ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Can't parse " + a + " as input. ");
                } catch (Exception e) {
                    System.out.println("Wrong input! Please check your input.");
                }
            }


//        Reading the Operator
//        checking the Operator
            String op = null;
            String[] operators = {"+", "-", "*", "/", ">", "<"};

            while (true) {
                System.out.print("Operator: ");
                try {
                    if (sc.hasNextLine()) {
                        op = sc.nextLine();
                        for (int i = 0; i < operators.length; i++) {
                            if (operators[i].equals(op)) {
                                break;
                            } else if (!operators[i].equals(op) && i == operators.length - 1) {
                                throw new Exception(op + " is not a valid Operator!");
                            }
                        }
                        break;
                    } else {
                        System.exit(0);
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

//        Reading Second Rational
//        Checking the Exceptions
            Rational second = null;
            while (true) {
                System.out.print("Second rational: ");
                String b = null;
                try {
                    if (sc.hasNextLine()) {
                        b = sc.nextLine();
                        second = Rational.parseRational(b);
                        break;
                    } else {
                        System.exit(0);
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Can't parse" + e.getMessage().split(":")[1] + " as input. ");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Error: Can't parse " + b + " as input. ");
                } catch (Exception e) {
                    System.out.println("Wrong input! Please check your input.");
                }
            }


//        Perform the Operations
            switch (op) {
                case "+" -> System.out.println("Result: " + first.add(second).toString());
                case "-" -> System.out.println("Result: " + first.subtract(second).toString());
                case "*" -> System.out.println("Result: " + first.multiply(second).toString());
                case "/" -> System.out.println("Result: " + first.divide(second).toString());
                case ">", "<" -> {
                    if (first.compareTo(second) == 1) {
                        System.out.println("Result: True");
                    } else if (first.compareTo(second) == -1) {
                        System.out.println("Result: False");
                    }
                }
                default -> {
                    System.out.println("Something Went Wrong!");
                    System.exit(1);
                }
            }
        }
    }
}
