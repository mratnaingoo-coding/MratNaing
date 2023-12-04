package Transporation;

public class Operation {
    public static void main(String[]args){
        System.out.println("Hello, Welcome to the ticket operations.");
        CarTransporation passager2 = new CarTransporation("Mg Mrat",25,4256458,"Insein","mgrat@gmail.com","18C",52,5,"Sagaing","22-10-2020/ 8:00AM-5:00PM");
        passager2.show();
        System.out.println("---------------------------------------");
        TrainTransporation passager3= new TrainTransporation("Ms. Soe",25,4258789,"Sagaing","soesoe@gmail.com","15-B",45,"Yangon","12-10-2022/ 7:30AM-4:30PM");
        passager3.show();
    }
}
