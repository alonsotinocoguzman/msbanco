package com.nttdata.msbanco.model.Implements;

import com.nttdata.msbanco.model.Entity.Transaction;
import com.nttdata.msbanco.model.Service.TransactionService;
import com.nttdata.msbanco.repository.TransactionRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class TransactionServiceImpl implements TransactionService {
  private final TransactionRepository transactionRepository;

  @Override
  public Mono<Transaction> saveTransations(Transaction transaction) {
    return transactionRepository.save(transaction);
  }

  @Override
  public Mono<Transaction> updateTransation(Transaction transaction) {
    return transactionRepository.save(transaction);
  }

  @Override
  public Mono<Void> deleteTransationById(ObjectId id) {
    return transactionRepository.deleteById(id);
  }

  @Override
  public Flux<Transaction> getAllTransations() {
    return transactionRepository.findAll();
  }

  @Override
  public Mono<Transaction> getTransationById(ObjectId id) {
    return transactionRepository.findById(id);
  }

  @Override
  public Mono<Double> getTransactionBalance(ObjectId id) {
    return transactionRepository.findById(id).map(Transaction::getBalance);
  }
}
