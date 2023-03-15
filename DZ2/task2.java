package DZ2;

import java.io.File;
import java.io.FileReader;

public class task2 {
    public static void main(String[] args) {
        parse();
    }
    public static void parse() {
        
        try {
            String file_name = "text_task2.txt";
            File file = new File(file_name);
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()];
            f.read(a);
            StringBuilder sb = new StringBuilder();
            for (char c : a) {
                sb.append(c);
            }
            f.close();
            String line = sb.toString();
            line = line.replace("фамилия", "Студент");
            line = line.replace("оценка", "получил(а)");
            line = line.replace("предмет", "по предмету");
            line = line.replace("\"", "");
            line = line.replace(":", " ");
            line = line.replace(",", " ");
            System.out.println(line);
            
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
    
}
