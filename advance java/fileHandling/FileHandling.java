import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

    public static void main(String[] args) throws IOException{
    
        File file = new File("//home/mutharasu/Documents/Training10x/Java/advance java/fileHandling/text/temp.txt");
        // System.out.println("Able to read the file : "+ file.canRead());
        // System.out.println("Able to write the file : "+ file.canWrite());
        // System.out.println("Able to execute the file : "+ file.canExecute());
        // if(!file.exists())
        // {
        //     // mkdir() method is used to create a directory
        //     // mkdirs() method is used to create a directory and its parent directories
        //     try {
        //         boolean isCreated = file.createNewFile();
        //         System.out.println("Directory created: "+isCreated);
                
        //     } 
        //     catch (IOException e) {
        //         e.printStackTrace();
        //     }
        

        //}

        // list of files in the directory
        // String [] filenames = file.list();
        // File[] files = file.listFiles();
        // for(File tempFile : files){
        //     String name = tempFile.getName();

        //     if(name.endsWith(".pdf"))
        //         System.out.println(name);
        // }
         
        FileWriter writer = new FileWriter(file);
        // writer.write("Hello World");
        // writer.flush();
        // writer.close();
        
        // FileReader reader = new FileReader(file);
        // int output = reader.read();
        // while(output != -1){
        //     System.out.println((char)output);
        //     output = reader.read();
        // }

        // BufferedWriter and BufferReader

        BufferedWriter bWriter = new BufferedWriter(writer);
        bWriter.write("Hello World");
        bWriter.newLine();
        bWriter.write("Happy life");
        bWriter.flush();
        bWriter.close();


        BufferedReader bReader = new BufferedReader(new FileReader(file));
        String line = bReader.readLine();
        int counter=0;
        while(line != null){
            counter++;
            System.out.println(line);
            line = bReader.readLine();
        }
        bReader.close();
        System.out.println("Number of lines in the file: "+counter);
    }
}