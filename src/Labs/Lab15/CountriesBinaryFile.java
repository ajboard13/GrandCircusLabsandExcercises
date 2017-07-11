package Labs.Lab15;

import java.io.*;
import java.nio.file.Files;
import java.util.ArrayList;

/*
Aaron Board

7/11/2017
 */
class CountriesBinaryFile {

    void initializeBinaryCountries(ArrayList<String> countries){
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("countries.dat")));
            for (String country: countries){
                dataOutputStream.writeUTF(country+"\n");
            }
            dataOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void addCountry(String country){
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("countries.dat", true)));

            dataOutputStream.writeUTF(country +"\n");
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readBinaryCounties(){
        try {
            String[] countries = Files.readAllLines(new File("countries.dat").toPath()).toArray(new String[0]);

            for (String country : countries){
                System.out.println(country.substring(2));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
