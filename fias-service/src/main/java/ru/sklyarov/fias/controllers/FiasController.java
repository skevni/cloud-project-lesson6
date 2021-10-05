package ru.sklyarov.fias.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sklyarov.fias.entities.Version;
import ru.sklyarov.fias.service.FiasService;

import java.util.List;

@RestController
@CrossOrigin("*")
public class FiasController {

    @RequestMapping("/getversion")
    public List<Version> getUpdate() {
        FiasService fiasService = new FiasService();
        return fiasService.getLastVersion();
    }
}
