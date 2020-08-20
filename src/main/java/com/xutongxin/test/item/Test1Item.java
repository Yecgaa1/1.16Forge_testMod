package com.xutongxin.test.item;

import net.minecraft.item.Food;
import net.minecraft.item.Item;

public class Test1Item extends Item {

    public Test1Item(String registryName,float sweet) {
        super(new Properties().food(new Food.Builder().saturation(sweet).hunger((int) sweet).build()));
        this.setRegistryName(registryName);
    }
}
