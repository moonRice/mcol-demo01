package tech.mcol.mod.gen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import tech.mcol.mod.item.ModItemGroup;
import tech.mcol.mod.item.ModItems;

public class ModLangPackGenerator extends FabricLanguageProvider {
    public ModLangPackGenerator(FabricDataOutput dataOutput) {
//        super(dataOutput, "en_us");
        super(dataOutput, "zh_cn");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.BALL, "基尼泰美");
        translationBuilder.add(ModItemGroup.GROUPS_TAB_NAME, "鸡窝");
    }
}
