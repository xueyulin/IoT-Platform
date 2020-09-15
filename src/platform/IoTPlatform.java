package platform;
import platform.thing.*;
import platform.port.*;
import platform.link.Link;

import java.util.HashSet;

public class IoTPlatform {
	
	private HashSet<Sensor> sensors = new HashSet<Sensor>();
	private HashSet<Analyzer> analyzers = new HashSet<Analyzer>();
	private HashSet<Actuator> actuators = new HashSet<Actuator>();
	
	public IoTPlatform() {
		
	}
	
	public Sensor addSenosr() {
		Sensor sensor = new Sensor();
		sensors.add(sensor);
		sensor.getOutputPort1().addThings(sensor);
		sensor.getOutputPort2().addThings(sensor);
		sensor.getOutputPort3().addThings(sensor);
		return sensor;
	}
	
	public Analyzer addAnalyzer() {
		Analyzer analyzer = new Analyzer();
		analyzers.add(analyzer);
		//analyzer.getport
		return analyzer;
	}
	
	public Actuator addActuator() {
		Actuator actuator = new Actuator();
		actuators.add(actuator);
		actuator.getInputPort1().addThings(actuator);
		actuator.getInputPort2().addThings(actuator);
		return actuator;
	}
	
	public void addLink(OutputPort rcv1,InputPort rcv2) {
		Link link =new Link(rcv1,rcv2);
		rcv1.addLinks(link);
		rcv2.addLinks(link);
	}
	

}
