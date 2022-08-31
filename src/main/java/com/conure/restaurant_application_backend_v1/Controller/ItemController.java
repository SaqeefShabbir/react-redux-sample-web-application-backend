package com.conure.restaurant_application_backend_v1.Controller;

import com.conure.restaurant_application_backend_v1.Database.DatabaseSeeder;
import com.conure.restaurant_application_backend_v1.Model.Item;
import com.conure.restaurant_application_backend_v1.Repository.ItemRepository;
import com.conure.restaurant_application_backend_v1.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/item")
@CrossOrigin(origins = "http://localhost:3000")
public class ItemController {

    @Autowired
    DatabaseSeeder databaseSeeder;

    @Autowired
    ItemService itemService;

    @GetMapping("/seed")
    public void seedDb() {
        databaseSeeder.seed();
    }

    @GetMapping("/all")
    public List<Item> getAll() {
        return itemService.getAllItems();
    }
}
