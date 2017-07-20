package Labs.Lab15.dao;

import java.util.ArrayList;

/*
Aaron Board
 */
public interface CountriesDao {
    public static final int TEXT = 1;
    public static final int BINARY = 2;



    public void writeCountries(ArrayList<String> countries);
    public void read();
    public void addCountry(String country);
    public String getPath();


}
