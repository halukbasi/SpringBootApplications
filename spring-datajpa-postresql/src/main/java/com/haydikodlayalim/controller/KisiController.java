package com.haydikodlayalim.controller;

import com.haydikodlayalim.dto.KisiDto;
import com.haydikodlayalim.repository.KisiRepository;
import com.haydikodlayalim.service.KisiService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiController {
    private final KisiService kisiService;
    @PostMapping
    public ResponseEntity<KisiDto> ekle(@RequestBody KisiDto kisiDto){
        return ResponseEntity.ok(kisiService.save((kisiDto)));
    }
    @GetMapping
    public ResponseEntity<List<KisiDto>> tumunuListele(){
        return ResponseEntity.ok(kisiService.getAll());
    }
}
