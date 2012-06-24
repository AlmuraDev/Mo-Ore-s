package com.github.Zarklord1.MoOres.Custom.Blocks.Bushes;

import com.github.Zarklord1.MoOres.MoOres;
import org.getspout.spoutapi.block.design.GenericBlockDesign;
import org.getspout.spoutapi.block.design.Quad;
import org.getspout.spoutapi.block.design.Texture;

public class CustomBushDesign extends GenericBlockDesign {
    public static int freq = 0;

    public CustomBushDesign(MoOres plugin, int[] textureids, int freq) {
        Texture thetexture = MoOres.plants;
        setBoundingBox(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F).setQuadNumber(26);
        setTexture(plugin, thetexture.getTexture()).setMinBrightness(1.0F).setMaxBrightness(1.0F);

        Quad bottom = new Quad(0, thetexture.getSubTexture(textureids[0]));
        bottom.addVertex(3, 0.25F, 0.0F, 0.25F);
        bottom.addVertex(0, 0.75F, 0.0F, 0.25F);
        bottom.addVertex(1, 0.75F, 0.0F, 0.75F);
        bottom.addVertex(2, 0.25F, 0.0F, 0.75F);

        Quad front = new Quad(1, thetexture.getSubTexture(textureids[1]));
        front.addVertex(0, 0.25F, 0.25F, 0.0F);
        front.addVertex(3, 0.75F, 0.25F, 0.0F);
        front.addVertex(2, 0.75F, 0.75F, 0.0F);
        front.addVertex(1, 0.25F, 0.75F, 0.0F);

        Quad fronttop = new Quad(2, thetexture.getSubTexture(textureids[0]));
        fronttop.addVertex(0, 0.25F, 0.75F, 0.0F);
        fronttop.addVertex(3, 0.75F, 0.75F, 0.0F);
        fronttop.addVertex(2, 0.75F, 1.0F, 0.25F);
        fronttop.addVertex(1, 0.25F, 1.0F, 0.25F);

        Quad frontbottom = new Quad(3, thetexture.getSubTexture(textureids[0]));
        frontbottom.addVertex(3, 0.25F, 0.25F, 0.0F);
        frontbottom.addVertex(0, 0.75F, 0.25F, 0.0F);
        frontbottom.addVertex(1, 0.75F, 0.0F, 0.25F);
        frontbottom.addVertex(2, 0.25F, 0.0F, 0.25F);

        Quad back = new Quad(4, thetexture.getSubTexture(textureids[2]));
        back.addVertex(3, 0.25F, 0.25F, 1.0F);
        back.addVertex(0, 0.75F, 0.25F, 1.0F);
        back.addVertex(1, 0.75F, 0.75F, 1.0F);
        back.addVertex(2, 0.25F, 0.75F, 1.0F);

        Quad backtop = new Quad(5, thetexture.getSubTexture(textureids[0]));
        backtop.addVertex(1, 0.25F, 0.75F, 1.0F);
        backtop.addVertex(2, 0.75F, 0.75F, 1.0F);
        backtop.addVertex(3, 0.75F, 1.0F, 0.75F);
        backtop.addVertex(0, 0.25F, 1.0F, 0.75F);

        Quad backbottom = new Quad(6, thetexture.getSubTexture(textureids[0]));
        backbottom.addVertex(3, 0.25F, 0.25F, 1.0F);
        backbottom.addVertex(2, 0.75F, 0.25F, 1.0F);
        backbottom.addVertex(1, 0.75F, 0.0F, 0.75F);
        backbottom.addVertex(0, 0.25F, 0.0F, 0.75F);

        Quad left = new Quad(7, thetexture.getSubTexture(textureids[3]));
        left.addVertex(3, 0.0F, 0.25F, 0.25F);
        left.addVertex(2, 0.0F, 0.75F, 0.25F);
        left.addVertex(1, 0.0F, 0.75F, 0.75F);
        left.addVertex(0, 0.0F, 0.25F, 0.75F);

        Quad lefttop = new Quad(8, thetexture.getSubTexture(textureids[0]));
        lefttop.addVertex(3, 0.0F, 0.75F, 0.25F);
        lefttop.addVertex(2, 0.25F, 1.0F, 0.25F);
        lefttop.addVertex(1, 0.25F, 1.0F, 0.75F);
        lefttop.addVertex(0, 0.0F, 0.75F, 0.75F);
        
        Quad leftbottom = new Quad(9, thetexture.getSubTexture(textureids[0]));
        leftbottom.addVertex(3, 0.0F, 0.25F, 0.25F);
        leftbottom.addVertex(0, 0.25F, 0.0F, 0.25F);
        leftbottom.addVertex(1, 0.25F, 0.0F, 0.75F);
        leftbottom.addVertex(2, 0.0F, 0.25F, 0.75F);
        
        Quad right = new Quad(10, thetexture.getSubTexture(textureids[0]));
        right.addVertex(0, 1.0F, 0.25F, 0.25F);
        right.addVertex(1, 1.0F, 0.75F, 0.25F);
        right.addVertex(2, 1.0F, 0.75F, 0.75F);
        right.addVertex(3, 1.0F, 0.25F, 0.75F);

        Quad righttop = new Quad(11, thetexture.getSubTexture(textureids[0]));
        righttop.addVertex(0, 1.0F, 0.75F, 0.25F);
        righttop.addVertex(1, 0.75F, 1.0F, 0.25F);
        righttop.addVertex(2, 0.75F, 1.0F, 0.75F);
        righttop.addVertex(3, 1.0F, 0.75F, 0.75F);

        Quad rightbottom = new Quad(12, thetexture.getSubTexture(textureids[0]));
        rightbottom.addVertex(3, 1.0F, 0.25F, 0.25F);
        rightbottom.addVertex(2, 0.75F, 0.0F, 0.25F);
        rightbottom.addVertex(1, 0.75F, 0.0F, 0.75F);
        rightbottom.addVertex(0, 1.0F, 0.25F, 0.75F);

        Quad top = new Quad(13, thetexture.getSubTexture(textureids[0]));
    top.addVertex(2, 0.25F, 1.0F, 0.25F);
    top.addVertex(1, 0.75F, 1.0F, 0.25F);
    top.addVertex(0, 0.75F, 1.0F, 0.75F);
    top.addVertex(3, 0.25F, 1.0F, 0.75F);

    Quad side1 = new Quad(14, thetexture.getSubTexture(textureids[0]));
    side1.addVertex(0, 0.75F, 0.25F, 0.0F);
    side1.addVertex(1, 0.75F, 0.75F, 0.0F);
    side1.addVertex(2, 1.0F, 0.75F, 0.25F);
    side1.addVertex(3, 1.0F, 0.25F, 0.25F);

    Quad side2 = new Quad(15, thetexture.getSubTexture(textureids[0]));
    side2.addVertex(0, 0.0F, 0.25F, 0.25F);
    side2.addVertex(1, 0.0F, 0.75F, 0.25F);
    side2.addVertex(2, 0.25F, 0.75F, 0.0F);
    side2.addVertex(3, 0.25F, 0.25F, 0.0F);

    Quad side3 = new Quad(16, thetexture.getSubTexture(textureids[0]));
    side3.addVertex(3, 0.0F, 0.25F, 0.75F);
    side3.addVertex(2, 0.0F, 0.75F, 0.75F);
    side3.addVertex(1, 0.25F, 0.75F, 1.0F);
    side3.addVertex(0, 0.25F, 0.25F, 1.0F);

    Quad side4 = new Quad(17, thetexture.getSubTexture(textureids[0]));
    side4.addVertex(3, 0.75F, 0.25F, 1.0F);
    side4.addVertex(2, 0.75F, 0.75F, 1.0F);
    side4.addVertex(1, 1.0F, 0.75F, 0.75F);
    side4.addVertex(0, 1.0F, 0.25F, 0.75F);

    Quad top1 = new Quad(18, thetexture.getSubTexture(textureids[0]));
    top1.addVertex(0, 0.25F, 0.75F, 1.0F);
    top1.addVertex(1, 0.25F, 1.0F, 0.75F);
    top1.addVertex(2, 0.0F, 0.75F, 0.75F);
    top1.addVertex(3, 0.25F, 0.75F, 1.0F);

    Quad top2 = new Quad(19, thetexture.getSubTexture(textureids[0]));
    top2.addVertex(0, 1.0F, 0.75F, 0.75F);
    top2.addVertex(1, 0.75F, 1.0F, 0.75F);
    top2.addVertex(2, 0.75F, 0.75F, 1.0F);
    top2.addVertex(3, 1.0F, 0.75F, 0.75F);

    Quad top3 = new Quad(20, thetexture.getSubTexture(textureids[0]));
    top3.addVertex(3, 0.25F, 0.75F, 0.0F);
    top3.addVertex(2, 0.25F, 1.0F, 0.25F);
    top3.addVertex(1, 0.0F, 0.75F, 0.25F);
    top3.addVertex(0, 0.25F, 0.75F, 0.0F);

    Quad top4 = new Quad(21, thetexture.getSubTexture(textureids[0]));
    top4.addVertex(0, 0.75F, 0.75F, 0.0F);
    top4.addVertex(1, 0.75F, 1.0F, 0.25F);
    top4.addVertex(2, 1.0F, 0.75F, 0.25F);
    top4.addVertex(3, 0.75F, 0.75F, 0.0F);

    Quad bottom1 = new Quad(22, thetexture.getSubTexture(textureids[0]));
    bottom1.addVertex(3, 0.25F, 0.25F, 1.0F);
    bottom1.addVertex(2, 0.25F, 0.0F, 0.75F);
    bottom1.addVertex(1, 0.0F, 0.25F, 0.75F);
    bottom1.addVertex(0, 0.25F, 0.25F, 1.0F);

    Quad bottom2 = new Quad(23, thetexture.getSubTexture(textureids[0]));
    bottom2.addVertex(3, 1.0F, 0.25F, 0.75F);
    bottom2.addVertex(2, 0.75F, 0.0F, 0.75F);
    bottom2.addVertex(1, 0.75F, 0.25F, 1.0F);
    bottom2.addVertex(0, 1.0F, 0.25F, 0.75F);

    Quad bottom3 = new Quad(24, thetexture.getSubTexture(textureids[0]));
    bottom3.addVertex(0, 0.25F, 0.25F, 0.0F);
    bottom3.addVertex(1, 0.25F, 0.0F, 0.25F);
    bottom3.addVertex(2, 0.0F, 0.25F, 0.25F);
    bottom3.addVertex(3, 0.25F, 0.25F, 0.0F);

    Quad bottom4 = new Quad(25, thetexture.getSubTexture(textureids[0]));
    bottom4.addVertex(3, 0.75F, 0.25F, 0.0F);
    bottom4.addVertex(2, 0.75F, 0.0F, 0.25F);
    bottom4.addVertex(1, 1.0F, 0.25F, 0.25F);
    bottom4.addVertex(0, 0.75F, 0.25F, 0.0F);

    setQuad(bottom).setQuad(front).setQuad(fronttop).setQuad(frontbottom).setQuad(back).setQuad(backtop).setQuad(backbottom).setQuad(left).setQuad(lefttop).setQuad(leftbottom).setQuad(right).setQuad(righttop).setQuad(rightbottom).setQuad(top).setQuad(side1).setQuad(side2).setQuad(side3).setQuad(side4).setQuad(top1).setQuad(top2).setQuad(top3).setQuad(top4).setQuad(bottom1).setQuad(bottom2).setQuad(bottom3).setQuad(bottom4);
    }
  public int getfreq() {
    return freq;
  }
}