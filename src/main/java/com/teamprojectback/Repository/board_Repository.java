package com.teamprojectback.Repository;


import com.teamprojectback.Entity.boardView_Entity;
import com.teamprojectback.Entity.board_Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface board_Repository extends JpaRepository<board_Entity, Long> {
    board_Entity findByNumber(Integer number);

    List<board_Entity> findByOrderByDateDesc();
}
