package net.payla.webapp.controller;

import net.payla.webapp.dao.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaylaRepo extends JpaRepository <UserInfo,Long> {
}
