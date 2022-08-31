package com.conure.restaurant_application_backend_v1.Controller;

import com.conure.restaurant_application_backend_v1.Model.OrderItem;
import com.conure.restaurant_application_backend_v1.Service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orderItem")
@CrossOrigin(origins = "http://localhost:3000")
public class OrderItemController {

    @Autowired
    OrderItemService orderItemService;

    @GetMapping("/all")
    public List<OrderItem> getAll() {
        return orderItemService.getAllItems();
    }

    @PostMapping("/post")
    public OrderItem save(@RequestBody OrderItem orderItem) {
        return orderItemService.save(orderItem);
    }

    @GetMapping("/deleteAll")
    public void deleteAll() {
        orderItemService.deleteAll();
    }

    @GetMapping("/deleteById/{id}")
    public void deleteById(@PathVariable Long id) {
        orderItemService.deleteById(id);
    }
}
