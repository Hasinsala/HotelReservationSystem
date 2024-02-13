public class singleRoom {
    private int singleTotal;
    private double singlePricePerRoom;

    public singleRoom(int Total,double pricePerRoom){
        this.singleTotal=Total;
        this.singlePricePerRoom=pricePerRoom;

    }
    public int getSingleTotal(){
        return singleTotal;
    }
    public double getSinglePricePerRoom(){
        return singlePricePerRoom;
    }

}
