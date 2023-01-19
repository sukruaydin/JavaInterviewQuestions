package rectangle;

public class Rectangle {

    public static void main(String[] args) {

        int width = 4;
        int length = 9;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < length; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
