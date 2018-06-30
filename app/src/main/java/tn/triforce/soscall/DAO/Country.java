package tn.triforce.soscall.DAO;


import java.text.Collator;

/**
 * Created by noure on 19/05/2017.
 */

public class Country implements Comparable<Country> {
    private String code;
    private String name;

    public Country(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Country o) {
        //return name.compareTo(o.getName());
        final Collator instance = Collator.getInstance();

        // This strategy mean it'll ignore the accents
        instance.setStrength(Collator.NO_DECOMPOSITION);

        // Will print 0 because its EQUAL
        return instance.compare(name, o.getName());
    }
}
