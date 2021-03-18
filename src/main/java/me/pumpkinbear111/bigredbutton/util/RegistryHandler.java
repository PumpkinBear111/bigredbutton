package me.pumpkinbear111.bigredbutton.util;

import me.pumpkinbear111.bigredbutton.blocks.BlockItemBase;
import me.pumpkinbear111.bigredbutton.blocks.green_button;
import me.pumpkinbear111.bigredbutton.blocks.red_button;
import me.pumpkinbear111.bigredbutton.blocks.yellow_button;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static me.pumpkinbear111.bigredbutton.Bigredbutton.MOD_ID;

public class RegistryHandler {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MOD_ID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MOD_ID);

    // Blocks

    public static final RegistryObject<Block> RED_BUTTON = BLOCKS.register("red_button", red_button::new);
    public static final RegistryObject<Block> YELLOW_BUTTON = BLOCKS.register("yellow_button", yellow_button::new);
    public static final RegistryObject<Block> GREEN_BUTTON = BLOCKS.register("green_button", green_button::new);

    // Block Items
    public static final RegistryObject<Item> RED_BUTTON_ITEM = ITEMS.register("red_button_item", () -> new BlockItemBase(RED_BUTTON.get()));
    public static final RegistryObject<Item> YELLOW_BUTTON_ITEM = ITEMS.register("yellow_button_item", () -> new BlockItemBase(YELLOW_BUTTON.get()));
    public static final RegistryObject<Item> GREEN_BUTTON_ITEM = ITEMS.register("green_button_item", () -> new BlockItemBase(GREEN_BUTTON.get()));

    // Items

    public static void init() {

        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());

    }

}
