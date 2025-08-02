
class problem1 {

    public static void main(String arp[]) {
        int t = 0, m = 2, n = 3, x[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, nlen = m, y = 0;
        boolean triger = true;
        while (t != x.length) {
            if (triger == true) {
                if (t != nlen) {
                    y++;
                } else {
                    nlen = nlen + n;
                    triger = false;
                }
            }
            if (triger == false) {
                if (t < nlen) {
                    x[t] = 0;
                } else {
                    nlen = nlen + m;
                    triger = true;
                }
            }
            t++;
        }
        // final display.......
        for (int i = 0; i < x.length; i++) {
            if (x[i] == 0) {
                continue;
            }
            System.out.println(x[i]);
        }
    }
}