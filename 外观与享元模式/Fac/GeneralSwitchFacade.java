package Fac;

import java.util.List;

public class GeneralSwitchFacade {

    private Light lights[]=new Light[4];
    private Fan fan;
    private AirConditioner ac;
    private Television tv;
    public GeneralSwitchFacade(){
        lights[0]=new Light("左前");
        lights[1]=new Light("右前");
        lights[2]=new Light("左后");
        lights[3]=new Light("右后");
        fan=new Fan();
        ac=new AirConditioner();
        tv=new Television();
    }

    public void on(){
        light[0].on();
        light[1].on();
        light[2].on();
        light[3].on();
        fan.on();
        ac.on();
        tv.on();
    }
    public void off(){
        light[0].off();
        light[1].off();
        light[2].off();
        light[3].off();
        fan.off();
        ac.off();
        tv.off();
    }
}
