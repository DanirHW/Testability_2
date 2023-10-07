public class BmiService {
    public int calculate(double a, double m) {
        double result;
        result = m / (a * a);
        return (int) result;
    }
}
