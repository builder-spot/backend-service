package com.mcr.builderspot.entities;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "category")
@Data
@Entity
public class Category extends LongIdBaseEntity{
    @Column(name="category_name")
    private String categoryName;

    @Column(name="category_description")
    private String categoryDescription;

    @Column(name="parent_category_id")
    private Long parentCategoryId;
}
