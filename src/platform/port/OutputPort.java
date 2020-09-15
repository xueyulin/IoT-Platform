package platform.port;
import platform.link.Link;

public class OutputPort extends Port{
	
	
	public void sendAll(String rcv) {
		data=rcv;
		for(Link link:links) {
			link.setData(data);
		}	
	}

}
