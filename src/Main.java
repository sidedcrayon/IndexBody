public class Main {
    public static void main (String[] args) {
        BMIService service = new BMIService();
        double weight = 68;
        double height = 1.65;
        double index = service.calculate(weight, height);
        System.out.println("Вес = " + weight);
        System.out.println("Рост = " + height);
        System.out.println("ИМТ = " + index);
    }
}