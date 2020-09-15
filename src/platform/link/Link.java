package platform.link;
import platform.port.*;

public class Link {
	private InputPort input = new InputPort();
	private OutputPort output = new OutputPort();
	private String data;
	
	public Link(OutputPort rcv1, InputPort rcv2) {
		output = rcv1;
		input = rcv2;
	}
	
	public void setData(String rcv) {
		data = rcv;
		input.recive();
	}
	
	public String getData() {
		return data;
	}
	
	//to do list
	public void delete() {
		
	}
	
	
	

}
