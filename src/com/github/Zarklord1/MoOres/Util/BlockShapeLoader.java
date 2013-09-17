package com.github.Zarklord1.MoOres.Util;

import java.util.List;

import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.Texture;

import com.github.Zarklord1.MoOres.MoOres;
import com.github.Zarklord1.MoOres.Config.MoOresConfiguration;

public class BlockShapeLoader extends GenericBlockDesign {
	
	public BlockShapeLoader(MoOresConfiguration config, int amountOfQuads, int textureID/*,Texture texture*/) {
		//TODO set Bounding Box needs to be configurable
		//For Individal Block Designs With A Individual Texture
		Texture texture = MoOres.blocks;//TODO Texture png file needs to be configurable...
        setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F).setQuadNumber(amountOfQuads);
        for (int quadNum = 1;quadNum <= amountOfQuads; quadNum++) {
        	Quad quad = new Quad(0, texture.getSubTexture(textureID));
        	List<String> stringlist = config.getStringList("Quads.Quad" + quadNum);
        	for (int i = 0; i <= 3; i++)  {
        		String vertex = stringlist.get(i);
        		String[] individualVertexNum = vertex.split(" ");
        		quad.addVertex(i, Float.valueOf(individualVertexNum[0]), Float.valueOf(individualVertexNum[1]), Float.valueOf(individualVertexNum[2]));
        		setQuad(quad);
        	}
        }
	}
	public BlockShapeLoader(MoOresConfiguration config, int amountOfQuads, int textureIDs[]/*,Texture texture*/) {
		//TODO For Individual Block Design With Multiple Textures
	}
	public BlockShapeLoader(MoOresConfiguration config, int amountOfQuads, int textureIDs[], int amountOfBlockDesigns/*,Texture texture*/) {
		//TODO For Multiple Block Design's With Multiple Textures
	}
	public BlockShapeLoader(MoOresConfiguration config, int amountOfQuads, int textureID, int amountOfBlockDesigns/*,Texture texture*/) {
		//TODO For Multiple Block Design's With A Individual Textures
	}
	
}
