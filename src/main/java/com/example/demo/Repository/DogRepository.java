/**
 * 
 */
package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Models.Dog;

/**
 * @author Satya Deepu Mandapati
 */
public interface DogRepository extends CrudRepository<Dog, Integer>{
	List<Dog> findByName(String name);
}
