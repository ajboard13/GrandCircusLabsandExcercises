package InClassWork;

import java.io.*;

/*
Aaron Board

7/11/2017
*/
public class TextWriterDemo {
    public static void main(String[] args) {
        //write to file

        try {

            //if test.txt file does not exist FileWriter will create it.
            FileWriter writer = new FileWriter("test.txt", true);
            writer.write("Hello World2!\n");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

        //some additional things you may want to do with this.

        //make a file object that represents an existing file
        File file =  new File("test.txt");

        //make a new directory
        File dir = new File("java_june_files");

        dir.mkdir();

        // list all contents in a directory, similar to ls in command line
        if (dir.isDirectory()){
            String[] dirContents = dir.list();
            for (int i = 0; i < dirContents.length; i++) {
                System.out.println(dirContents[i]);
            }
        }

        //get absolute path
        System.out.println(dir.getAbsolutePath());

        //delete a file(returns true if successful

//        boolean isDeleted = file.delete();
//        System.out.println(isDeleted);


        //read from file
        try {

            //FileReader is a connection stream for characters that connects to a text file
            FileReader fileReader = new FileReader(file);

            //BufferedReader allows the FileReader to chain to it
            //it only goes back to check the file once the buffer is empty
            BufferedReader buff = new BufferedReader(fileReader);

            //declare a string to hold each line as its read
            String line = null;

            //this while loop says read a line of texts then assign it to line
            // while that variable is not null keep printing lines
            while ((line = buff.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
