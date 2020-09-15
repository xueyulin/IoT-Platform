import platform.IoTPlatform;
import platform.thing.Actuator;
import platform.thing.Sensor;

public class Test {
	
	public static void main(String[] args) {
		IoTPlatform platform= new IoTPlatform();
		
		Sensor sensor1 = platform.addSenosr();
		Actuator actuator1 = platform.addActuator();
		
		platform.addLink(sensor1.getOutputPort1(),actuator1.getInputPort1());
		platform.addLink(sensor1.getOutputPort2(),actuator1.getInputPort2());
	}

}
