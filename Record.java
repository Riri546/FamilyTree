package FamilyTree;

import java.io.*;

public class Record {
    public static void main(String[] args) {
        
        try(FileWriter writer = new FileWriter("notes3.txt", false))
        {
           // запись всей строки
            String text = "Hello Gold!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append('E');
             
            writer.flush();
        }
        catch(IOException ex){
             
            System.out.println(ex.getMessage());
        } 
    } 
}
