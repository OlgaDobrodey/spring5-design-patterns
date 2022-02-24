package com.itrex.springbootaop.service;

import java.util.List;

public interface BookService {

    List<String> findNameById(Long id);
    Long findSizeById (Long id);
    String methodExceptionBook (Long id) throws Exception;
}
