package com.xutongxin.test.event;

import com.sun.media.jfxmedia.logging.Logger;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.text.StringTextComponent;
import net.minecraftforge.event.entity.EntityJoinWorldEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;

@Mod.EventBusSubscriber
public class Join {
    private static final org.apache.logging.log4j.Logger LOGGER = LogManager.getLogger();

    @SubscribeEvent
    public static void onPlayerJoin(EntityJoinWorldEvent event)
    {
        Entity entity=event.getEntity();
        if(entity instanceof PlayerEntity)
        {
            String message="Hello world";
            StringTextComponent text=new StringTextComponent(message);
            entity.sendMessage(text,entity.getUniqueID());
            LOGGER.info(entity.getUniqueID()+"玩家加入游戏");

        }
    }
}
