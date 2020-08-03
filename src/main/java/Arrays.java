import java.util.ArrayList;
import java.util.List;

public class Arrays {
    public int[] newArr(int[] a) {
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 4) {
                index = i;
            }
        }
        if (index == -1) {
            throw new RuntimeException();
        }
        int size = a.length - index -1;
        int[] b = new int[size];
        System.arraycopy(a, index+1, b, 0, size);
        return b;
    }

    public boolean checkArr(int[] a) {
        boolean check1 = false;
        boolean check4 = false;

        for (int i = 0; i < a.length; i++) {
            if(a[i] != 4 && a[i] !=1) {
                return false;
            }
            if (a[i] == 1) {
                check1 = true;
            }
            if (a[i] == 4) {
                check4 = true;
            }


        }
        return check1 && check4;
    }
}