package com.finaltask.profileapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.finaltask.profileapp.model.Contact;


public interface ContactRepository extends JpaRepository<Contact, Long> {

}

