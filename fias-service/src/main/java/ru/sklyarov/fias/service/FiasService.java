package ru.sklyarov.fias.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.sklyarov.fias.entities.Version;

import java.util.ArrayList;
import java.util.List;


@RequiredArgsConstructor
@Service
public class FiasService {
    private static final String GET_ALL_FILE_INFO = "https://fias.nalog.ru/WebServices/Public/GetAllDownloadFileInfo";
    private static final String GET_LAST_FILE_INFO = "https://fias.nalog.ru/WebServices/Public/GetLastDownloadFileInfo";

    private final RestTemplate restTemplate;

    public FiasService() {
        this.restTemplate = new RestTemplate();
    }

    public List<Version> getLastVersion(){
        List<Version> versions = new ArrayList<>();

        versions.add(restTemplate.getForObject(GET_LAST_FILE_INFO, Version.class));

        return versions;
    }
}
