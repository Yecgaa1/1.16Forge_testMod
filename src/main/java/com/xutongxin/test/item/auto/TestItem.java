package com.xutongxin.test.item.auto;

import net.minecraft.item.Item;
import com.xutongxin.test.xtxgroup;

public class TestItem extends Item {

    public TestItem() {
        super(new Properties().group(xtxgroup.Modgroup.itemGroup));
        this.setRegistryName("helloworld");
    }
}
