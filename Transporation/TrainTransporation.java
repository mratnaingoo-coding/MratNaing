package Transporation;

public class TrainTransporation extends Passager{
    private String seatNum;
    private int trainPrice;
    private String tLocation;
    private String appointmentDate;

    public TrainTransporation (String cusName,int cusAge, int phoneNum, String cusAddress, String Email, String seatNum,int trainPrice,String tLocation, String appointmentDate ){
        super(cusName, cusAge,cusAddress, phoneNum, Email);
        System.out.println("Train Ticket Details");
        for (int i = 0; i<20;i++){
            System.out.print("*");
        }
        System.out.println();
        this.seatNum = seatNum;
        this.trainPrice= trainPrice;
        this.tLocation = tLocation;
        this.appointmentDate= appointmentDate;
    }
    @Override
    public String toString(){
        return super.toString()+
                "\nSeat No.     : "+seatNum+
                "\nPrice        : $"+trainPrice+
                "\nLocation     : "+tLocation+
                "\nDate & Time  : "+appointmentDate;

    }

    @Override
    public void show() {
        super.show();
    }
}
