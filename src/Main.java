public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double a = 1.87; // рост
        double m = 98; // вес
        int index = service.calculate(a, m);
        System.out.println(index);
    }
}