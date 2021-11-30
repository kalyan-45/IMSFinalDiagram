import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("C:\\Users\\ishwar.soni\\Downloads\\Output File.txt");
            writer.write("This will be printed in My Output File.\n");
            writer.write("This will be second line.\n");
            writer.write("This will be third line, and so on.\n");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Done");
    }
}
 