package yvc.ex3;

public class WeakClass {
    public static int WeakMethod1(int a, int b) {
        if (a>3) {
            return a+b;
        }
        else {
            return a/b;
        }
    }

    public static int WeakMethod2(int a, int b) {
        if (a>3) {
            return a+b;
        }

        return a/b;
    }

    public static int WeakMethod3(int a, int b) {
        if (a>7) {
            return a+b;
        }
        else if (a<7) {
            return a-b;
        }

        return a/b;
    }

    public static int WeakMethod4(int a, int b) {
        if (b != 0 || a == 20) {
            return a/b;
        } else {
            return -1;
        }
    }

}
