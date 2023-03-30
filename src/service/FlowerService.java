package service;

import classes.Carnation;
import classes.MyException;
import classes.Rose;

import java.util.List;
import java.util.Map;
public interface FlowerService<T>{
    String addFlowers(List<T> t);
    List<Carnation> getAllFlowers();
    List<T> getFlowersFinByColor(String color) throws MyException;
    Map<String, List<T>> groupingFlowersByColor();
    int getSumAllFlowers();
    List<T> getAllFlowersSortByPrice(String ascendingOrDescending) throws Exception;
}
