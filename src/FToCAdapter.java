// FToCAdapter.java
public class FToCAdapter {
    private FToKConverter fToKConverter;

    public FToCAdapter(FToKConverter fToKConverter) {
        this.fToKConverter = fToKConverter;
    }

    public double convert(double fahrenheit) {
        double kelvin = fToKConverter.convert(fahrenheit);
        return kelvin - 273.15;
    }
}
