class Box {
    float l, b, h;

    void setInfo(float x, float y, float z) {
        l = x;
        b = y;
        h = z;
    }

    void getInfo() {
        System.out.println(l);
        System.out.println("-------------------");
        System.out.println(b);
        System.out.println(h);
    }

    void getVolume() {
        float vol = l * b * h;
        System.out.println(vol);
    }

    void getSurfaceArea() {
        float surfaceA = 2 * (l * b + l * h + b * h);
        System.out.println(surfaceA);
    }
}
    public class BoxSurface {
        public static void main(String args[]) {
            Box p1 = new Box();
            Box p2 = new Box();
            p1.setInfo(1.2f, 1.2f, 1.2f);
            p2.setInfo(1.3f, 1.3f, 1.3f);

            p1.getVolume();
            p1.getSurfaceArea();
            p2.getVolume();
            p2.getSurfaceArea();

        }
    }

