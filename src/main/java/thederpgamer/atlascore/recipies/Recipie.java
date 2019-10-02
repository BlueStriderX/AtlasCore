package thederpgamer.atlascore.recipies;

import java.util.HashMap;
import org.bukkit.Material;
import thederpgamer.atlascore.blocks.CustomBlock;
import thederpgamer.atlascore.items.CustomItem;

public class Recipie {
	
	public Recipie(RecipieType crafting, int numberProduced, HashMap<Material, Integer> components1) {
	}
	
	public Recipie(RecipieType crafting, int numberProduced, HashMap<Material, Integer> components1, HashMap<CustomItem, Integer> components2) {
	}
	
	public Recipie(RecipieType crafting, int numberProduced, HashMap<Material, Integer> components1, HashMap<CustomItem, Integer> components2, HashMap<CustomBlock, Integer> components3) {
	}
	
	public Recipie(RecipieType furnace, int numberProduced) {
	}
}
