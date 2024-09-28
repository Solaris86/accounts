package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDto;

public interface IAccountService {

    /**
     *
     * @param customerDto
     */
    void createAccount(CustomerDto customerDto);

    CustomerDto fetchAccount(String mobileNumber);

    /**
     *
     * @param customerDto - CustomerDto object
     * @return boolean indicating if the update of Account details is successful or not
     */
    boolean updateAccount(CustomerDto customerDto);

    /**
     *
     * @param mobileNumber - input mobile number
     * @return boolean indicating if delete account details is successful or not
     */
    boolean deleteAccount(String mobileNumber);

}
