class BasicFunc{
    public BasicFunc(){
    }

    public boolean isEven(int number){
        return number%2==0;
    }

    public boolean isOdd(int number){
        return number%2!=0;
    }

    public int square(int number){
        return number*number;
    }

    public int cube(int number){
        return number*number*number;
    }

    public double cubeForDouble(double number){
        return Math.pow(number,3);
    }

    public int simpleInterest(int principle,int time,int rate){
        return (principle*time*rate)/100;
    }

    public double simpleInterestForDouble(double principle,int time,double rate){
        return (principle*time*rate)/100;
    }

    // public double compoundInterest(double principle,int time,double rate){
    //
    // }
}
