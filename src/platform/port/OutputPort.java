package platform.port;
import platform.link.Link;
import platform.thing.Thing;

public class OutputPort extends Port{
	
	public OutputPort() {super();}
	public OutputPort(Thing rcv) {super(rcv);}
	
	
	public void sendAll(String rcv) {
		data=rcv;
		for(Link link:links) {
			link.setData(data);
		}	
	}

}
