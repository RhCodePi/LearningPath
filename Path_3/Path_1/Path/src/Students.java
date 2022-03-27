

public class Students {
    private String idNo;
    private String name;
    private String address;

    public Students(String idNo, String name, String address)
    {
        this.idNo = idNo;
        this.name = name;
        this.address = address;
    }
    @Override
    public String toString() {
        
        return idNo + "-" + name + "-" + address;
    }
}
