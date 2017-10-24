package net.tilera.materialapi;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.tilera.materialapi.items.Dusts;

public class DustTab extends CreativeTabs {

	public DustTab() {
		super("DustTab");
	}
	
	@Override
	public Item getTabIconItem() {
		return Dusts.dustBluestone;
	}
	
}
