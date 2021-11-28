// package com.test.sprongboot.catalogo.service;

// import java.util.List;
// import java.util.Optional;
// import java.util.function.Function;

// import com.test.sprongboot.catalogo.entity.Product;
// import com.test.sprongboot.catalogo.repository.ProductRepository;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Qualifier;
// import org.springframework.data.domain.Example;
// import org.springframework.data.domain.Page;
// import org.springframework.data.domain.Pageable;
// import org.springframework.data.domain.Sort;
// import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
// import org.springframework.stereotype.Service;

// @Service
// public class ProductService implements ProductRepository{

//     // @Autowired
//     private ProductRepository productrepository;

//     @Override
//     public List<Product> findAll() {
//         return productrepository.findAll();
//     }

//     @Override
//     public List<Product> findAll(Sort sort) {
//         return productrepository.findAll(sort);
//     }

//     @Override
//     public List<Product> findAllById(Iterable<Integer> ids) {
//         return productrepository.findAllById(ids);
//     }

//     @Override
//     public <S extends Product> List<S> saveAll(Iterable<S> entities) {
//         return productrepository.saveAll(entities);
//     }

//     @Override
//     public void flush() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public <S extends Product> S saveAndFlush(S entity) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public <S extends Product> List<S> saveAllAndFlush(Iterable<S> entities) {
//         // TODO Auto-generated method stub
//         return null;
//     }

//     @Override
//     public void deleteAllInBatch(Iterable<Product> entities) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllByIdInBatch(Iterable<Integer> ids) {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public void deleteAllInBatch() {
//         // TODO Auto-generated method stub
        
//     }

//     @Override
//     public Product getOne(Integer id) {
//         return null;
//     }

//     @Override
//     public Product getById(Integer id) {
//         return productrepository.getById(id);
//     }

//     @Override
//     public <S extends Product> List<S> findAll(Example<S> example) {
//         return productrepository.findAll(example);
//     }

//     @Override
//     public <S extends Product> List<S> findAll(Example<S> example, Sort sort) {
//         return productrepository.findAll(example, sort);
//     }

//     @Override
//     public Page<Product> findAll(Pageable pageable) {
//         return productrepository.findAll(pageable);
//     }

//     @Override
//     public <S extends Product> S save(S entity) {
//         return productrepository.save(entity);
//     }

//     @Override
//     public Optional<Product> findById(Integer id) {
//         return productrepository.findById(id);
//     }

//     @Override
//     public boolean existsById(Integer id) {
//         return productrepository.existsById(id);
//     }

//     @Override
//     public long count() {
//         return productrepository.count();
//     }

//     @Override
//     public void deleteById(Integer id) {
//         productrepository.deleteById(id);
        
//     }

//     @Override
//     public void delete(Product entity) {
//         productrepository.delete(entity);
        
//     }

//     @Override
//     public void deleteAllById(Iterable<? extends Integer> ids) {
//         productrepository.deleteAllById(ids);
        
//     }

//     @Override
//     public void deleteAll(Iterable<? extends Product> entities) {
//         productrepository.deleteAll();
        
//     }

//     @Override
//     public void deleteAll() {
//         productrepository.deleteAll();
        
//     }

//     @Override
//     public <S extends Product> Optional<S> findOne(Example<S> example) {
//         return productrepository.findOne(example);
//     }

//     @Override
//     public <S extends Product> Page<S> findAll(Example<S> example, Pageable pageable) {
//         return productrepository.findAll(example, pageable);
//     }

//     @Override
//     public <S extends Product> long count(Example<S> example) {
//         return productrepository.count(example);
//     }

//     @Override
//     public <S extends Product> boolean exists(Example<S> example) {
//         return productrepository.exists(example);
//     }

//     @Override
//     public <S extends Product, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction) {
//         return productrepository.findBy(example, queryFunction);
//     }
    
// }
