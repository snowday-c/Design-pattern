package Tem;

public class DefIntegralLn extends ADefiniteIntegral{
    private double a,b;
    private int c;
    public DefIntegralLn(double a,double b,int c){
        this.a=a;this.b=b;this.c=c;
    }

    @Override
    protected double geta() {
        return 0;
    }

    @Override
    protected double getb() {
        return 0;
    }

    @Override
    protected int getc() {
        return 0;
    }

    @Override
    protected double function(double x) {
        return Math.log(x);
    }
}
