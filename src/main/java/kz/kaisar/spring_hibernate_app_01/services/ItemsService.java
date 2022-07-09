package kz.kaisar.spring_hibernate_app_01.services;

import kz.kaisar.spring_hibernate_app_01.models.Item;
import kz.kaisar.spring_hibernate_app_01.models.Person;
import kz.kaisar.spring_hibernate_app_01.repositories.ItemsRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ItemsService {

    private final ItemsRepository itemsRepository;

    public ItemsService(ItemsRepository itemsRepository) {
        this.itemsRepository = itemsRepository;
    }

    public List<Item> findByItemName(String itemName) {
        return itemsRepository.findByItemName(itemName);
    }

    public List<Item> findByOwner(Person owner) {
        return itemsRepository.findByOwner(owner);
    }

}
