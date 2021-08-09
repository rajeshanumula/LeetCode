package com.practice;

import java.io.*;
import java.util.HashMap;
public class TCPUDP {
	static int i=1;
	static HashMap<Integer, String> map=new HashMap<Integer, String>();
	public static void tcpUdp1(int key, String word) throws IOException {
		if(i==key) {
			System.out.println(key+"::"+word);
			i++;
		}
		while(map.containsKey(i)){
			System.out.println(i+"::"+map.get(i));
			map.remove(i);
			i++;
		}
		map.put(key, word);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("Enter Integer");
			int key=Integer.parseInt(reader.readLine());
			String str=reader.readLine();
			tcpUdp1(key, str);
		}
	}

}
