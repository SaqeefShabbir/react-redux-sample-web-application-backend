package com.conure.restaurant_application_backend_v1.Repository;

import com.conure.restaurant_application_backend_v1.Model.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends CrudRepository<Item, Long> {
}
