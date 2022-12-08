import java.io.*;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Tote tote1 = new Tote("Привет ", "08.12.22",TypeTote.ACTULLY_NOTE);
        Tote tote2 = new Tote(" мир ", "01.13.23",TypeTote.CHRONICLE);
        Tote tote3 = new Tote(" ёоу ", "07.14.24",TypeTote.EXTENDED_INFO);
         Contacts contacts = new Contacts("Привет ", "08.12.12", TypeTote.ACTULLY_NOTE, "0550346723", "Друг",TypeNumber.URDAN);
         Contacts contacts1 = new Contacts("Привет ", "23.03.24", TypeTote.CHRONICLE, "0700443355", "Друг",TypeNumber.MOBILE);
         Contacts contacts2 = new Contacts("Привет ", "30.06.23", TypeTote.EXTENDED_INFO, "02201861533", "Друг",TypeNumber.URDAN);


        BufferedReader br = null;
        try {
            File file = new File("newFile.txt");
            if(!file.exists())
                file.createNewFile();
            PrintWriter pw = new PrintWriter(file);
            pw.println(tote1);
            pw.println(tote2);
            pw.println(tote3);
            pw.println(contacts1);
            pw.println(contacts2);
            pw.println(contacts);
            pw.close();

            br = new BufferedReader(new FileReader(" NoteBook.txt"));
            String line;
            while ((line = br.readLine()) !=null){
                System.out.println(line);
            }

        }catch (IOException e){
            System.out.println("Ошибка "+e);
        }
        finally {
            try {
                br.close();
            }catch (IOException e){
                System.out.println("ошибка ей"+e);
            }
        }
    }
}
