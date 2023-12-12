package com.vitoreduardo.course.services;

import com.vitoreduardo.course.entities.User;
import com.vitoreduardo.course.repositories.UserRepository;
import com.vitoreduardo.course.services.exceptions.DatabaseException;
import com.vitoreduardo.course.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public List<User> findAll() {
        return repository.findAll();
    }

    public User findByid(Long id) {
        Optional<User> user = repository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return repository.save(user);
    }

    public void delete(Long id) {
        try {
            if(!repository.existsById(id)) {
                throw new ResourceNotFoundException(id);
            } else {
                repository.deleteById(id);
            }

        } catch(DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User obj) {
    	try {
            User entity = repository.getReferenceById(id);
            updateData(entity, obj);

            return repository.save(entity);

    	} catch(EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
    	}
        
    }

    private void updateData(User entity, User obj) {

        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());

    }
}
