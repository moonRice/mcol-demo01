package tech.mcol.mod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import tech.mcol.mod.ExampleMod;

public class ModItems {
    public static final Item BALL = registeItem("ball", new Item(new FabricItemSettings().fireproof()));

    private static Item registeItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, name), item);
    }

    public static void registerModItem(){
        ExampleMod.LOGGER.info("registerModItem MOD_ID：" + ExampleMod.MOD_ID);
    }
}
