package com.game.service;

import com.game.entity.Player;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public interface PlayerService {
    List<Player> findAll();
    Optional<Player> findById(Long id) throws NoSuchElementException;
    Integer getCount ();
    Player create(Player player);
    Player update(Player player);
    void delete(Long id);

    boolean allValuesAreValidAndFilled(Player player);
    boolean allValuesAreValid(Player player);
    void assignFields(Player fromPlayer, Player toPlayer);
//    boolean requiredFieldsFilled(Player player);
//    boolean validName(Player player);
//    boolean checkExperienceValue(Player player);
//    boolean checkDate(Player player);
//    boolean checkWordLength(Player player);
//    void untilNextLevelValue(Player player);
}
