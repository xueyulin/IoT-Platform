import platform.IoTPlatform;
import platform.thing.*;

public class Test {
	
	public static void main(String[] args) {
		IoTPlatform platform= new IoTPlatform();
		
		/*Sensor sensor1 = platform.addSenosr();
		Actuator actuator1 = platform.addActuator();
		
		platform.addLink(sensor1.getOutputPort1(),actuator1.getInputPort1());
		platform.addLink(sensor1.getOutputPort2(),actuator1.getInputPort2());
		*/
		
		Sensor sensor1 = platform.addSenosr();
		Analyzer analyzer1 = platform.addAnalyzer();
		Actuator actuator1 = platform.addActuator();
		
		platform.addLink(sensor1.getOutputPort1(),analyzer1.getInputPort1());
		platform.addLink(analyzer1.getOutputPort1(),actuator1.getInputPort1());
		
	}

}
