package me.pumpkinbear111.bigredbutton.buttons.green;

import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class green_button_oak_leave_generation {

    public static void makeLeaves(World world, int x, int y, int z) {

        // Adjusting x, y, and z to center around the tree.
        x -= 3;
        z -= 4;
        y += 3;

        BlockPos blockPos;

        for(int level = 0; level < 2; level++, y++) {

            for(int i = 0; i < 25; i++) {
                if(Math.random() < .90) {

                    blockPos = new BlockPos(x + i%5, y, z + i/5);
                    world.setBlock(blockPos, Blocks.OAK_LEAVES.defaultBlockState(), 1);

                }

            }

        }

        x++;
        z++;
        for(int level = 0; level < 2; level++, y++) {

            for(int i = 0; i < 9; i++) {
                if(Math.random() < .75) {

                    blockPos = new BlockPos(x + i%3, y, z + i/3);
                    world.setBlock(blockPos, Blocks.OAK_LEAVES.defaultBlockState(), 1);

                }

            }

        }

    }

}
