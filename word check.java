class Exp100 {

    public static void main(String[] args) throws Exception {
        System.out.println("enter the word ");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        String g = sc.next();

        java.io.BufferedReader br = new java.io.BufferedReader(
                new java.io.FileReader("C:/Users/Asus/Documents/java/Bsud.txt"));

        int cunt = 0;
        String i;

        while ((i = br.readLine()) != null) {

            String[] w = i.split(" ");
            for (String f : w) {
                if (f.equals(g)) {
                    cunt++;
                    System.out.print("the given word  " + f);
                }

            }
        }
        if (cunt == 1)
            System.out.println(" is present for " + cunt + " time in file Bsud.txt");
        else
            System.out.println("given word " + g + " is not present in file Bsud.txt ");
        br.close();

    }

}