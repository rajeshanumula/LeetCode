package com.practice;

import java.io.*;
import java.util.*;

public class Blend_TejashBank {
	
	public static boolean isFraud(List<Integer> transactionTimes, int transferLimit, int fraudWindow, int time) {
		int count = 0, start = time-fraudWindow;
		for(int i=transactionTimes.size()-1;i>=0 && transactionTimes.get(i)<=start;i--) {
			count++;
			if(count>=transferLimit) return true;
		}
		return false;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
	    int batchSize = Integer.parseInt(reader.readLine());
	    int transferLimit = Integer.parseInt(reader.readLine());
	    int fraudWindow = Integer.parseInt(reader.readLine());
	    String[] transactions = reader.readLine().split(",");
	    TreeSet<Integer> fraudAccounts = new TreeSet<>();
	    TreeMap<Integer, AccountDetails> allAccounts = new TreeMap<>();
	    int idx = 0, batch = 0, time=0;
	    
	    while(idx<transactions.length) {
	    	
	    	while(idx<transactions.length && batch<batchSize) {
	    		time++;
	    		if(transactions[idx].equals("d")) {
	    			int account_id = Integer.parseInt(transactions[idx+1]);
	    			int amount = Integer.parseInt(transactions[idx+2]);
	    			AccountDetails accntDetails = allAccounts.getOrDefault(account_id, new AccountDetails(0));
	    			accntDetails.amount = accntDetails.amount + amount;
	    			allAccounts.put(account_id, accntDetails);
	    			allAccounts.get(account_id).includedInBatch = true;
	    			allAccounts.get(account_id).transactionTimes.add(time);
	    			if(!fraudAccounts.contains(account_id) && isFraud(allAccounts.get(account_id).transactionTimes, transferLimit, fraudWindow, time)) {
	    				fraudAccounts.add(account_id);
	    			} 
	    			idx = idx + 3;
	    			
	    		}else if(transactions[idx].equals("t")) {
	    			int sender_account_id = Integer.parseInt(transactions[idx+1]);
	    			int recepient_account_id = Integer.parseInt(transactions[idx+2]);
	    			if(!allAccounts.containsKey(sender_account_id)) allAccounts.put(sender_account_id, new AccountDetails(0));
	    			if(!allAccounts.containsKey(recepient_account_id)) allAccounts.put(recepient_account_id, new AccountDetails(0));
	    			int amount = Integer.parseInt(transactions[idx+3]);
	    			allAccounts.get(sender_account_id).amount = allAccounts.get(sender_account_id).amount - amount;
	    			allAccounts.get(recepient_account_id).amount = allAccounts.get(recepient_account_id).amount + amount;
	    			allAccounts.get(sender_account_id).includedInBatch = true;
	    			allAccounts.get(recepient_account_id).includedInBatch = true;
	    			allAccounts.get(sender_account_id).transactionTimes.add(time);
	    			allAccounts.get(recepient_account_id).transactionTimes.add(time);
	    			if(!fraudAccounts.contains(sender_account_id) && isFraud(allAccounts.get(sender_account_id).transactionTimes, transferLimit, fraudWindow, time)) {
	    				fraudAccounts.add(sender_account_id);
	    			} 
	    			if(!fraudAccounts.contains(recepient_account_id) && isFraud(allAccounts.get(recepient_account_id).transactionTimes, transferLimit, fraudWindow, time)) {
	    				fraudAccounts.add(recepient_account_id);
	    			} 
	    			idx = idx + 4;
	    			
	    		}else if(transactions[idx].equals("w")) {
	    			int account_id = Integer.parseInt(transactions[idx+1]);
	    			if(!allAccounts.containsKey(account_id)) allAccounts.put(account_id, new AccountDetails(0));
	    			int amount = Integer.parseInt(transactions[idx+2]);
	    			allAccounts.get(account_id).amount = allAccounts.get(account_id).amount - amount;
	    			allAccounts.get(account_id).includedInBatch = true;
	    			allAccounts.get(account_id).transactionTimes.add(time);
	    			idx = idx + 3;
	    		}
	    		batch++;
	    	}
	    	
	    	for(int account_id : allAccounts.keySet()) {
	    		AccountDetails accountDetails = allAccounts.get(account_id);
	    		if(accountDetails.includedInBatch == true) {
	    			System.out.println(account_id + "," + (accountDetails.amount-accountDetails.batchStartAmount));
	    		}
	    		accountDetails.batchStartAmount = accountDetails.amount;
	    		accountDetails.includedInBatch = false;
	    	}
	    	
	    	System.out.println();
	    	if(fraudAccounts.size()==0) System.out.println("EMPTY");
	    	for(int account_id : fraudAccounts) {
	    		System.out.println(account_id);
	    	}
	    	
	    	batch = 0;
	    }
	    
	}
}

class AccountDetails{
	int batchStartAmount;
	int amount;
	boolean fraud;
	boolean includedInBatch;
	List<Integer> transactionTimes;
	public AccountDetails(int amount) {
		this.batchStartAmount = 0;
		this.amount = amount;
		this.fraud = false;
		this.includedInBatch = false;
		transactionTimes = new ArrayList<>();
	}
}
