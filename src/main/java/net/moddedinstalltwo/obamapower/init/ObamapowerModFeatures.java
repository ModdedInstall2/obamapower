
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddedinstalltwo.obamapower.init;

import net.moddedinstalltwo.obamapower.world.features.ores.ObamaiteOreFeature;
import net.moddedinstalltwo.obamapower.ObamapowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ObamapowerModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ObamapowerMod.MODID);
	public static final RegistryObject<Feature<?>> OBAMAITE_ORE = REGISTRY.register("obamaite_ore", ObamaiteOreFeature::new);
}
