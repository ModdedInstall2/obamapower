
package net.moddedinstalltwo.obamapower.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ObamaiteGemItem extends Item {
	public ObamaiteGemItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.EPIC));
	}

	@Override
	public UseAnim getUseAnimation(ItemStack itemstack) {
		return UseAnim.EAT;
	}

	@Override
	public boolean isCorrectToolForDrops(BlockState state) {
		return true;
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("This item is rare and mysterious. It may have special powers"));
		list.add(Component.literal("but such powers are unknown"));
		list.add(Component.literal("as all who touch it either become an Obama Prism or spontaneously combust. USE CAUTION"));
	}
}
