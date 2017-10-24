package net.tilera.materialapi;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.tilera.materialapi.items.Ingots;

public class IngotTab extends CreativeTabs {

	public IngotTab() {
		super("IngotTab");
	}
	
	@Override
	public Item getTabIconItem() {
		return Ingots.ingotCopper;
	}
	
}
