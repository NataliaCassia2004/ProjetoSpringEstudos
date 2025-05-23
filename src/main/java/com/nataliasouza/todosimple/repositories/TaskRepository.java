package com.nataliasouza.todosimple.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nataliasouza.todosimple.models.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {
   
    //buscar uma lista de tasks de um usuario
    List<Task>  findByUser_Id(Long id);
    //@Query(value = "SELECT t FROM Task t WHERE t.user.id = :id")
    //List<Task>  findByUser_Id(@Param("id") Long id);

    //sql puro
    //@Query(value = "SELECT * FROM task t WHERE t.user_id = :id", nativeQuery = true)
    //List<Task>  findByUser_Id(@Param("id") Long id);

}
