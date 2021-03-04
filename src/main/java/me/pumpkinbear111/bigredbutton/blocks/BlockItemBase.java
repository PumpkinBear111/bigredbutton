package me.pumpkinbear111.bigredbutton.blocks;

import me.pumpkinbear111.bigredbutton.Bigredbutton;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public class BlockItemBase extends BlockItem {

    public BlockItemBase(Block block) {

        super(block, new Properties().group(Bigredbutton.TAB));

    }
}