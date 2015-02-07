package realityx;

import java.util.Vector;

public class LocationBuilder {

	public LocationBuilder() {
		
	}
	
	public Vector<Location> hogwards(){
		Vector<Location> ret = new Vector<Location>(0);
		String mEntr = "Main Entrance";
		Location mainEntrance = new Location(mEntr);
		String gHall = "Great Hall";
		Location greatHall = new Location(gHall);
		String stway = "Stairway";
		Location stairway = new Location(stway);
		String gcroom = "Griffyndor Common Room";
		Location gcomroom = new Location(gcroom);
		String bdorm = "Boys Dormitory";
		Location boysdorm = new Location(bdorm);
		String gdorm = "Girls Dormitory";
		Location girlsdorm = new Location(gdorm);
		mainEntrance.addGoTo(greatHall);
		mainEntrance.addGoTo(stairway);
		greatHall.addGoTo(mainEntrance);
		stairway.addGoTo(mainEntrance);
		stairway.addGoTo(gcomroom);
		gcomroom.addGoTo(boysdorm);
		gcomroom.addGoTo(girlsdorm);
		gcomroom.addGoTo(stairway);
		gcomroom.addGoTo(boysdorm);
		gcomroom.addGoTo(girlsdorm);
		boysdorm.addGoTo(gcomroom);
		girlsdorm.addGoTo(gcomroom);
		ret.add(mainEntrance);
		ret.add(greatHall);
		ret.add(stairway);
		ret.add(gcomroom);
		ret.add(boysdorm);
		ret.add(girlsdorm);
		return ret;
	}

}
