import java.util.*;

class Exp250 extends Thread {
    int[] x = new int[1000];
    int[] m = new int[1000];
    int[] v = new int[1000];
    int[] k = new int[1000];
    int[] w = new int[1000];
    List al = new ArrayList();
    List al2 = new ArrayList();

    /**
     * 
     */
    public void prime() {
        // notify();

        for (int n = 0; n < 1001; n++) {
            int i = 1;
            int cunt = 0;
            while (i <= n) {
                if (n % i == 0)
                    cunt++;
                i++;

            }
            if (cunt == 2) {

                System.out.println("prime numbers are " + n);
                al.add(n);
                // x[i] = n;
                // k[i] = x[i];
                // System.out.println("array of prime is " + x[i]);
            }
        }

    }

    public void fibo() {
        // notify();
        int a = 0;
        int b = 1;
        int c = 0;
        m[0] = 0;
        m[1] = 1;
        System.out.println("the fibo series is " + m[0]);
        System.out.println("the fibo series is " + m[1]);
        for (int i = 2; i < 16; i++) {
            c = a + b;
            System.out.println("the fibo series is " + c);
            al2.add(c);

            // m[i] = c;
            a = b;
            b = c;
            // w[i] = m[i];

            // System.out.println("array is " + m[i]);
        }
    }

    /**
     * 
     */
    public void match() {

        al.retainAll(al2);
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println("the matched numbers are  " + it.next());
        }

        // for (int i = 0; i < k.length; i++) {
        // for (int j = 0; j < w.length; j++) {
        // if (k[i] == w[j]) {
        // v[i] = w[j];
        // // System.out.println("common : " + v[j]);
        // }
        // }
        // int e;
        // if (v[i] != 0) {
        // e = v[i];
        // System.out.println("common numbers are : " + e);
        // }
        // }

    }

}

class Exp251 {

    public static void main(String[] args) throws InterruptedException {
        Exp250 e = new Exp250();

        new Thread() {
            public void run() {
                e.prime();
            }
        }.start();

        new Thread() {

            public void run() {

                e.match();
            }

        }.start();

        Thread t = new Thread() {

            public void run() {

                e.fibo();
            }

        };
        t.start();
        t.join();
    }
}