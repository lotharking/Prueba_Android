package com.test.sprongboot.catalogo.service;

import java.util.List;
import java.util.Optional;

import com.test.sprongboot.catalogo.entity.History;

public interface HistoryService {
    List<String> findByIdwish(int id);

    List<History> findAll();

    void save(History history);

    Optional <History> findById(int id);

    void delete(int id);
}
