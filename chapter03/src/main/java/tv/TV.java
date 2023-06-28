package tv;

public class TV {
	private int channel; // 1 - 255
	private int volume;  // 0 - 100
	private boolean power;
	
	public void power(boolean on) {
	}
	
	public void volume(int volume) {
	}
	
	public void volume(boolean up) {
	}

	public void channel(int channel) {
	}
	
	public void channel(boolean up) {
	}
	
	public void status() {
		System.out.println(
			"TV[power=" + (power ? "on" : "off") +
			", channel=" + channel + 
			", volume=" + volume + "]");
	}
}
