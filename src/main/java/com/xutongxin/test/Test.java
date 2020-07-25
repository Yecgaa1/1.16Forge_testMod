package com.xutongxin.test;

import net.minecraft.item.Item;
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

@Mod("test")
public class Test {
    public static final String MOD_ID="test";

}
Itemgroup.MSIC

@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class ModRegistry {

    private static final Logger LOGGER = LogManager.getLogger();

    /**
     * Mod注册表，调用方法将对象put进来，游戏注册事件遍历调用
     */
    private static final Map<String, Item> REG_ITEMS=new HashMap<>();

    public ModRegistry() {

    }

    /**
     * 注册物品
     * @param item
     */
    public static void itemRegister(Item item){
        REG_ITEMS.put(item.getRegistryName().getPath(),item);
    }
    /**
     * 注册物品
     * @param item
     * @param registryName
     */
    public static void itemRegister(Item item,String registryName){
        item.setRegistryName(Test.MOD_ID,registryName);
        REG_ITEMS.put(item.getRegistryName().getPath(),item);
    }

    /**
     * 注册事件，改注册类型，需要改参数泛型
     * @param itemRegistryEvent
     */
    @SubscribeEvent
    public static void onItemsRegistry(final RegistryEvent.Register<Item> itemRegistryEvent) {
        for (Item value : REG_ITEMS.values()) {
            itemRegistryEvent.getRegistry().register(value);
            LOGGER.info("注册物品:"+value.getRegistryName().getPath()+"成功！");
        }
    }

    @SubscribeEvent
    @OnlyIn(Dist.CLIENT)
    public static void itemColors(ColorHandlerEvent.Item event) {
        event.getItemColors().register(new ModItemColor(), ItemModelItem.ITEM);
    }



}








