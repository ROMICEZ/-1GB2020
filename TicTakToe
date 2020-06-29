import java.util.Scanner;
import java.util.Random;


class TicTacToe {

    public  final int SIZE = 5; //размер игрового поля
    public  final char DOT_X = 'x'; //игрок
    public  final char DOT_O = 'o'; //ИИ
    public  final char DOT_EMPTY = '.'; //пустая ячейка поля
    public  char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();


    public static void main (String[] args) {
        new TicTacToe().go();
    }

    public  void go() { //запуск игры
        initMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Вы выйграли!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Вы проиграли!");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Выйграл компьютер!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Конец игры.");
    }

    public  void initMap() { //инициализация поля
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public  void humanTurn() { //ход человека
        int x, y;
        do {
            System.out.println("Вы ходите за X , выбарием столбец и колонку  от (1-5):");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public  void aiTurn() { //ход ИИ
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        map[y][x] = DOT_O;
    }

    public  void printMap() { //вывод поля в консоль
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE;j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public  boolean checkWin(char dot) { //проверка победы
        int diag1, diag2, hor, ver;
        for (int i = 0; i < SIZE; i++) {
            hor = 0; ver = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == dot) {
                    hor++;
                }
                if (map[j][i] == dot) {
                    ver++;
                }
            }
            if (hor == SIZE|| ver == SIZE) {
                return true; //проверка по горизонтали и вертикали
            }
        }
        diag1 = 0; diag2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == dot) {
                diag1++;
            }
            if (map[i][SIZE - i - 1] == dot) {
                diag2++;
            }
        }
        if (diag1 == SIZE || diag2 == SIZE) {
            return true; //проверка по диагоналям
        }
        return false;
    }

    public  boolean isMapFull() { //проверка на заполненность поля
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public  boolean isCellValid(int x, int y) { //поиск свободной ячейки
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }
}
