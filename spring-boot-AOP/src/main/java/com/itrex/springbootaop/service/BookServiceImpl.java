package com.itrex.springbootaop.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BookServiceImpl implements BookService{

    @Override
    public List<String> findNameById(Long id) {
        log.info("Reading method findNameById with id - ",id);
        return List.of(String.format("The book with id - %d",id));
    }

    @Override
    public Long findSizeById(Long id) {
        log.info("Reading method findSizeById");
        return id*2/4+18;
    }

    @Override
    public String methodExceptionBook(Long id) throws Exception {
        if(id==100l){
            throw new Exception("Oh - Exception");
        }
        return "methodExceptionBook "+ id;

    }
}
