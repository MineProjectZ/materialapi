package net.tilera.materialapi;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.tilera.materialapi.items.Nuggets;

public class NuggetTab extends CreativeTabs {

	public NuggetTab() {
		super("NuggetTab");
	}
	
	@Override
	public Item getTabIconItem() {
		return Nuggets.nugget1810ium;
	}
}
