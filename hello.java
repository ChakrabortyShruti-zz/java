class hello{
    public static void main(String[] args){
        Automobile car = new Automobile("XUV",2014);
        Automobile costliestCar = new Automobile(10000000,"BMW");
        car.printCarNameWithYear();
        costliestCar.printCarNameWithPrice();
    }
}
