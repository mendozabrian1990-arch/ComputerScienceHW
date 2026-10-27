package edu.monmouth.campusvehicle;

public class CampusVehicle {
	private String id;
	private String location;
	private boolean available;
	private static final String DEFAULT_ID="unknown", DEFAULT_LOCATION="unknown";
	private static final boolean DEFAULT_AVAILABLE=true;
	private Color color; 
	private static final int MIN_AMOUNT=6;
	private static final int MAX_AMOUNT=18;
	
	public CampusVehicle() {
		this(DEFAULT_ID, DEFAULT_LOCATION, DEFAULT_AVAILABLE, Color.UNKNOWN);
	}
	public CampusVehicle(String id, String location, boolean available) {
		this(id, location, available, Color.UNKNOWN);
		
	}
	
	public CampusVehicle(String id, String location, boolean available, Color color) {
		setId(id);
		setLocation(location);
		setAvailable(available);
		setColor(color);
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
	if (id == null || id.isEmpty()) {
		this.id=DEFAULT_ID;
		return;
	}
	String lowerId=id.toLowerCase();
	if ((lowerId.length() < MIN_AMOUNT) || (lowerId.length()>MAX_AMOUNT)) {
		this.id=DEFAULT_ID;
	}
	else if (!lowerId.startsWith("mu")) {
		this.id=DEFAULT_ID;
	}
	else {
		this.id=lowerId;
	}}
	
	
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
	if (location == null || location.isEmpty()) {
	this.location= DEFAULT_LOCATION;
	return;
	}
	String lowerLocation=location.toLowerCase();
	if (!lowerLocation.matches("(library|university bluffs|parking lot|spruce hall|laurel hall)")){
		this.location=DEFAULT_LOCATION;
	}
	else {
		this.location=lowerLocation;
	}}
	
	
	public boolean isAvailable() {
		return available;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void checkOut() {
	if (available == true)	{
		this.available = false;
	}}
	
	
	public void returnVehicle() {
		available = true;
	}
	
	
	public void setColor(Color color) {
		this.color=color; 
	}
	
	public Color getColor() {
		return color;
		
	}
	
}
