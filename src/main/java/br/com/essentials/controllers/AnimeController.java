package br.com.essentials.controllers;

import br.com.essentials.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping(path = "list")
    public List<Anime> list(){
        return List.of(new Anime("Beyblade Burst"), new Anime("Dragon Ball Z"), new Anime("Super Onze"));
    }

}
