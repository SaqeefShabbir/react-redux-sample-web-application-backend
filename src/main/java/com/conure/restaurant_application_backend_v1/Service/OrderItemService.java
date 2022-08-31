package com.conure.restaurant_application_backend_v1.Service;

import com.conure.restaurant_application_backend_v1.Model.OrderItem;
import com.conure.restaurant_application_backend_v1.Repository.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class OrderItemService {

    @Autowired
    OrderItemRepository orderItemRepository;

    public List<OrderItem> getAllItems()
    {
        List<OrderItem> orderItems = new ArrayList<>();
        orderItemRepository.findAll().forEach(orderItem -> orderItems.add(orderItem));
        return orderItems;
    }

    public OrderItem save(OrderItem orderItem)
    {
        return orderItemRepository.save(orderItem);
    }

    public void deleteAll()
    {
        orderItemRepository.deleteAll();
    }

    public void deleteById(Long id)
    {
        Optional<OrderItem> orderItemOptional = orderItemRepository.findById(id);
        OrderItem orderItem = orderItemOptional.get();
        orderItemRepository.delete(orderItem);
    }
}
