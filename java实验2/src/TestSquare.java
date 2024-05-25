import java.util.Scanner;

public class TestSquare {

    public static void main(String[] args) {

        Square[] data = new Square[5];

        try (Scanner input = new Scanner(System.in)) {
            for (int i = 0; i < data.length; i++) {

                data[i] = new Square(input.nextInt());

            }
        }

        System.out.println("数组原顺序：");

        for (Square squ : data)

            System.out.println(squ.getArea());

        System.out.println("升序排序后：");

        Square.sortByArea(data);

        for (Square squ : data)

            System.out.println(squ.getArea());

    }

}

class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }

    public static void sortByArea(Square[] data) {
        for (int i = 0; i < data.length - 1; i++) {
            for (int j = i + 1; j < data.length; j++) {
                if (data[i].getArea() > data[j].getArea()) {
                    Square temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
        }
    }
}