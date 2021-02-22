package com.urlshortner.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.urlshortner.dao.UrlShortnerDao;
import com.urlshortner.model.Url;
import com.urlshortner.utils.UrlShortnerEssentials;

@Service
public class UrlShortnerService {

	@Autowired
	private UrlShortnerDao urlShortnerDao;
	
	public String urlKeycreator(String longUrl) {
		long uid = System.currentTimeMillis();
		String key = UrlShortnerEssentials.idToKey(uid);
		Url url = new Url(key, longUrl);
		urlShortnerDao.save(url);
		return key;
	}	
}
