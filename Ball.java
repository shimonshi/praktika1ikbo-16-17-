public class Ball {

    public String material;
    public String color;
    public int price;
    public double radius;

    public String toString() {
        return material + color + price + radius;
    }

    public Ball(String material, String color, int price, double radius) {

        this.material = material;
        this.color = color;
        this.price = price;
        this.radius = radius;
    }


}
