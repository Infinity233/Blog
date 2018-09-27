package com.Infinity.vo;

import com.Infinity.domain.Catalog;
import lombok.Data;

import java.io.Serializable;

@Data
public class CatalogVo implements Serializable {

    private static final long serialVersionUID = 1L;

    private String username;
    private Catalog catalog;
}
