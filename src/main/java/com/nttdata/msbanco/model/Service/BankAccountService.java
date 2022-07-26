package com.nttdata.msbanco.model.Service;

import com.nttdata.msbanco.model.Entity.BankAccount;
import org.bson.types.ObjectId;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BankAccountService {
  Mono<BankAccount> saveBankAccount(BankAccount bankAccount) throws Exception;

  Mono<BankAccount> updateBankAccount(BankAccount bankAccount);

  Mono<Void> deleteBankAccount(ObjectId bankAccountId);

  Flux<BankAccount> getAllBankAccountsByCustomer(String documentNumber);

  Mono<BankAccount> getBankAccount(ObjectId bankAccountId);
}
