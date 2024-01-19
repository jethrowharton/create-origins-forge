package com.xlr08.createoriginsforge;

import com.simibubi.create.foundation.data.CreateRegistrate;

import com.simibubi.create.Create;

import com.simibubi.create.content.equipment.goggles.GogglesItem;
import com.mojang.logging.LogUtils;
import io.github.apace100.apoli.power.Power;
import io.github.apace100.apoli.power.PowerType;
import io.github.apace100.apoli.power.PowerTypeReference;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import org.slf4j.Logger;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(CreateOriginsForge.MODID)
public class CreateOriginsForge {
    public static final String MODID = "createoriginsforge";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();
    public static IEventBus modEventBus;

    //public static final PowerType<Power> GOGGLES = new PowerTypeReference<>(identifier("goggles"));
    private void setup(final FMLCommonSetupEvent event) {

     //   GogglesItem.addIsWearingPredicate(GOGGLES::isActive);

    }
    public CreateOriginsForge() {
    }
    public void init() {
    }
    public static ResourceLocation identifier(String path) {
        return new ResourceLocation(MODID, path);
    }


}
