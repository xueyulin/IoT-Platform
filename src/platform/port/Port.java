package platform.port;
import java.util.HashSet;
import platform.link.Link;
import platform.thing.*;


public class Port {
	protected HashSet<Link> links = new HashSet<Link>();
	protected HashSet<Thing> things = new HashSet<Thing>();
	protected String data;
	
	public Port() {
	}
	
	public Port(Thing rcv) {
		things.add(rcv);
	}
	
	
	public void addLinks(Link rcv) {
		links.add(rcv);
	}
	
	public void addThings(Thing rcv) {
		things.add(rcv);
	}
	

}
