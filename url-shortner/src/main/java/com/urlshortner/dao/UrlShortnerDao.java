package com.urlshortner.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urlshortner.model.Url;

@Repository
public interface UrlShortnerDao extends JpaRepository<Url, String> {

}