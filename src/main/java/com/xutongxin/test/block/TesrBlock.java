package com.xutongxin.test.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class TesrBlock extends Block {

    public TesrBlock() {
        super(Properties.create(Material.ANVIL));
        this.setRegistryName("testblock");
    }
}
