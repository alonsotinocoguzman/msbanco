package com.nttdata.msbanco.model.Implements;

import com.nttdata.msbanco.model.Entity.ProductBank;
import com.nttdata.msbanco.model.Service.ProductBankService;
import com.nttdata.msbanco.repository.ProductBankRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductBankServiceImpl implements ProductBankService {
  private final ProductBankRepository bankProductRepository;

  @Override
  public Flux<ProductBank> saveBankProducts(List<ProductBank> bankProducts) {
    return bankProductRepository.saveAll(bankProducts);
  }

  @Override
  public Mono<ProductBank> updateBankProduct(ProductBank bankProduct) {
    return bankProductRepository.save(bankProduct);
  }

  @Override
  public Mono<Void> deleteBankProduct(ObjectId bankProductId) {
    return bankProductRepository.deleteById(bankProductId);
  }

  @Override
  public Flux<ProductBank> getAllBankProducts() {
    return bankProductRepository.findAll();
  }

  @Override
  public Mono<ProductBank> getBankProductById(ObjectId bankProductId) {
    return bankProductRepository.findById(bankProductId);
  }
}
