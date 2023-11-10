import java.util.Scanner;

class BoxDemo {
    int length;
    int height;
    int width;
    int v;

    BoxDemo() {
        System.out.println("ha");
    }

    void setValue(int l, int h, int w) {
        length = l;
        height = h;
        width = w;
    }

    void vol() {
        v = length * height * width;
        System.out.println("volume is " + v);
    }
}

class Box {
    public static void main(String[] args) {
        int l, h, w;
        BoxDemo bd = new BoxDemo();
        Scanner sc = new Scanner(System.in);

        l = sc.nextInt();
        h = sc.nextInt();
        w = sc.nextInt();
        bd.setValue(l, h, w);
        bd.vol();
        System.out.println("enter the value for length, height , width ");
    }
}
