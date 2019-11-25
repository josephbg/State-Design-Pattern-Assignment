//package csce247.assignments.state;

public class DeliveryDriver {

	public static void main(String[] args) {
		Package coffeeFilters = new Package("Coffee Filters");
		coffeeFilters.order();
		coffeeFilters.mail();
		coffeeFilters.received();
	}
}
