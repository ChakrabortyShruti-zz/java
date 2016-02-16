class Automobile{
    private String name;
    private int year;
    private int cost;

    public Automobile(String model,int yearOfRelease){
        this.name = model;
        this.year = yearOfRelease;
    }

    public Automobile(int price,String name){
        this.cost = price;
        this.name = name;
    }

    public void printCarNameWithYear(){
        System.out.println("The name of the car is "+this.name+" and is released on "+this.year);
    }

    public  void printCarNameWithPrice(){
        System.out.println("The name of the car is "+this.name+" and price is "+this.cost);
    }
}
