package me.pumpkinbear111.bigredbutton.buttons.blue;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.fish.TropicalFishEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.World;

public class blue_button_generation {

    public static void create(World world, int x, int y, int z) {

        generateLayer(world, x, y, z, Blocks.SAND.defaultBlockState());

        y++;
        for( int yinc = 0; yinc < 4; yinc++ ) {

            generateLayer(world, x, y + yinc, z, Blocks.WATER.defaultBlockState());

        }

        generatePlantLayer(world, x, y, z);
        spawnAnimals(world, x, y + 2, z);

    }

    public static void generateLayer(World world, int x, int y, int z, BlockState blockType) {

        BlockPos blockPos = new BlockPos(x, y, z);

        for( int newZ = z - 2; newZ <= z + 2; newZ++ ) {
            for( int i = 0; i < 5; i++ ) {
                world.setBlock(new BlockPos(x + i, y, newZ), blockType, 1);
            }
        }

    }

    public static void spawnAnimals(World world, int x, int y, int z) {

        BlockPos blockPos = new BlockPos(x, y, z);
        TropicalFishEntity entity1 = new TropicalFishEntity(EntityType.TROPICAL_FISH, world);
        entity1.setVariant(118161664);
        entity1.moveTo(Vector3d.atBottomCenterOf(blockPos));
        world.addFreshEntity(entity1);

        blockPos = new BlockPos(x + 3, y - 1, z - 2);
        TropicalFishEntity entity2 = new TropicalFishEntity(EntityType.TROPICAL_FISH, world);
        entity2.setVariant(65536);
        entity2.moveTo(Vector3d.atBottomCenterOf(blockPos));
        world.addFreshEntity(entity2);


        blockPos = new BlockPos(x - 3, y + 1, z + 2);
        TropicalFishEntity entity3 = new TropicalFishEntity(EntityType.TROPICAL_FISH, world);
        entity3.setVariant(67764993);
        entity3.moveTo(Vector3d.atBottomCenterOf(blockPos));
        world.addFreshEntity(entity3);

    }

    public static void generatePlantLayer(World world, int x, int y, int z) {

        z -= 2;

        BlockPos blockPos;

        for(int i = 0; i < 25; i++) {

            if(Math.random() < .5) {

                blockPos = new BlockPos(x + i%5, y, z + i/5);
                world.setBlock(blockPos, Blocks.SEAGRASS.defaultBlockState(), 1);

            }

        }

    }

}
