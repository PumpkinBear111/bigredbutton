package me.pumpkinbear111.bigredbutton.buttons;

import me.pumpkinbear111.bigredbutton.Bigredbutton;
import me.pumpkinbear111.bigredbutton.buttons.blue.blue_button_generation;
import me.pumpkinbear111.bigredbutton.buttons.green.green_button_grass_block_generation;
import me.pumpkinbear111.bigredbutton.buttons.green.green_button_oak_leave_generation;
import me.pumpkinbear111.bigredbutton.buttons.green.green_button_plant_generation;
import me.pumpkinbear111.bigredbutton.buttons.green.green_button_oak_log_generation;
import me.pumpkinbear111.bigredbutton.util.Lightning;
import me.pumpkinbear111.bigredbutton.util.RegistryHandler;
import net.minecraft.block.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bigredbutton.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class buttons {

    @SubscribeEvent
    public static void onRightClick(final PlayerInteractEvent.RightClickBlock event) {

        int x = event.getPos().getX();
        int y = event.getPos().getY();
        int z = event.getPos().getZ();

        World world = event.getWorld();

        BlockPos blockPos = new BlockPos(x, y, z);
        Block block = world.getBlockState(blockPos).getBlock();

        // Red Button
        if(block.equals(RegistryHandler.RED_BUTTON.get())) {

            world.explode(null, x, y, z, 15, Explosion.Mode.DESTROY);

            block = null;

            return;

        }

        // Yellow Button
        if(block.equals(RegistryHandler.YELLOW_BUTTON.get())) {

            world.explode(null, x, y, z, 17, Explosion.Mode.DESTROY);

            // Summon Lightning
            Lightning.summon(blockPos.getX(), blockPos.getY(), blockPos.getZ(), world);
            Lightning.summon(blockPos.getX() + 2, blockPos.getY(), blockPos.getZ(), world);
            Lightning.summon(blockPos.getX() - 2, blockPos.getY(), blockPos.getZ(), world);
            Lightning.summon(blockPos.getX(), blockPos.getY(), blockPos.getZ() + 2, world);
            Lightning.summon(blockPos.getX(), blockPos.getY(), blockPos.getZ() - 2, world);

            block = null;

            return;

        }

        // Green Button
        if(block.equals(RegistryHandler.GREEN_BUTTON.get())) {

            event.getWorld().explode(null, x, y, z, 3, Explosion.Mode.NONE);

            green_button_grass_block_generation.placeTheBlocks(world, x, y, z);
            green_button_plant_generation.placeTheBlocks(world, x, y + 1, z);
            green_button_oak_log_generation.generate(world, x - 1, y + 1, z - 2);
            green_button_oak_leave_generation.generateLower(world, x, y, z);
            green_button_oak_leave_generation.generateUpper(world, x - 1, y + 5, z - 2);
            green_button_oak_leave_generation.generateUpper(world, x - 1, y + 6, z - 2);

        }

        // Green Button
        if(block.equals(RegistryHandler.BLUE_BUTTON.get())) {

            event.getWorld().explode(null, x, y, z, 3, Explosion.Mode.NONE);

            blue_button_generation.create(world, x - 2, y, z);

        }

    }

}
