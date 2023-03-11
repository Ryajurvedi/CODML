class Exp101 {

    public static void main(String[] args) throws Exception {

        System.out.println("enter the string");
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter("Bsud2.txt", true));

        String s = br.readLine();
        char[] ch = new char[s.length()];
        int c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            // System.out.println((char) (c + 3));
            ch[i] = (char) (c + 3);
            // bw.write("\n encoded " + ((char) (c + 3)));

        }
        bw.write(" \n ecoded ");
        bw.write(ch);
        // System.out.println();
        System.out.println(ch);
        char cl[] = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int a = (int) ch[i];
            // System.out.println(ch);
            cl[i] = (char) (a - 3);
            // bw.write("\n decoded " + (char) (a - 3));

        }
        bw.write(" \n decoded ");
        bw.write(cl);

        bw.close();
        System.out.println(cl);

    }

}