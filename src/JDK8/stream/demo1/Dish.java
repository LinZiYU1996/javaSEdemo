package JDK8.stream.demo1;


import JDK8.stream.dividing.CalLevel;

/*
*
 * @Author Mr.Lin
 * @Description //TODO
 * @Date 21:07 2019/4/21
 **/
public class Dish {

    private final String name;
    private final boolean vegetarian;
    private final int calories;
    private final Type type;
    public Dish(String name, boolean vegetarian, int calories, Type type) {
        this.name = name;
        this.vegetarian = vegetarian;
        this.calories = calories;
        this.type = type;
    }
    public String getName() {
        return name;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public int getCalories() {
        return calories;
    }
    public Type getType() {
        return type;
    }
    public CalLevel getCaloricLevel(){
        if (this.getCalories() <= 400) return CalLevel.DIET;
        else if (this.getCalories() <= 700) return CalLevel.NORMAL;
        else return CalLevel.FAT;
    }



    @Override
    public String toString() {
        return name;
    }

    public enum Type { MEAT, FISH, OTHER }

    //List<Dish> menu = Arrays.asList(
    // new Dish("pork", false, 800, Dish.Type.MEAT),
    // new Dish("beef", false, 700, Dish.Type.MEAT),
    // new Dish("chicken", false, 400, Dish.Type.MEAT),
    // new Dish("french fries", true, 530, Dish.Type.OTHER),
    // new Dish("rice", true, 350, Dish.Type.OTHER),
    // new Dish("season fruit", true, 120, Dish.Type.OTHER),
    // new Dish("pizza", true, 550, Dish.Type.OTHER),
    // new Dish("prawns", false, 300, Dish.Type.FISH),
    // new Dish("salmon", false, 450, Dish.Type.FISH) );
}
