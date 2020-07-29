package com.xutongxin.test;

import com.github.dawnflyc.processtree.Tree;
import com.xutongxin.test.event.GameRegister;
import com.xutongxin.test.item.Test1Item;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

@Mod("test")
public class Test {
    public static final String MOD_ID = "test";


    public Test() {
        Tree tree = new Tree("com.xutongxin.test");
        tree.run();
        //添加了五种随机饱食度的食物
        Random random = new Random();
        String[] strs = {"cu", "iron", "cd", "d", "e"};
        for (String str : strs) {
            GameRegister.RegistryItem(new Test1Item(str, random.nextInt(10)));
        }

    }


}


