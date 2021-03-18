package me.pumpkinbear111.bigredbutton.events;

import me.pumpkinbear111.bigredbutton.Bigredbutton;
import me.pumpkinbear111.bigredbutton.util.Lightning;
import me.pumpkinbear111.bigredbutton.util.RegistryHandler;
import net.minecraft.block.Block;
import net.minecraft.enchantment.ChannelingEnchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.Explosion;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Bigredbutton.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class events {

    @SubscribeEvent
    public static void onRightClick(final PlayerInteractEvent.RightClickBlock event) {

        int x = event.getPos().getX();
        int y = event.getPos().getY();
        int z = event.getPos().getZ();

        BlockPos blockPos = new BlockPos(x, y, z);
        Block block = event.getWorld().getBlockState(blockPos).getBlock();

        // Red Button
        if(block.equals(RegistryHandler.RED_BUTTON.get())) {

            System.out.println("Big Red Button Pressed");

            event.getWorld().explode(null, x - .5, y, z - .5, 15, Explosion.Mode.DESTROY);

            block = null;

            return;

        }

        // Yellow Button
        if(block.equals(RegistryHandler.YELLOW_BUTTON.get())) {

            System.out.println("Big Yellow Button Pressed");

            event.getWorld().explode(null, x - .5, y, z - .5, 17, Explosion.Mode.DESTROY);

            // Summon Lightning
            Lightning.summonLightning(blockPos.getX(), blockPos.getY(), blockPos.getZ(), event.getWorld());
            Lightning.summonLightning(blockPos.getX() + 2, blockPos.getY(), blockPos.getZ(), event.getWorld());
            Lightning.summonLightning(blockPos.getX() - 2, blockPos.getY(), blockPos.getZ(), event.getWorld());
            Lightning.summonLightning(blockPos.getX(), blockPos.getY(), blockPos.getZ() + 2, event.getWorld());
            Lightning.summonLightning(blockPos.getX(), blockPos.getY(), blockPos.getZ() - 2, event.getWorld());

            block = null;

            return;

        }

    }

}
