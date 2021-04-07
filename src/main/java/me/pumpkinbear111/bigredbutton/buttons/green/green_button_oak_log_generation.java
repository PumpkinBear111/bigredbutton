package me.pumpkinbear111.bigredbutton.buttons.green;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class green_button_oak_log_generation {

    public static void makeLogs(World world, int x, int y, int z) {

        BlockPos blockPos;

        // Log

        for(int i = 0; i < 5; i++) {

            blockPos = new BlockPos(x, y + i, z);
            world.setBlock(blockPos, Blocks.OAK_LOG.defaultBlockState(), 1);

        }


    }



}
