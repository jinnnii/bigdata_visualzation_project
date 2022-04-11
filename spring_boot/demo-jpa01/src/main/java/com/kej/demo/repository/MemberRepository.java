package com.kej.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kej.demo.domain.JpaMember;
@Repository
public interface MemberRepository extends JpaRepository<JpaMember, Long>{
}
