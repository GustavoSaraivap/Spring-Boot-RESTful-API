package com.springcourse.repositories;

import com.springcourse.enums.RequestState;
import com.springcourse.models.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RequestRepository extends JpaRepository<Request, Long> {

    List<Request> findAllByOwnerId(Long id);

    // esse método será chamado quando for adicionar um novo estágio de um pedido
    @Query(value = "UPDATE Request SET state = ?2 WHERE id = ?1", nativeQuery = true)
    Request updateStatus(Long id, RequestState state);
}
