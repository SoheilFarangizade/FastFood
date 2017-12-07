package fastfood;

public class Food {

    private double price;
    private String name;
    private String material;
    private String size;


    public Food( String name, String material, String size,double price) {
        this.price = price;
        this.name = name;
        this.material = material;
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (Double.compare(food.price, price) != 0) return false;
        if (name != null ? !name.equals(food.name) : food.name != null) return false;
        if (material != null ? !material.equals(food.material) : food.material != null) return false;
        return size != null ? size.equals(food.size) : food.size == null;
    }

    @Override
    public String toString() {
        return "Food{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", material='" + material + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}
