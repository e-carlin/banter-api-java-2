package com.banter.controller;

import com.banter.repository.InstitutionRepository;
import com.banter.model.Institution;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    @Autowired
    InstitutionRepository institutionRepository;

    @RequestMapping(value = "",
            method = RequestMethod.POST,
            consumes = {"application/json", "application/xml"},
            produces = {"application/json", "application/xml"})
    @ResponseStatus(HttpStatus.CREATED)
//    public void addAccount(@RequestBody AddAccountRequest addAccountRequest,
//                           HttpServletRequest request, HttpServletResponse response) {
//
//    }
        public List<Institution> addAccount(@RequestBody Institution addAccountRequest, //TODO: Change to sig above ^ just using institution for easy testing
                                            HttpServletRequest request, HttpServletResponse response) {

            return institutionRepository.findAll();
    }

}
