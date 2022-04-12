package com.Jvnyor.testbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Jvnyor.testbot.model.Info;

public interface InfoRepository extends JpaRepository<Info, Long> {

}
