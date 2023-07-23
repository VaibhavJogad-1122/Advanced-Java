package com.app.repossitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entities.Category;
import com.app.entities.Railway;

public interface RailwayRepo extends JpaRepository<Railway, Long> {
	List<Railway> findByCategory(Category category);
}
