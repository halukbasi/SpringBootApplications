package com.haydikodlayalim.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;

import java.util.Date;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "kisiler")
public class Kisi {
    @Id
    private String id;
    @Field(name = "ad")
    private String ad;
    @Field(name = "soyad")
    private String soyad;
    @Field(name = "adres")
    private String adres;
    @Field(name = "dogumTarihi")
    private Date dogumTarihi;
}
