package platform.thing;
import platform.port.*;

public class Actuator extends Thing{
	
	private InputPort inputPort1=new InputPort();
	private InputPort inputPort2=new InputPort();	
	
	
	@Override
	public void run(String rcv) {
		// TODO Auto-generated method stub
		
		new Thread(new Runnable() {
            @Override
            public void run() {
            		System.out.println(rcv);     	
            }
        }) .start();
		
	}
	
	
	public InputPort getInputPort1() {return inputPort1;}
	public InputPort getInputPort2() {return inputPort2;}

}
