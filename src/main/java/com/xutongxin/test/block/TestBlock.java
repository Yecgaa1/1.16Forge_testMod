package com.xutongxin.test.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class TestBlock extends Block {

    public TestBlock(String name) {
        super(Properties.create(Material.ANVIL));
        this.setRegistryName(name);
    }

    /**
     * 自动注册构造
     */
    public TestBlock() {
        this("test");
    }
}
