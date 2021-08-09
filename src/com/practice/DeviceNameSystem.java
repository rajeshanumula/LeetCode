package com.practice;

import java.util.HashMap;

public class DeviceNameSystem {
	public String[] rename(String[] devices) {
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		int i=0;
		for(String device: devices) {
			if(map.containsKey(device)) {
				int old=map.get(device);
				devices[i]=devices[i]+old;
				map.put(device,old+1);
				map.put(devices[i], 1);
			}else{
				map.put(device, 1);
			}
			i++;
		}
		return devices;
	}
	public static void main(String[] args) {
		DeviceNameSystem ds=new DeviceNameSystem();
		//String[] deviceStrings= {"switch","tv","switch","tv","switch","tv","switch","tv"};
		String[] deviceStrings= {"mixer","toaster","mixer","tv","switch","tv","switch","tv1","switch","tv","switch2","tv11"};
		String[] res= ds.rename(deviceStrings);
		for(String r:res) {
			System.out.println(r);
		}
	}

}
