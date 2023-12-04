package Transporation;

public class CarTransporation extends Passager {
    private String seatNum;
    private int price;
    private int tax;
    private String location;
    private String dateAndTime;


    public CarTransporation(String cusName, int cusAge, int phoneNum, String cusAddress, String Email,String seatNum, int price,int tax, String location, String dateAndTime) {
        super(cusName, cusAge, cusAddress,phoneNum ,Email);
        System.out.println("Bus Ticket Details");
        for (int i = 0; i<20;i++){
            System.out.print("*");
        }
        System.out.println();
        this.seatNum = seatNum;
        this.price = price;
        this.tax = tax;
        this.location = location;
        this.dateAndTime= dateAndTime;
    }


    public double calculation(){
        return price - tax;
    }
    public String toString(){
        return super.toString()+
                "\nSeat No.     : "+seatNum+
                "\nPrice        : $"+calculation()+
                "\nLocation     : "+location+
                "\nDate & Time  : "+dateAndTime;
    }

    @Override
    public void show() {
        super.show();
    }
}
