package com.jkuat.e_commerce.repositories;

import com.jkuat.e_commerce.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {
    Category findByCategoryName(String categoryName);


}
