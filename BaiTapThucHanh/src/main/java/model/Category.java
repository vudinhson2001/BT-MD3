package model;

public class Category {
    private int id;
    private int productId;
    private int name;

    public Category() {
    }

    public Category(int id, int productId, int name) {
        this.id = id;
        this.productId = productId;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }
}
