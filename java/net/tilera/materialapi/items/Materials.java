package net.tilera.materialapi.items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.tilera.materialapi.Main;

public class Materials {

	public static ItemBase itemSilicon;
	public static ItemBase gemQuartzBlack;
	
	public static void init() {
		itemSilicon = register(new ItemOre("itemSilicon", "itemSilicon").setCreativeTab(Main.materialTab));
		gemQuartzBlack = register(new ItemOre("gemQuartzBlack", "gemQuartzBlack").setCreativeTab(Main.materialTab));
	}

	private static <T extends Item> T register(T item) {
		GameRegistry.register(item);

		if (item instanceof ItemBase) {
			((ItemBase)item).registerItemModel();
		}
		if (item instanceof ItemOreDict) {
			((ItemOreDict)item).initOreDict();
		}

		return item;
	}
}
