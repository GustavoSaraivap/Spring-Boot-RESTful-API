package com.springcourse.services;

import com.springcourse.enums.RequestState;
import com.springcourse.models.Request;
import com.springcourse.repositories.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class RequestService {

    @Autowired
    private RequestRepository requestRepository;

    public Request save(Request request) {
        request.setState(RequestState.OPEN);
        request.setCreationDate(new Date());
        return requestRepository.save(request);
    }

    public Request update(Request request) {
        return requestRepository.save(request);
    }

    public Request getById(Long id) {
        Optional<Request> result = requestRepository.findById(id);
        return result.get();
    }

    public List<Request> listAll() {
        return requestRepository.findAll();
    }

    public List<Request> listAllByOwnerId(Long ownerId) {
        return requestRepository.findAllByOwnerId(ownerId);
    }
}
