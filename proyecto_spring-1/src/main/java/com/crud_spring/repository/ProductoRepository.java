package com.crud_spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud_spring.modelo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto,Integer>{

}
