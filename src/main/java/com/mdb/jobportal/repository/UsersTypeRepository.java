package com.mdb.jobportal.repository;

import com.mdb.jobportal.entity.UserType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersTypeRepository extends JpaRepository<UserType,Integer> {
}
