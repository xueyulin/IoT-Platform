package platform.thing;
import platform.port.*;

public class Sensor extends Thing{

	private OutputPort outputPort1 = new OutputPort(this);
	private OutputPort outputPort2 = new OutputPort(this);
	private OutputPort outputPort3 = new OutputPort(this);
	
	private String data1;
	private String data2;
	private String data3;
	
	public Sensor() {
		run();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		new Thread(new Runnable() {
            @Override
            public void run() {
            	while(true) {
            		
            		data1="data from sensor.port1,";
            		data2="data from sensor.port2,";
            		data3="data from sensor.port3,";
            		data1="temp:"+String.valueOf( (int)(Math.random()*5) + 28)+" degrees, "+data1;
            		data2="humidity:"+String.valueOf( (int)(Math.random()*30) + 50)+" %, "+data2;
            		data3="null"+","+data3;
            		
            		outputPort1.sendAll(data1);	
            		outputPort2.sendAll(data2);	
            		outputPort3.sendAll(data3);	
            		
            		
            		try {Thread.sleep(5000);}
    				catch (InterruptedException e) {System.out.println(e);}
            	}
            }
        }) .start();
	}
	
	public OutputPort getOutputPort1() {return outputPort1;}
	public OutputPort getOutputPort2() {return outputPort2;}
	public OutputPort getOutputPort3() {return outputPort3;}
	public Sensor getSensor() {return this;}

}
