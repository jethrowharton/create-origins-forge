package com.xlr08.createoriginsforge.mixin;

import com.simibubi.create.content.equipment.armor.DivingHelmetItem;
import io.github.edwinmindcraft.apoli.api.component.IPowerContainer;
import io.github.apace100.origins.power.OriginsPowerTypes;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.event.entity.living.LivingEvent;
import net.minecraftforge.fluids.FluidType;
import net.minecraft.tags.FluidTags;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(value = DivingHelmetItem.class, remap = false)
public class DivingHelmetItemMixin {
	@Redirect(method = "breatheUnderwater", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/LivingEntity;canDrownInFluidType(Lnet/minecraftforge/fluids/FluidType;)Z", ordinal = 0))
	private static boolean modifyBreatheUnderwater(LivingEntity instance, FluidType fluidType) {
		if (IPowerContainer.hasPower(instance, OriginsPowerTypes.WATER_BREATHING.get())) {
			return !instance.isEyeInFluid(FluidTags.WATER);
		}
		else {
			return instance.canDrownInFluidType(instance.getEyeInFluidType());
		}
	}
}
