package web.dao;

import org.springframework.stereotype.Repository;
import web.entity.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl  implements CarDAO {
    private static List<Car> cars = new ArrayList<>(Arrays.asList(new Car("Blue", 1555, "123ll"),
            new Car("Белый", 4567, "456ll"),
            new Car("Black", 55555, "123pp"),
            new Car("Silver", 50000, "456pp"),
            new Car("Silver", 100,"123kk")));


    @Override
    public List<Car> getCars(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
