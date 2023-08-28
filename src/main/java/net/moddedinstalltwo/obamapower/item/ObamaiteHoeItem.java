
package net.moddedinstalltwo.obamapower.item;

import net.moddedinstalltwo.obamapower.init.ObamapowerModItems;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.network.chat.Component;

import java.util.List;

public class ObamaiteHoeItem extends HoeItem {
	public ObamaiteHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 0;
			}

			public float getSpeed() {
				return 24f;
			}

			public float getAttackDamageBonus() {
				return 18f;
			}

			public int getLevel() {
				return 20;
			}

			public int getEnchantmentValue() {
				return 140;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ObamapowerModItems.OBAMAITE_GEM.get()));
			}
		}, 0, -3f, new Item.Properties().fireResistant());
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(Component.literal("Farming? More like a single tick. Am I right or am I right?"));
	}

	@Override
	@OnlyIn(Dist.CLIENT)
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}
}
