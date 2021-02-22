package com.urlshortner.utils;

public class UrlShortnerEssentials {

	public static String idToKey(Long id) {
		char map[] = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();  
	    StringBuffer shorturl = new StringBuffer();  
        while (id > 0)  
        {  
            shorturl.append(map[(int) (id % 62)]); 
            id = id / 62;  
        }  
        return shorturl.reverse().toString();  
	}
	
	public static long keyToId(String shorturl) {
		
		long id=0;
		for (int i = 0; i < shorturl.length(); i++)  
        {  
            if ('a' <= shorturl.charAt(i) &&  
                       shorturl.charAt(i) <= 'z')  
            id = id * 62 + shorturl.charAt(i) - 'a';  
            if ('A' <= shorturl.charAt(i) &&  
                       shorturl.charAt(i) <= 'Z')  
            id = id * 62 + shorturl.charAt(i) - 'A' + 26;  
            if ('0' <= shorturl.charAt(i) &&  
                       shorturl.charAt(i) <= '9')  
            id = id * 62 + shorturl.charAt(i) - '0' + 52;  
        }  
        return id;  
	}
	  
	
}
