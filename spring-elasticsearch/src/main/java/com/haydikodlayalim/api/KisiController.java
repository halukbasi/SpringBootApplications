package com.haydikodlayalim.api;

import com.haydikodlayalim.entity.Kisi;
import com.haydikodlayalim.repository.KisiRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Calendar;
import java.util.List;
@RestController
@RequestMapping("/kisi")
@RequiredArgsConstructor
public class KisiController {
    private final KisiRepository kisiRepository;
//    @PostConstruct
//    public void init(){
//        Kisi kisi = new Kisi();
//        kisi.setAd("Haydi");
//        kisi.setSoyad("Kodlayalim");
//        kisi.setAdres("Test");
//        kisi.setDogumTarihi(Calendar.getInstance().getTime());
//        kisi.setId("K0001");
//        kisiRepository.save(kisi);
//    }

    @GetMapping("/{search}")
    public ResponseEntity<List<Kisi>> getKisi(@PathVariable String search){
//        List<Kisi> kisiler = kisiRepository.getByCustomQuery(search);
//        List<Kisi> kisiler = kisiRepository.findByAdLikeOrSoyadLike(search, search);
        List<Kisi> kisiler = kisiRepository.findByAdContainsOrSoyadContains(search, search);




        return ResponseEntity.ok(kisiler);
    }
}