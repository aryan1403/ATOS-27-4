public class Car {
    String brandName;
    String modelName;
    int price;
    String color;
    String petrolOrFuel;
    boolean bs6Engine;

    public Car(String brandName, String modelName, int price, String color, String petrolOrFuel, boolean bs6Engine) {
        this.brandName = brandName;
        this.modelName = modelName;
        this.price = price;
        this.color = color;
        this.petrolOrFuel = petrolOrFuel;
        this.bs6Engine = bs6Engine;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPetrolOrFuel() {
        return petrolOrFuel;
    }

    public void setPetrolOrFuel(String petrolOrFuel) {
        this.petrolOrFuel = petrolOrFuel;
    }

    public boolean isBs6Engine() {
        return bs6Engine;
    }

    public void setBs6Engine(boolean bs6Engine) {
        this.bs6Engine = bs6Engine;
    }
    
    
    public void meow() {
        System.out.println("meow meow");
    }
    @Override
    public String toString() {
        return "Car [brandName=" + brandName + ", bs6Engine=" + bs6Engine + ", color=" + color + ", modelName="
                + modelName + ", petrolOrFuel=" + petrolOrFuel + ", price=" + price + "]";
    }

    

    
}