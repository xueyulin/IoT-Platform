package platform.port;
import java.util.HashSet;
import platform.link.Link;
import platform.thing.*;


public class Port {
	protected HashSet<Link> links;
	protected HashSet<Thing> things;
	protected String data;
	
	public Port() {
		this.links= new HashSet<Link>();
		this.things= new HashSet<Thing>();
	}
	
	public void addLinks(Link rcv) {
		links.add(rcv);
	}
	
	public void addThings(Thing rcv) {
		things.add(rcv);
	}
	

}
