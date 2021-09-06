package com.example.newbackend.repository;

import com.example.newbackend.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Category extends JpaRepository<Item, Long> {

}
