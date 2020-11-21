package com.pairlearning.ExpenseTracking.services;

import com.pairlearning.ExpenseTracking.exceptions.EtAuthException;
import com.pairlearning.ExpenseTracking.domain.User;

public interface UserService {
    
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
