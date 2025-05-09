package net.chen.datagen;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.items.ModItem;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.CampfireCookingRecipe;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends FabricRecipeProvider {
    public ModRecipesProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
    public static List RAW_IRON = List.of(ModItem.RAW_IRON);

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RAW_IRON, RecipeCategory.MISC, ModItem.IRON_INGOT, 0.7F, 200,"iron_ore");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItem.IRON_INGOT,1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItem.IRON_STONE)
                .criterion("has_iron_stone", RecipeProvider.conditionsFromItem(ModItem.IRON_STONE))
                .offerTo(exporter, Identifier.of(LegacyWorld.MOD_ID,"iron_ingot_from_iron_stone"));
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC,ModItem.NO_SMOKE_COAL,RecipeCategory.MISC, ModBlock.NO_SMOKE_COAL_ORE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItem.IRON_SWORD,1)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .input('#', ModItem.IRON_INGOT)
                .input('s', Items.STICK)
                .criterion("has_iron_ingot", RecipeProvider.conditionsFromItem(ModItem.IRON_INGOT))
                .offerTo(exporter, Identifier.of(LegacyWorld.MOD_ID,"iron_sword"));
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC,ModItem.IRON_INGOT,ModItem.IRON_STONE);
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC,ModItem.ZINC_INGOT,ModItem.IRON_STONE);
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC,ModItem.COPPER_INGOT,ModItem.COPPER_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItem.ZINC_INGOT,1)
                .pattern("#")
                .pattern("@")
                .input('#', Items.STONE)
                .input('@', Items.STICK)
                .criterion("has_iron_ingot", RecipeProvider.conditionsFromItem(ModItem.ZINC_INGOT))
                .offerTo(exporter, Identifier.of(LegacyWorld.MOD_ID,"iron_ingot_from_stone"));
    }

    /**     调用RecipeProvider的offerMultipleOptions方法，用于生成篝火烹饪的配方
     参数解释：
     @param  exporter - 配方导出器，用于导出配方
     RecipeSerializer.CAMPFIRE_COOKING - 篝火烹饪配方的序列化器
     CampfireCookingRecipe::new - 篝火烹饪配方类的构造函数引用，用于创建新的篝火烹饪配方实例
     @param inputs - 输入物品列表，表示篝火烹饪所需的材料
     @param category - 配方分类，表示该配方属于哪个分类
     @param output - 输出物品，表示篝火烹饪的成果
     @param experience - 烹饪经验值，表示完成该配方后获得的经验
     @param cookingTime - 烹饪时间，表示完成该配方所需的时间
     @param group - 配方组，用于将相似的配方分组
   "_from_campfire_cooking" - 后缀字符串，用于标识该配方是通过篝火烹饪生成的
   **/
public static void offerCampfireCooking(RecipeExporter exporter, List<ItemConvertible> inputs, RecipeCategory category, ItemConvertible output, float experience, int cookingTime, String group) {

    RecipeProvider.offerMultipleOptions(exporter, RecipeSerializer.CAMPFIRE_COOKING, CampfireCookingRecipe::new,
                inputs, category, output, experience, cookingTime, group, "_from_campfire_cooking");
}
}