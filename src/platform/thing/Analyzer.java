package platform.thing;

import platform.port.InputPort;
import platform.port.OutputPort;

public class Analyzer extends Thing{
	
	private OutputPort outputPort1 = new OutputPort(this);
	private OutputPort outputPort2 = new OutputPort(this);

	private InputPort inputPort1=new InputPort(this);
	private InputPort inputPort2=new InputPort(this);
	
	private String inputData1;
	private String inputData2;
	private String outputData1;
	private String outputData2;
	
	
	
	
	@Override
	public void run(String rcv) {
		
		
		new Thread(new Runnable() {
            @Override
            public void run() {
            		inputData1=rcv;
            		outputPort1.sendAll(inputData1);
            }
        }) .start();
		
	}
	
	
	public OutputPort getOutputPort1() {return outputPort1;}
	public OutputPort getOutputPort2() {return outputPort2;}
	public InputPort getInputPort1() {return inputPort1;}
	public InputPort getInputPort2() {return inputPort2;}

}
