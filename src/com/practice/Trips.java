package com.practice;
import java.util.*;

public class Trips {
	Map<String, List<Trip>> map=new HashMap<>();
    int tCount=0;
    List<String> itinerary=new ArrayList<>();
    public List<String> findItinerary(String[][] tickets) {
        findDeparts(tickets);
        itinerary.add("JFK");
        findItinerary("JFK", tCount);
        return itinerary;
    }
    
    public void findDeparts(String[][] tickets){
        for(String[] ticket: tickets){
            tCount++;
            if(map.containsKey(ticket[0])){
                map.get(ticket[0]).add(new Trip(ticket[1], false));
            }else{
                List<Trip> q=new ArrayList<>();
                q.add(new Trip(ticket[1],false));
                map.put(ticket[0],q);
            }
        }
        for(Map.Entry<String, List<Trip>> entry:map.entrySet()){
           Collections.sort(entry.getValue(),(a,b)->(a.to).compareTo(b.to));
        }
    }
    
    public boolean findItinerary(String from, int rem){
        if(rem==0) return true;
        List<Trip> q=map.get(from);
        if(q!=null) {
            for(Trip trip: q){
                if(trip.used) continue;
                itinerary.add(trip.to);
                trip.used=true;
                if(findItinerary(trip.to, rem-1)) return true;
                itinerary.remove(itinerary.size()-1);
                trip.used=false;
            }
        }
        return false;
    }

	public static void main(String[] args) {
		String[][] trips=
				{{"EZE","TIA"},{"EZE","AXA"},{"AUA","EZE"},{"EZE","JFK"},
		                  {"JFK","ANU"},{"JFK","ANU"},{"AXA","TIA"},{"JFK","AUA"},
		                  {"TIA","JFK"},{"ANU","EZE"},{"ANU","EZE"},{"TIA","AUA"}};
		
		Trips t=new Trips();
		t.findItinerary(trips);
	}

}

class Trip{
    boolean used;
    String to;
    public Trip(String to, boolean used){
        this.used=used;
        this.to=to;
    }
}
