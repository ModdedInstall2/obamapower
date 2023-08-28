
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddedinstalltwo.obamapower.init;

import net.moddedinstalltwo.obamapower.block.ObamaiteOreBlock;
import net.moddedinstalltwo.obamapower.ObamapowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class ObamapowerModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, ObamapowerMod.MODID);
	public static final RegistryObject<Block> OBAMAITE_ORE = REGISTRY.register("obamaite_ore", () -> new ObamaiteOreBlock());
}
