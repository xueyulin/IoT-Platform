package platform.port;
import platform.link.Link;
import platform.thing.*;

public class InputPort extends Port{
	
	public void recive() {
		for(Link link:links) {
			data=link.getData();
			
			for(Thing thing:things) {
				thing.run(data);
			}
		}
		
	}
}
