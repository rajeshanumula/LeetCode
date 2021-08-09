package com.practice;
import java.util.*;

public class ReconstructItinerary {
	HashMap<String, List<String>> map=new HashMap<>();
    LinkedList<String> result=new LinkedList<String>();
    ArrayList<String> actResult=new ArrayList<String>();
    int totalTickets;
    public List<String> findItinerary(List<List<String>> tickets) {
        totalTickets=tickets.size();
        for(int i=0;i<tickets.size();i++){
            if(!map.containsKey(tickets.get(i).get(0))){
                map.put(tickets.get(i).get(0), new ArrayList<String>());
            }
            map.get(tickets.get(i).get(0)).add(tickets.get(i).get(1));
        }
        for(Map.Entry<String, List<String>> curTicket:map.entrySet()){
        	result.add(curTicket.getKey());
        	totalTickets--;
            if(helperDFS(curTicket.getValue())) return actResult;
            totalTickets++;
            result.remove(0);
        }
        return actResult;
    }
    public boolean helperDFS(List<String> depart){
        Collections.sort(depart);
        for( int i=0;i<depart.size();i++){
            totalTickets--;
            String cur=depart.remove(i);
            result.offer(cur);
            if(map.get(cur)!=null){
            	if(helperDFS(map.get(cur))) return true;
            }
            result.pollLast();
            depart.add(i,cur);
            totalTickets++;
        }
        if(totalTickets==0){
            actResult=new ArrayList<String>(result);
            return true;
        }
        return false;
    }
	public static void main(String[] args) {
		ReconstructItinerary re=new ReconstructItinerary();
		List<String> ticket1=new ArrayList<String>(Arrays.asList("MUC","LHR"));
		List<String> ticket2=new ArrayList<String>(Arrays.asList("JFK","MUC"));
		List<String> ticket3=new ArrayList<String>(Arrays.asList("SFO","SJC"));
		List<String> ticket4=new ArrayList<String>(Arrays.asList("LHR","SFO"));
		//List<String> ticket5=new ArrayList<String>(Arrays.asList("ATL","SFO"));
		List<List<String>> tickets=new ArrayList<>(Arrays.asList(ticket1,ticket2, ticket3, ticket4));
		re.findItinerary(tickets);
	}

}
