package com.Infinity.service.impl;

import com.Infinity.domain.Catalog;
import com.Infinity.domain.User;
import com.Infinity.repository.CatalogRepository;
import com.Infinity.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private CatalogRepository catalogRepository;

    @Override
    public Catalog saveCatalog(Catalog catalog) {

        // 判重
        List<Catalog> catalogs = catalogRepository.findByUserAndName(catalog.getUser(), catalog.getName());
        if (catalogs!=null && catalogs.size()>0) {
            throw new IllegalArgumentException("该分类已经存在了");
        }
        return catalogRepository.save(catalog);
    }

    @Override
    public void removeCatalog(Long id) {
        catalogRepository.deleteById(id);
    }

    @Override
    public Catalog getCatalogById(Long id) {
        return catalogRepository.getOne(id);
    }

    @Override
    public List<Catalog> listCatalogs(User user) {
        return catalogRepository.findByUser(user);
    }
}
