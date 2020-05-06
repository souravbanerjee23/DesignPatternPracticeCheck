package observerPattern;

public class SteveObserver implements INotificationObserver {

	private String name = "Steeve";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SteeveObserver [name=" + name + "]";
	}

	@Override
	public void OnServerDown() {
		System.out.println(name + " has been received notifications.");
	}
}