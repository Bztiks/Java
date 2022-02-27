import javax.swing.plaf.synth.SynthViewportUI;

public class MethodThis {
    public static void main(String[] args) {
        MethodThis _z = new MethodThis(1,3);
        System.out.print(_z.setThis(_z));
    }
    double x,y,z;
    public MethodThis()
    {

    }

    public MethodThis(double x,double y)
    {
        this.x = x;
        this.y = y;
    }

    public double setThis(MethodThis z)
    {
        return Math.sqrt(x+y);
    }
}


