package net.tilera.materialapi;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.tilera.materialapi.items.Materials;

public class MaterialTab extends CreativeTabs {

	public MaterialTab() {
		super("MaterialTab");
	}
	
	@Override
	public Item getTabIconItem() {
		return Materials.itemSilicon;
	}
}
