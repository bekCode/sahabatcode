package juarakoding.com.sahabatcode;


public class Country {
    int id;
    String CountryName;

    public Country(int i, String countryName) {
        super();
        this.id = i;
        this.CountryName = CountryName;


    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }
}
