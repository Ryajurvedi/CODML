class Exp252 {
    public static void main(String[] args) throws Exception {
        String g = "my name is salim shday";

        java.io.BufferedWriter bw = new java.io.BufferedWriter(new java.io.FileWriter("Bsud.txt", true));

        bw.write("\n" + g);
        bw.close();
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader("Bsud.txt"));
        int cunt = 0;
        String s = br.readLine();
        while (s != null) {
            String words[] = s.split(" ");
            System.out.println(s);
            cunt = cunt + words.length;

            s = br.readLine();
        }
        System.out.println("word count    " + cunt);
    }
}