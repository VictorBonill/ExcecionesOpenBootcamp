public class Division {
    private int dividendo;
    private int divisor;

    public Division(){}

    public int getDividendo() {
        return dividendo;
    }

    public void setDividendo(int dividendo) {
        this.dividendo = dividendo;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }

    public void getResultado(){
        try{
            System.out.println(dividendo/divisor);
        }catch (ArithmeticException e){
            System.out.println("No se puede realizar división por cero: " + e.getStackTrace()[0]);
        }
    }
}

