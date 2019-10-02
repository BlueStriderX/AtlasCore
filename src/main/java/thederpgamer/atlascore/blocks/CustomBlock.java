package thederpgamer.atlascore.blocks;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.json.simple.parser.ParseException;
import net.minecraft.server.v1_14_R1.Block;
import net.minecraft.server.v1_14_R1.Blocks;
import thederpgamer.atlascore.main.Main;
import thederpgamer.atlascore.recipies.Recipie;

public class CustomBlock {
	
	public Block baseblock = Blocks.SPAWNER;
	public String name;
	public String displayName;
	public int modelData;
	public List<Recipie> recipies;
	public boolean ore;
	
	public void register() {
		Main.customBlocks.add(this);
		try {
			Main.writeCustomBlock(this);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}