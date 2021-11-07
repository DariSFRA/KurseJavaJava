import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    static final int SIZE = 5;
    static final char PLAYER = '0';
    static final char COMP = 'X';
    static final char NULL = '!';
    static Scanner vvod = new Scanner(System.in);
    static Random random = new Random();
    static final char[][] POLE = new char[SIZE][SIZE];

    static void initField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                POLE[i][j] = NULL;
            }
        }
    }

    static void printField() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(POLE[i][j] + "\t");
            }
            System.out.println();
        }
    }

    static void setSet(int x, int y, char sym) {
        POLE[x][y] = sym;
    }

    static void moveHuman() {
        int x, y;
        do {
            x = vvod.nextInt() - 1;
            y = vvod.nextInt() - 1;
        } while (!isCellValid(x,y));
        POLE[y][x] = PLAYER;
    }

    static void moveID() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        POLE[y][x] = COMP;
    }

    static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (POLE[y][x] == NULL) return true;
        return false;
    }

    static boolean SpaceFree() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (POLE[i][j] == NULL) return false;
            }
        }
        return true;
    }

    static boolean chekWin(char sym) {
        for (int i = 0; i < SIZE; i++) {
            int result = 0;
            for (int j = 0; j < SIZE; j++) {
                if (POLE[i][j] == sym) result++;
            }
            if (result == SIZE) return true;
        }
        for (int i = 0; i < SIZE; i++) {
            int result = 0;
            for (int j = 0; j < SIZE; j++) {
                if (POLE[j][i] == sym) result++;
            }
            if (result == SIZE) return true;
        }

        int first = 0;
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (j == i & POLE[i][j] == sym) first++;
            }
        }
        if (first == SIZE) return true;
        int second = 0;
        for (int i = 0, j = SIZE - 1; i < SIZE && j >= 0; i++, j--) {
            if (POLE[i][j] == sym) second++;
        }
        return false; // check me!!!!
    }

    public static void main(String[] args) {
        initField();
        printField();
        while (true) {
            moveHuman();
            printField();
            if (chekWin(PLAYER)) {
                System.out.println("Победа!!");
                break;
            }
            if (SpaceFree()) {
                System.out.println("Ничья");
                break;
            }
            moveID();
            System.out.println();
            printField();
            if (chekWin(COMP)) {
                System.out.println("Проигрыш!");
                break;
            }
            if (SpaceFree()) {
                System.out.println("Ничья");
                break;
            }
        }


    }


}


