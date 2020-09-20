package com.xutongxin.test.item.auto;

import net.minecraft.item.Item;
import com.xutongxin.test.XTXGroup;

public class TestItem extends Item {

    public TestItem() {
        super(new Properties().group(XTXGroup.Modgroup.itemGroup));
        this.setRegistryName("helloworld");
    }
}
