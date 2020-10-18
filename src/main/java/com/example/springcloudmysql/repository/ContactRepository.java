package com.example.springcloudmysql.repository;

import com.example.springcloudmysql.model.Contact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository <Contact, Long> {}