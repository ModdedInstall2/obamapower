
package net.moddedinstalltwo.obamapower.item;

import net.moddedinstalltwo.obamapower.procedures.ObamaiteArmorTickEventProcedure;
import net.moddedinstalltwo.obamapower.init.ObamapowerModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundEvent;

public abstract class ObamaiteArmorItem extends ArmorItem {
	public ObamaiteArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForType(ArmorItem.Type type) {
				return new int[]{13, 15, 16, 11}[type.getSlot().getIndex()] * 0;
			}

			@Override
			public int getDefenseForType(ArmorItem.Type type) {
				return new int[]{500, 500, 500, 500}[type.getSlot().getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 100;
			}

			@Override
			public SoundEvent getEquipSound() {
				return SoundEvents.EMPTY;
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ObamapowerModItems.OBAMAITE_GEM.get()));
			}

			@Override
			public String getName() {
				return "obamaite_armor";
			}

			@Override
			public float getToughness() {
				return 10f;
			}

			@Override
			public float getKnockbackResistance() {
				return 1f;
			}
		}, type, properties);
	}

	public static class Helmet extends ObamaiteArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obamapower:textures/models/armor/obamaite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ObamaiteArmorTickEventProcedure.execute(entity);
		}
	}

	public static class Chestplate extends ObamaiteArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obamapower:textures/models/armor/obamaite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ObamaiteArmorTickEventProcedure.execute(entity);
		}
	}

	public static class Leggings extends ObamaiteArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obamapower:textures/models/armor/obamaite_layer_2.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ObamaiteArmorTickEventProcedure.execute(entity);
		}
	}

	public static class Boots extends ObamaiteArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().fireResistant());
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "obamapower:textures/models/armor/obamaite_layer_1.png";
		}

		@Override
		public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
			ObamaiteArmorTickEventProcedure.execute(entity);
		}
	}
}
