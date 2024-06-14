package br.com.angelosa.petshop.domain;

import java.util.List;

public record Customer(String name, String document, String cellPhone, String address, List<Animal> animals) {
}
