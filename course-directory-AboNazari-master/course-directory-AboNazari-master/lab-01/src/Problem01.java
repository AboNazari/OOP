import java.util.Scanner;

public class Problem01 {
    // Field's State
    static final char EMPTY_CELL = '.';
    static final char MARKED_CELL = '*';
    static final char TURTLE_CELL = 'T';
    static final int FIELD_WIDTH = 20;
    static final int FIELD_HEIGHT = 20;
    static char[][] field;

    // Turtle's State
    static int x, y;
    static int dx, dy;
    static boolean penDown;

    // Field's Services/Behaviour
    static void constructField() {
        field = new char[FIELD_HEIGHT][FIELD_WIDTH];
        for (int y = 0; y < FIELD_HEIGHT; ++y) {
            for (int x = 0; x < FIELD_WIDTH; ++x) {
                field[y][x] = EMPTY_CELL;
            }
        }
    }

    static void displayField() {
        for (int y1 = 0; y1 < FIELD_HEIGHT; ++y1) {
            for (int x1 = 0; x1 < FIELD_WIDTH; ++x1) {
                boolean isTurtle = (x1 == x && y1 == y);
                System.out.print(isTurtle ? TURTLE_CELL : field[y1][x1]);
            }
            System.out.println();
        }
    }

    static boolean areCoordsInsideField(int x, int y) {
        return x >= 0 && x < FIELD_WIDTH && y >= 0 && y < FIELD_HEIGHT;
    }

    static void markField(int x, int y) {
        if (areCoordsInsideField(x, y)) {
            field[y][x] = MARKED_CELL;
        }
    }

    // Turtle's Services/Behaviour
    static void constructTurtle() {
        x = y = 0;
        dx = 1;
        dy = 0;
        penDown = false;
    }

    static void putPenUp() {
        penDown = false;
    }

    static void putPenDown() {
        penDown = true;
    }

    static void turnRight() {
        int temp = dx;
        dx = -dy;
        dy = temp;
    }

    static void turnLeft() {
        int temp = dx;
        dx = dy;
        dy = -temp;
    }

    static void move(int steps) {
        for (int i = 0; i < steps; ++i) {
            int nextX = x + dx;
            int nextY = y + dy;
            if (!areCoordsInsideField(nextX, nextY)) {
                break;
            }

            if (penDown) {
                markField(x, y);
            }

            x = nextX;
            y = nextY;
        }
    }

    public static void main(String[] args) {
        constructField();
        constructTurtle();

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine(); // "turn-left", "move 12"
            String[] parts = input.split(" "); // { "turn-left" }, { "move", "12" }
            if (!(parts.length > 0 && parts[0].trim().length() > 0)) {
                System.out.println("Error: Invalid input.");
                continue;
            }
            String command = parts[0].trim();
            switch (command) {
                case "pen-up":
                    putPenUp();
                    break;
                case "pen-down":
                    putPenDown();
                    break;
                case "turn-right":
                    turnRight();
                    break;
                case "turn-left":
                    turnLeft();
                    break;
                case "move":
                    if (!(parts.length == 2 && parts[1].trim().length() > 0)) {
                        System.out.println("Error: Invalid input.");
                        continue;
                    }
                    int steps = Integer.parseInt(parts[1]);
                    move(steps);
                    break;
                case "display":
                    displayField();
                    break;
                case "exit":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Unrecognized command.");
                    break;
            }
        }
    }
}
