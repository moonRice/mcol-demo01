package tech.mcol.mod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import tech.mcol.mod.ExampleMod;

public class ModItemGroup {
    public static final String GROUPS_TAB_NAME = "iKun.ball";
    public static final ItemGroup BALL_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            new Identifier(ExampleMod.MOD_ID, "ball"),
            FabricItemGroup.builder().displayName(Text.translatable(GROUPS_TAB_NAME))
                    .icon(() -> new ItemStack(ModItems.BALL))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.BALL);
                    }).build());

    public static void registerItemGroup(){
        ExampleMod.LOGGER.info("registerItemGroup  MOD_ID：" + ExampleMod.MOD_ID);
    }
}
