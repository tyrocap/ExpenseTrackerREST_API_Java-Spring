package com.pairlearning.ExpenseTracking.repositories;

import com.pairlearning.ExpenseTracking.exceptions.EtAuthException;
import com.pairlearning.ExpenseTracking.domain.User;

public interface UserRepository {

    Integer create(String firstName, String lastName, String email, String password) throws EtAuthException;

    User findByEmailAndPassword(String email, String password) throws EtAuthException;

    Integer getCountByEmail(String email);

    User findById(Integer userId);
}
