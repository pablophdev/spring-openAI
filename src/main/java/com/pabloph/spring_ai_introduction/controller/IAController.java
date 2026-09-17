package com.pabloph.spring_ai_introduction.controller;

import com.pabloph.spring_ai_introduction.service.IAService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/ia")
public class IAController {

    private final IAService iaService;

    public IAController(IAService iaService) {
        this.iaService= iaService;
    }

    @GetMapping("/preguntar")
    public ResponseEntity<String> preguntar(@RequestParam String pregunta) {
        String respuesta = iaService.preguntar(pregunta);
        return ResponseEntity.ok(respuesta);
    }
}
