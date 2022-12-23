package br.com.tech4me.petshop.service;

import java.util.List;
import java.util.Optional;

import br.com.tech4me.petshop.model.Petshop;

public interface PetshopService {
    List<Petshop> ObterPets();
    Optional<Petshop> ObterPorId(String id);
    void excluirPorId(String id);
    Petshop cadastrarPet(Petshop petshop);
    Optional <Petshop> atualizarPorId(String id,Petshop petshop);
}
