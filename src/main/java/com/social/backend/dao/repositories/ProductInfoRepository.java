package com.social.backend.dao.repositories;

import com.social.backend.dao.model.*;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.*;

import java.util.Optional;

@EnableScan
public interface ProductInfoRepository extends CrudRepository<ProductInfo, String> {
    Optional<ProductInfo> findById(String id);
}
