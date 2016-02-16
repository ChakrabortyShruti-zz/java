class Hello{
    public static void main(String[] args){
        Automobile car  = Automobile.getInfo("XUV",2014);
        Automobile costliestCar = Automobile.getInfo(100000000,"BMW");
        car.printCarNameWithYear();
        costliestCar.printCarNameWithPrice();
    }
}
