package com.welldev.dslist.services;

import com.welldev.dslist.dto.GameMinDTO;
import com.welldev.dslist.entities.Game;
import com.welldev.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        var result = gameRepository.findAll();

        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
