package com.urlshortner;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.urlshortner.dao.UrlShortnerDao;
import com.urlshortner.model.Url;
import com.urlshortner.service.UrlShortnerService;

@RestController
@RequestMapping("/urlshortner")
public class UrlShortnerController {

	@Autowired
	private UrlShortnerService urlShortnerService;
	@Autowired
	private UrlShortnerDao urlShortnerDao;
	
	@PostMapping(path="/create")
	public String urlKeycreator(@RequestBody String url) {
		return urlShortnerService.urlKeycreator(url);
	}
	@GetMapping("/{key}")
    public ResponseEntity<Optional<Url>> getEmployeeById(@PathVariable(value = "key") String key){
		Optional<Url> url = urlShortnerDao.findById(key);
		return ResponseEntity.ok().body(url);
    }

}
