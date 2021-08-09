package com.practice;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class XYZ
{
	public static boolean isIsomorphic(String str1, String str2)
	{
		if (str1.length() != str2.length()) {
			return false;
		}
  
		Map<Character, Character> map = new HashMap<>();
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str1.length(); i++)
		{
			char c1 = str1.charAt(i), c2 = str2.charAt(i);
			if (map.containsKey(c1))
			{
				if (map.get(c1) != c2)
					return false;
			}
			else
			{
				if (set.contains(c2))
					return false;
				map.put(c1, c2);
				set.add(c2);
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		String str1 = "AABB";
		String str2 = "XYXY";

		if (isIsomorphic(str1, str2)) {
			System.out.print(str1 + " and " + str2 + " are isomorphic");
		}
		else {
			System.out.print(str1 + " and " + str2 + " are not isomorphic");
		}
	}
}