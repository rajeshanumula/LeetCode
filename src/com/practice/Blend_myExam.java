package com.practice;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Blend_myExam {

	public static void isFraudaccount() {

	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the details");
		int batch_size = Integer.parseInt(br.readLine());
		int transfer_limit = Integer.parseInt(br.readLine());
		int fw_size = Integer.parseInt(br.readLine());
		String[] transactions = br.readLine().split(",");
		int index = 0, batch = 0;
		TreeMap<Integer, Integer> accounts = new TreeMap<Integer, Integer>();
		for (; index < transactions.length;) {
			while (batch < batch_size && index < transactions.length) {
				int account_id = 0, amount = 0, sender_id = 0, receipient_id = 0;
				/*
				 d-deposit
				 w-withdraw
				 t-transfer
				 */
				switch (transactions[index]) {
				case "d": {
					account_id = Integer.parseInt(transactions[index + 1]);
					amount = Integer.parseInt(transactions[index + 2]);
					//BankAccount cur_trans = new BankAccount();
					if (accounts.containsKey(account_id)) {
						accounts.put(account_id, accounts.get(account_id) + amount);
					} else {
						accounts.put(account_id, amount);
					}
					index += 3;
					break;
				}
				case "w": {
					account_id = Integer.parseInt(transactions[index + 1]);
					amount = Integer.parseInt(transactions[index + 2]);
					//BankAccount cur_trans = new BankAccount();
					if (accounts.containsKey(account_id)) {
						accounts.put(account_id, accounts.get(account_id) - amount);
					} else {
						accounts.put(account_id, -amount);
					}
					index += 3;
					break;
				}
				case "t": {
					sender_id = Integer.parseInt(transactions[index + 1]);
					receipient_id = Integer.parseInt(transactions[index + 2]);
					amount = Integer.parseInt(transactions[index + 3]);
					//BankAccount cur_trans = new BankAccount();
					if (accounts.containsKey(sender_id)) {
						accounts.put(sender_id, accounts.get(sender_id) - amount);
					} else {
						accounts.put(sender_id, -amount);
					}
					if (accounts.containsKey(receipient_id)) {
						accounts.put(receipient_id, accounts.get(receipient_id) + amount);
					} else {
						accounts.put(receipient_id, amount);
					}
					index += 4;
					break;
				}
				}
				batch++;
			}
			batch=0;
			//BankAccount accounts=new BankAccount();
			for(Map.Entry<Integer, Integer> account:accounts.entrySet())
				System.out.println(account.getKey()+":"+account.getValue());
			accounts.clear();
		}
	}
}

class BankAccount {
	int account_id, current_balance = 0;
	TreeMap<Integer, Integer> accounts = new TreeMap<Integer, Integer>();

	public BankAccount() {

	}

	public BankAccount(int account_id, int amount) {
		this.account_id = account_id;
		this.current_balance = amount;
		accounts.put(this.account_id, this.current_balance);
	}
}
