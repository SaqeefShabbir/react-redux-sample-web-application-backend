package com.conure.restaurant_application_backend_v1.Service;

import com.conure.restaurant_application_backend_v1.Model.Item;
import com.conure.restaurant_application_backend_v1.Repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public List<Item> getAllItems()
    {
        List<Item> items = new ArrayList<>();
        itemRepository.findAll().forEach(item -> items.add(item));
        return items;
    }
}
