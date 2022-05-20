package Static;

public class Static {
    private int rollno;
    private String name;
    private static String college = "BBDIT";

    Static(int r, String n) {
        rollno = r;
        name = n;
    }

    static void change() {
        college = "codegym";
    }

    void HienThi() {
        System.out.println(rollno + " " + name + " " + college);
    }
}

class KiemTraStaTic {
    public static void main(String[] args) {
        Static.change();
        Static s1 = new Static(111, "Hoang");
        Static s2 = new Static(222, "Khanh");
        Static s3 = new Static(333, "Nam");
        s1.HienThi();
        s2.HienThi();
        s3.HienThi();
    }
}

