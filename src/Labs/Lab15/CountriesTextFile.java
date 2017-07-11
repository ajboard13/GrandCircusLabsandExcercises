package Labs.Lab15;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

/*
Aaron Board

7/11/2017
*/
public class CountriesTextFile {
    void writeCountriesToFile(ArrayList<String> countries){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("countries.txt"));
            for (String country: countries){
                bufferedWriter.write(country+"\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    void addCountry(String country){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("countries.txt", true));
            bufferedWriter.write(country+"\n");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readCountries(){
        String[] countries;
        try {
            countries = Files.readAllLines(new File("countries.txt").toPath()).toArray(new String[0]);
            for (String country : countries){
                System.out.println(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
