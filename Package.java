/**
 * 
 * @author Brian Guthrie
 *
 */
public class Package {
	private State orderedState;
	private State inTransitState;
	private State deliveredState;
	
	private State state;
	String name = "";
	
	public Package(String contents) {
		orderedState = new OrderedState(this);
		inTransitState = new InTransitState(this);
		deliveredState = new DeliveredState(this);
		this.name = contents;
	}
	
	public void order() {
		state = orderedState;
		state.displayStatus();
		state.displayETA();
	}
	
	public void mail() {
		state = inTransitState;
		state.displayStatus();
		state.displayETA();
	}
	
	public void received() {
		state = deliveredState;
		state.displayStatus();
		state.displayETA();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public String getName() {
		return name;
	}
	
	public State getOrderedState() {
		return orderedState;
	}
	
	public State getInTransitState() {
		return inTransitState;
	}
	
	public State getDeliveredState() {
		return deliveredState;
	}

}
