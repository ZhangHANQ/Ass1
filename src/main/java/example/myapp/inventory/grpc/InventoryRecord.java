package example.myapp.inventory.grpc;

public class InventoryRecord {
    String InventoryID;
    String Name;
    String Description;
    int UnitPrice;
    int QuantityInStock;
    int InventoryValue;
    int ReOrderValue;
    int ReOrderTime;
    int QuantityInReorder;
    boolean DisContinued;

    public InventoryRecord() {
    }

    public InventoryRecord(String InventoryID, String Name, String Description, int UnitPrice, int QuantityInStock, int InventoryValue, int ReOrderValue, int ReOrderTime, int QuantityInReorder, boolean DisContinued) {
        this.InventoryID = InventoryID;
        this.Name = Name;
        this.Description = Description;
        this.UnitPrice = UnitPrice;
        this.QuantityInStock = QuantityInStock;
        this.InventoryValue = InventoryValue;
        this.ReOrderValue = ReOrderValue;
        this.ReOrderTime = ReOrderTime;
        this.QuantityInReorder = QuantityInReorder;
        this.DisContinued = DisContinued;
    }

    /**
     * 获取
     * @return InventoryID
     */
    public String getInventoryID() {
        return InventoryID;
    }

    /**
     * 设置
     * @param InventoryID
     */
    public void setInventoryID(String InventoryID) {
        this.InventoryID = InventoryID;
    }

    /**
     * 获取
     * @return Name
     */
    public String getName() {
        return Name;
    }

    /**
     * 设置
     * @param Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取
     * @return Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * 设置
     * @param Description
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取
     * @return UnitPrice
     */
    public int getUnitPrice() {
        return UnitPrice;
    }

    /**
     * 设置
     * @param UnitPrice
     */
    public void setUnitPrice(int UnitPrice) {
        this.UnitPrice = UnitPrice;
    }

    /**
     * 获取
     * @return QuantityInStock
     */
    public int getQuantityInStock() {
        return QuantityInStock;
    }

    /**
     * 设置
     * @param QuantityInStock
     */
    public void setQuantityInStock(int QuantityInStock) {
        this.QuantityInStock = QuantityInStock;
    }

    /**
     * 获取
     * @return InventoryValue
     */
    public int getInventoryValue() {
        return InventoryValue;
    }

    /**
     * 设置
     * @param InventoryValue
     */
    public void setInventoryValue(int InventoryValue) {
        this.InventoryValue = InventoryValue;
    }

    /**
     * 获取
     * @return ReOrderValue
     */
    public int getReOrderValue() {
        return ReOrderValue;
    }

    /**
     * 设置
     * @param ReOrderValue
     */
    public void setReOrderValue(int ReOrderValue) {
        this.ReOrderValue = ReOrderValue;
    }

    /**
     * 获取
     * @return ReOrderTime
     */
    public int getReOrderTime() {
        return ReOrderTime;
    }

    /**
     * 设置
     * @param ReOrderTime
     */
    public void setReOrderTime(int ReOrderTime) {
        this.ReOrderTime = ReOrderTime;
    }

    /**
     * 获取
     * @return QuantityInReorder
     */
    public int getQuantityInReorder() {
        return QuantityInReorder;
    }

    /**
     * 设置
     * @param QuantityInReorder
     */
    public void setQuantityInReorder(int QuantityInReorder) {
        this.QuantityInReorder = QuantityInReorder;
    }

    /**
     * 获取
     * @return DisContinued
     */
    public boolean isDisContinued() {
        return DisContinued;
    }

    /**
     * 设置
     * @param DisContinued
     */
    public void setDisContinued(boolean DisContinued) {
        this.DisContinued = DisContinued;
    }

    public String toString() {
        return "example.myapp.inventory.grpc.InventoryRecord{InventoryID = " + InventoryID + ", Name = " + Name + ", Description = " + Description + ", UnitPrice = " + UnitPrice + ", QuantityInStock = " + QuantityInStock + ", InventoryValue = " + InventoryValue + ", ReOrderValue = " + ReOrderValue + ", ReOrderTime = " + ReOrderTime + ", QuantityInReorder = " + QuantityInReorder + ", DisContinued = " + DisContinued + "}";
    }
}
