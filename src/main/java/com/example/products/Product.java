package com.example.products;

import lombok.Data;

import com.fasterxml.jackson.annotation.JsonFormat;

@Data
class Product {
  @JsonFormat( shape = JsonFormat.Shape.STRING)
  private String id;
  private String name;
  private String type;
  private String version;
  private String description;
  private String price;
  private String field;
  private String field1;
  
  Product() {}

  Product(String id, String name, String type, String version, String description, String price, String field, String field1) {
    this.id = id;
    this.name = name;
    this.type = type;
    this.version = version;
    this.description = description;
    this.price = price;
    this.field = field;
    this.field1 = field1;
  }
}