package com.mycompany.myapp.service;

import com.mycompany.myapp.domain.CustomerDetails;
import com.mycompany.myapp.repository.CustomerDetailsRepository;
import java.util.Optional;

import jcodingtime.java.verifier.annotation.Input;
import jcodingtime.java.verifier.annotation.JCodingTime;
import jcodingtime.java.verifier.annotation.Output;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link CustomerDetails}.
 */
@Service
@Transactional
public class CustomerDetailsService {

    private final Logger log = LoggerFactory.getLogger(CustomerDetailsService.class);

    private final CustomerDetailsRepository customerDetailsRepository;

    public CustomerDetailsService(CustomerDetailsRepository customerDetailsRepository) {
        this.customerDetailsRepository = customerDetailsRepository;
    }

    /**
     * Save a customerDetails.
     *
     * @param customerDetails the entity to save.
     * @return the persisted entity.
     */
    public CustomerDetails save(CustomerDetails customerDetails) {
        log.debug("Request to save CustomerDetails : {}", customerDetails);
        return customerDetailsRepository.save(customerDetails);
    }

    /**
     * Partially update a customerDetails.
     *
     * @param customerDetails the entity to update partially.
     * @return the persisted entity.
     */
    public Optional<CustomerDetails> partialUpdate(CustomerDetails customerDetails) {
        log.debug("Request to partially update CustomerDetails : {}", customerDetails);

        return customerDetailsRepository
            .findById(customerDetails.getId())
            .map(
                existingCustomerDetails -> {
                    if (customerDetails.getGender() != null) {
                        existingCustomerDetails.setGender(customerDetails.getGender());
                    }
                    if (customerDetails.getPhone() != null) {
                        existingCustomerDetails.setPhone(customerDetails.getPhone());
                    }
                    if (customerDetails.getAddressLine1() != null) {
                        existingCustomerDetails.setAddressLine1(customerDetails.getAddressLine1());
                    }
                    if (customerDetails.getNumberAddressLine1() != null) {
                        existingCustomerDetails.setNumberAddressLine1(customerDetails.getNumberAddressLine1());
                    }
                    if (customerDetails.getAddressLine2() != null) {
                        existingCustomerDetails.setAddressLine2(customerDetails.getAddressLine2());
                    }
                    if (customerDetails.getCity() != null) {
                        existingCustomerDetails.setCity(customerDetails.getCity());
                    }
                    if (customerDetails.getCountry() != null) {
                        existingCustomerDetails.setCountry(customerDetails.getCountry());
                    }
                    if (customerDetails.getAge() != null) {
                        existingCustomerDetails.setAge(customerDetails.getAge());
                    }

                    return existingCustomerDetails;
                }
            )
            .map(customerDetailsRepository::save);
    }

    /**
     * Get all the customerDetails.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<CustomerDetails> findAll(Pageable pageable) {
        log.debug("Request to get all CustomerDetails");
        return customerDetailsRepository.findAll(pageable);
    }

    /**
     * Get one customerDetails by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<CustomerDetails> findOne(Long id) {
        log.debug("Request to get CustomerDetails : {}", id);
        return customerDetailsRepository.findById(id);
    }

    /**
     * Delete the customerDetails by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete CustomerDetails : {}", id);
        customerDetailsRepository.deleteById(id);
    }

    @JCodingTime
    @Input(firstParam= "Brazil", secondParam="18")
    @Output(result="true")
    public Boolean verifyCountryAndAge(String country, Integer age){
        if(country.equals("Brazil") && age >= 18){
            return true;
        }
        return false;
    }
}
