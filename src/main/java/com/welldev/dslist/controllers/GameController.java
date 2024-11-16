package com.welldev.dslist.controllers;

import com.welldev.dslist.dto.GameMinDTO;
import com.welldev.dslist.entities.Game;
import com.welldev.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }
}
