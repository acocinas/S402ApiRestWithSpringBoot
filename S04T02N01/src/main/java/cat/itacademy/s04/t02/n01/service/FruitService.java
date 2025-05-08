package cat.itacademy.s04.t02.n01.service;

import cat.itacademy.s04.t02.n01.exception.FruitNotFoundException;
import cat.itacademy.s04.t02.n01.model.Fruit;
import cat.itacademy.s04.t02.n01.repository.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FruitService {

    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public Fruit addFruit(Fruit fruit) {
        return fruitRepository.save(fruit);
    }

    public Fruit updateFruit(Fruit fruit) {
        if (!fruitRepository.existsById(fruit.getId())) {
            throw new FruitNotFoundException("Fruit not found with ID: " + fruit.getId());
        }
        return fruitRepository.save(fruit);
    }

    public void deleteFruit(int id) {
        if (!fruitRepository.existsById(id)) {
            throw new FruitNotFoundException("Fruit not found with ID: " + id);
        }
        fruitRepository.deleteById(id);
    }

    public Fruit getFruit(int id) {
        return fruitRepository.findById(id)
                .orElseThrow(() -> new FruitNotFoundException("Fruit not found with ID: " + id));
    }

    public List<Fruit> getAllFruits() {
        return fruitRepository.findAll();
    }
}
