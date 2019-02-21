package kliens;

import java.io.*;
import java.util.*;
import java.net.*;

public class Kliens {

    public static void main(String[] args) throws Exception {
        String MACHINE = "localhost";
        // String MACHINE = "127.0.0.1";
        // String MACHINE = "::1";
        int PORT = 12345;
        try (
                Socket s = new Socket(MACHINE, PORT);
                Scanner sc = new Scanner(s.getInputStream());
                PrintWriter pw = new PrintWriter(s.getOutputStream());) {
            /*pw.println("6");
			pw.flush();
                        
			pw.println("2");
			pw.flush();
                        
                        pw.println("a");
			pw.flush();*/

            System.out.println("Fajlolvasas jon");
            sendFromFile(pw);

            while (sc.hasNextInt()) {
                Integer valasz = sc.nextInt();
                System.out.println(valasz);
            }
        }
    }

    public static void sendFromFile(PrintWriter pw) {
        List<Integer> list = new ArrayList<Integer>();
        File file = new File("file.txt");
        BufferedReader reader = null;

        System.out.println("Fajlolvasas");
        try {
            reader = new BufferedReader(new FileReader(file));
            String text = null;

            while ((text = reader.readLine()) != null) {
                list.add(Integer.parseInt(text));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
            }
        }
        System.out.println(list);
        list.forEach((n) -> pw.println(n));
        pw.flush();
        //pw.println(list);
        System.out.println("Kliens var...");
        pw.println("a");
        pw.flush();
    }
}
