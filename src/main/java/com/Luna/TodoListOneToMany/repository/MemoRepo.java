package com.Luna.TodoListOneToMany.repository;

import com.Luna.TodoListOneToMany.model.Memo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MemoRepo extends JpaRepository<Memo, Long> {

    Long deleteByUserId(Long userId);
    List<Memo> findByUserId(Long userId);

//    @Query("select m.userId from Memo m where m.id = :id")
//    long findUserIdById(Long id);
}