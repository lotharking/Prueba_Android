package com.test.sprongboot.catalogo.service;

import java.util.List;
import java.util.Optional;

import com.test.sprongboot.catalogo.entity.History;
import com.test.sprongboot.catalogo.repository.HistoryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HistoryRepository repository;

    @Override
    public List<String> findByIdwish(int id){

        List<String> historyList = repository.findByIdwish(id);

        return historyList;
    }

    @Override
    public List<History> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(History history) {
        repository.save(history);
        
    }

    @Override
    public Optional<History> findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void delete(int id) {
        repository.deleteById(id);
        
    }
    
}
