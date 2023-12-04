package Transporation;

public class Passager {
    private String cusName;
    private int cusAge;
    private int phoneNum;
    private String cusAddress;
    private String Email;

    public Passager(String cusName, int cusAge, String cusAddress, int phoneNum, String Email){
        this.cusName = cusName;
        this.cusAge = cusAge;
        this.cusAddress=cusAddress;
        this.phoneNum= phoneNum;
        this.Email = Email;
    }

    @Override
    public String toString(){
        return  "Name         : "+cusName+
                "\nAge          : "+cusAge+
                "\nAddress      : "+cusAddress+
                "\nPhone        : "+phoneNum+
                "\nEmail        : "+Email;
    }
    public void show(){
        System.out.println(toString());
    }

}
