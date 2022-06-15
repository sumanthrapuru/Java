package designpatterns.builderpattern;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class BuilderPattern {

    BuilderPattern(){
        Item i = Item.builder()
                .setName("")
                .setCategory(Category.Cat1)
                .build();

        Set<Item> set = null;
        Map<Category, Set<Item>> map = new HashMap<>();
        for(Item item : set){
            if(!map.containsKey(item.category)){
                Set<Item> iSet = new HashSet<Item>();
                iSet.add(item);
            } else {

            }
        }
    }

}
