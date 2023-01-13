public class TV implements CanOnOff{
    boolean isOn;

    public TV(boolean isOn) {
        this.isOn = isOn;
    }

    @Override
    public void off()
    {
        isOn  = false;
    }
    
    @Override   // @ - decorator, it means that method was overrided from an interface
    public void on()
    {
        isOn  = true;
    }

    public void display()
    {
        if(isOn)
        {
            System.out.println("TV is on");
        }
        else System.out.println("TV is off");
    }
}


