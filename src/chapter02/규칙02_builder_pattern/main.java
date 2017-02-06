package chapter02.규칙02_builder_pattern;

/**
 * Created by star.no
 * on 2017. 2. 6..
 */
public class main {
    public static void main(String[] args) {
        NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).
                calories(100).sodium(35).carbohydrate(27).build();
        System.out.println(cocaCola);
    }
}
