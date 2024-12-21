package Model;

public class Items {
    private String id ;
    private String name ;
    private int qty;
    private double amount;
    private String discrioption;


    public Items(String id, String name, int qty, double amount, String discrioption) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.amount = amount;
        this.discrioption = discrioption;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDiscrioption() {
        return discrioption;
    }

    public void setDiscrioption(String discrioption) {
        this.discrioption = discrioption;
    }
}
