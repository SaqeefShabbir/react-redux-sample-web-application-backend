package com.conure.restaurant_application_backend_v1.Repository;

import com.conure.restaurant_application_backend_v1.Model.OrderItem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends CrudRepository<OrderItem, Long> {
}
