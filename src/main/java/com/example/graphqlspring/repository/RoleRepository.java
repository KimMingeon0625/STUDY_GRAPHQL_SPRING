package com.example.graphqlspring.repository;

import com.example.graphqlspring.domain.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Role findByMemberId(int memberId);
}
