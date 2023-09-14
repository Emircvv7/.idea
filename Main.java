public class Main {
    public static void main(String[] args) {
        System.out.println(WeatherAndAge(25, 10));
        System.out.println(WeatherAndAge(18, 25));
        System.out.println(WeatherAndAge(50, 20));
        System.out.println(WeatherAndAge(30, 35));
        System.out.println(WeatherAndAge(20, -5));
    }
    public static String WeatherAndAge(int age, int temperature) {
        if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                (age < 20 && temperature >= 0 && temperature <= 28) ||
                (age > 45 && temperature >= -10 && temperature <= 25)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }
}


