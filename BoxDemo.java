import java.util.Scanner;

class BoxDemo {
    int length;
    int height;
    int width;

    BoxDemo() {
        System.out.println("Constructor of BoxDemo...");
    }

    void setValue(int l, int h, int w) {
        length = l;
        height = h;
        width = w;
    }
}

class Box {
    public static void main(String[] args) {
        int l, h, w;
        BoxDemo bd = new BoxDemo();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length, height, and width:");
        l = sc.nextInt();
        h = sc.nextInt();
        w = sc.nextInt();

        bd.setValue(l, h, w);

        // You can access the values set in BoxDemo
        System.out.println("Length: " + bd.length);
        System.out.println("Height: " + bd.height);
        System.out.println("Width: " + bd.width);
    }
}
