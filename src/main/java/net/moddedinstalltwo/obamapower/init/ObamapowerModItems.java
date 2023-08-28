
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddedinstalltwo.obamapower.init;

import net.moddedinstalltwo.obamapower.item.ObamaiteSwordItem;
import net.moddedinstalltwo.obamapower.item.ObamaiteShovelItem;
import net.moddedinstalltwo.obamapower.item.ObamaitePickaxeItem;
import net.moddedinstalltwo.obamapower.item.ObamaiteHoeItem;
import net.moddedinstalltwo.obamapower.item.ObamaiteGemItem;
import net.moddedinstalltwo.obamapower.item.ObamaiteAxeItem;
import net.moddedinstalltwo.obamapower.item.ObamaiteArmorItem;
import net.moddedinstalltwo.obamapower.ObamapowerMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

public class ObamapowerModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ObamapowerMod.MODID);
	public static final RegistryObject<Item> OBAMAITE_GEM = REGISTRY.register("obamaite_gem", () -> new ObamaiteGemItem());
	public static final RegistryObject<Item> OBAMAITE_ORE = block(ObamapowerModBlocks.OBAMAITE_ORE);
	public static final RegistryObject<Item> OBAMAITE_ARMOR_HELMET = REGISTRY.register("obamaite_armor_helmet", () -> new ObamaiteArmorItem.Helmet());
	public static final RegistryObject<Item> OBAMAITE_ARMOR_CHESTPLATE = REGISTRY.register("obamaite_armor_chestplate", () -> new ObamaiteArmorItem.Chestplate());
	public static final RegistryObject<Item> OBAMAITE_ARMOR_LEGGINGS = REGISTRY.register("obamaite_armor_leggings", () -> new ObamaiteArmorItem.Leggings());
	public static final RegistryObject<Item> OBAMAITE_ARMOR_BOOTS = REGISTRY.register("obamaite_armor_boots", () -> new ObamaiteArmorItem.Boots());
	public static final RegistryObject<Item> OBAMAITE_AXE = REGISTRY.register("obamaite_axe", () -> new ObamaiteAxeItem());
	public static final RegistryObject<Item> OBAMAITE_PICKAXE = REGISTRY.register("obamaite_pickaxe", () -> new ObamaitePickaxeItem());
	public static final RegistryObject<Item> OBAMAITE_SWORD = REGISTRY.register("obamaite_sword", () -> new ObamaiteSwordItem());
	public static final RegistryObject<Item> OBAMAITE_SHOVEL = REGISTRY.register("obamaite_shovel", () -> new ObamaiteShovelItem());
	public static final RegistryObject<Item> OBAMAITE_HOE = REGISTRY.register("obamaite_hoe", () -> new ObamaiteHoeItem());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
