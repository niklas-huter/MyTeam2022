package com.example.projekt_fcz2022;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Spieler_Repository<Spieler> extends CrudRepository<Spieler, Long> {
}
