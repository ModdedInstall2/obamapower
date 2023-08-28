
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.moddedinstalltwo.obamapower.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ObamapowerModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("obamapower", "obama"),
				builder -> builder.title(Component.translatable("item_group.obamapower.obama")).icon(() -> new ItemStack(ObamapowerModItems.OBAMAITE_GEM.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ObamapowerModItems.OBAMAITE_GEM.get());
					tabData.accept(ObamapowerModBlocks.OBAMAITE_ORE.get().asItem());
					tabData.accept(ObamapowerModItems.OBAMAITE_ARMOR_HELMET.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_ARMOR_CHESTPLATE.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_ARMOR_LEGGINGS.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_ARMOR_BOOTS.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_AXE.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_PICKAXE.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_SWORD.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_SHOVEL.get());
					tabData.accept(ObamapowerModItems.OBAMAITE_HOE.get());
				})

		);
	}
}
