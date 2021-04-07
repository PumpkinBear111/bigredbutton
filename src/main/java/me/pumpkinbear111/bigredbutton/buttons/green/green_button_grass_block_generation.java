package me.pumpkinbear111.bigredbutton.buttons.green;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class green_button_grass_block_generation {

    public static void makeBlocks(World world, int x, int y, int z) {

        x -= 3;
        z -= 4;

        BlockPos blockPos;

        for(int i = 1; i < 48; i++) {
            if( i == 6 || i == 42 )
                continue;

            blockPos = new BlockPos(x + i % 7, y, z + i / 7);
            world.setBlock(blockPos, Blocks.GRASS_BLOCK.defaultBlockState(), 1);
        }

    }

}
