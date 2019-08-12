package com.canvas.cheater.repositories;

import com.canvas.cheater.repositories.repo_models.SavedAssignment;
import org.springframework.data.repository.CrudRepository;

public interface CheaterRepository extends CrudRepository<SavedAssignment, String> {

}