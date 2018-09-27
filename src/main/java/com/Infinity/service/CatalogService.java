package com.Infinity.service;

import com.Infinity.domain.Catalog;
import com.Infinity.domain.User;

import java.util.List;

public interface CatalogService {

    Catalog saveCatalog(Catalog catalog);

    void removeCatalog(Long id);

    Catalog getCatalogById(Long id);

    List<Catalog> listCatalogs(User user);
}
