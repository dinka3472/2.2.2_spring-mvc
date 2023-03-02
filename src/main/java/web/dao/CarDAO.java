package web.dao;

import web.entity.Car;

import java.util.List;

public interface CarDAO {
    List<Car> getCars(int count);
}
