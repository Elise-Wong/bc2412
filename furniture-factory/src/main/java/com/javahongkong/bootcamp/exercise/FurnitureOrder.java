package com.javahongkong.bootcamp.exercise;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.stream.Collectors;

public class FurnitureOrder implements FurnitureOrderInterface { //考coding style
    /**
     * TODO: Create a map of Furniture items to order quantities
     */
    HashMap<Furniture, Integer> ordersOfFurnitures;

    /**
     * Initialize a new mapping of Furniture types to order quantities.
     */
    FurnitureOrder() {
        // TODO: Complete the constructor
    }

    public void addToOrder(final Furniture type, final int furnitureCount) { //count
        // TODO: Complete the method

    }

    public HashMap<Furniture, Integer> getOrderedFurniture() {
        // TODO: Complete the method
        return null; //getter: this.  ;
    }

    public float getTotalOrderCost() { //to calculate sth, can use for loop (no risk for double to float)
        // TODO: Complete the method
        // DoubleSteam -> double -> int
        // double -> float
        return (float) this.ordersOfFurnitures.entrySet().stream()
            .map(entry -> this.getTypeCost(entry.getKey()))
            .mapToDouble(f -> f.doubleValue())
            .sum();
        //return -1.0f;
    }

    public int getTypeCount(Furniture type) { //cant be null
        // TODO: Complete the method
        Integer count = this.ordersOfFurnitures.get(type);
        return count == null ? 0 : count; //unbox
        //return -1; // getter: this.ordersOfFurnitures.get(type)
    }

    public float getTypeCost(Furniture type) { //instantic method quantity * price
        // TODO: Complete the method
        //method call method...wont be slow
        //integer * float = float, so no BigDecimal, as no float * float = float
        return this.getTypeCost(type) * type.cost();
        //return -1.0f;
    }

    public int getTotalOrderQuantity() { //for loop / map->stream
        // TODO: Complete the method
        // int array not same as int stream
        // ! IntStream -> sum(), average(), max(), etc.
        // ! Stream<Integer> -> filter, map, collect
        return this.ordersOfFurnitures.values().stream().mapToInt(e -> e.intValue()).sum();
        //return -1;
    }

    public static void main(String[] args) {
        HashMap<Furniture, Integer> fo = new HashMap<>();
        fo.put(Furniture.CHAIR, 3);
        System.out.println(fo);
        //System.out.println(fo.getOrderedFurniture(), fo);


    }
}