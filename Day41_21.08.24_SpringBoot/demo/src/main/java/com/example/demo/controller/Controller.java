package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Dein Ausgewaehlter Pfad")

public class Controller {
@RequestMapping("/api/hello")
@GetMapping
    public String begrueßung (){
    return "Moingiorno";
}
@RequestMapping("/api/bye")
@GetMapping
    public String verabschiedung(){
    return "Bis Baldrian!";
}
}
