/**
 *
 * @author laloschjetnan
 */
public class DataValue{
  private String sex;
    private String country;
    private int year;
    private double literacyPercent;
 
    public DataValue(String sex, String country, int year, double literacyPercent) {
        this.sex = sex;
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
 
    public double getLiteracyPercent() {
        return literacyPercent;
    }
 
    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.sex + ", " + this.literacyPercent;
    }

}
