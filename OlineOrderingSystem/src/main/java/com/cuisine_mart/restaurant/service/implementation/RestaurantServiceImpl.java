package com.cuisine_mart.restaurant.service.implementation;

import com.cuisine_mart.restaurant.dao.IDaoContract.IRestaurantDao;
import com.cuisine_mart.restaurant.domain.CuisineCategory;
import com.cuisine_mart.restaurant.domain.Restaurant;
import com.cuisine_mart.restaurant.service.IServiceContract.IRestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Rajiv on 8/26/2016.
 */
@Service
public class RestaurantServiceImpl implements IRestaurantService {
    @Autowired
    IRestaurantDao restaurantDao;


    @Override
    @Transactional
    public List<Restaurant> findAllRestaurantsByCuisine(CuisineCategory cuisineCategory) {
        Long cuisineCategoryId = cuisineCategory.getId();
        return restaurantDao.findAllByCuisine(cuisineCategoryId);
    }

    @Override
    @Transactional
    public List<Restaurant> findAllByNameLike(String name) {
        return restaurantDao.findAllByNameLike(name);
    }

    @Override
    @Transactional
    public List<Restaurant> findAllByDescriptionLike(String description) {
        return restaurantDao.findAllByDescriptionLike(description);
    }

    @Override
    @Transactional
    public List<Restaurant> findAll() {
        return restaurantDao.findAll();
    }

    @Override
    @Transactional
    public void save(Restaurant restaurant){
        restaurantDao.save(restaurant);
    }

    @Override
    public void update(Restaurant restaurant) {
        save(restaurant);
    }

    @Override
    @Transactional
    public void delete(Restaurant restaurant) {
        restaurantDao.delete(restaurant);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        restaurantDao.delete(id);
    }
}
