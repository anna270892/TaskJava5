public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float calculation = service.calculate(55.0f, 1.63f);
        System.out.println((int) calculation);
    }
}