package com.nttdata.msbanco.model.Service;

import com.nttdata.msbanco.model.Entity.Customer;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
  Flux<Customer> findAll();

  Mono<Customer> findByDocumentNumber(String documentNumber);

  Mono<Customer> saveCustomer(Customer customer);

  Mono<Customer> updateCustomer(Customer customer);

  Mono<Void> deleteCustomer(ObjectId customerId);

  Flux<Object> getCustomerAllProucts(String nroDocument);
}
