public abstract class Konut {
    private String address;

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Konut(String address){
        setAddress(address);
    }

    public String displayInfo(){
        return getAddress();
    }
}
