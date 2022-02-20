package HomeWorkEasy1502;

import java.util.Scanner; //добавлен коммент

public class Main {
    public static void main(String[] args) {
        Arithmetic geometric = new Arithmetic();
        Scanner console = new Scanner(System.in);
        geometric.setX(console.nextInt());
        geometric.setY(console.nextInt());

    }
}
