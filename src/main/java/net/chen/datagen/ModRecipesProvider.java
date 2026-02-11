package net.chen.datagen;

import net.chen.LegacyWorld;
import net.chen.blocks.ModBlock;
import net.chen.items.ModItems;
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
    public static List RAW_IRON = List.of(ModItems.RAW_IRON);
    public static List RAW_LEAD = List.of(ModItems.RAW_LEAD);
    public static List RAW_SILVER = List.of(ModItems.RAW_SILVER);
    public static List RAW_TUNGSTEN = List.of(ModItems.RAW_TUNGSTEN);
    public static List RAW_COBALT = List.of(ModItems.RAW_COBALT);

    @Override
    public void generate(RecipeExporter exporter) {
        offerSmelting(exporter, RAW_IRON, RecipeCategory.MISC, ModItems.IRON_INGOT, 0.7F, 200,"iron_ore");
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_INGOT,1)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.IRON_STONE)
                .criterion("has_iron_stone", RecipeProvider.conditionsFromItem(ModItems.IRON_STONE))
                .offerTo(exporter, Identifier.of(LegacyWorld.MOD_ID,"iron_ingot_from_iron_stone"));
        offerReversibleCompactingRecipes(exporter,RecipeCategory.MISC, ModItems.NO_SMOKE_COAL,RecipeCategory.MISC, ModBlock.NO_SMOKE_COAL_ORE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.IRON_SWORD,1)
                .pattern("#")
                .pattern("#")
                .pattern("s")
                .input('#', ModItems.IRON_INGOT)
                .input('s', Items.STICK)
                .criterion("has_iron_ingot", RecipeProvider.conditionsFromItem(ModItems.IRON_INGOT))
                .offerTo(exporter, Identifier.of(LegacyWorld.MOD_ID,"iron_sword"));
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.IRON_INGOT, ModItems.IRON_STONE);
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.ZINC_INGOT, ModItems.IRON_STONE);
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.COPPER_INGOT, ModItems.COPPER_STONE);
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.THICK_STICK, ModItems.BROKEN_STICK);
        offerSmelting(exporter, RAW_LEAD, RecipeCategory.MISC, ModItems.LEAD_INGOT, 0.7F, 200,"lead_ore");
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.LEAD_INGOT, ModItems.LEAD_STONE);
        offerSmelting(exporter, RAW_SILVER, RecipeCategory.MISC, ModItems.SILVER_INGOT, 0.8F, 200,"silver_ore");
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.SILVER_INGOT, ModItems.SILVER_STONE);
        offerSmelting(exporter, RAW_TUNGSTEN, RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, 1.0F, 250,"tungsten_ore");
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.TUNGSTEN_INGOT, ModItems.TUNGSTEN_STONE);
        offerSmelting(exporter, RAW_COBALT, RecipeCategory.MISC, ModItems.COBALT_INGOT, 0.8F, 200,"cobalt_ore");
        offer2x2CompactingRecipe(exporter,RecipeCategory.MISC, ModItems.COBALT_INGOT, ModItems.COBALT_STONE);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ZINC_INGOT,1)
                .pattern("#")
                .pattern("@")
                .input('#', Items.STONE)
                .input('@', Items.STICK)
                .criterion("has_iron_ingot", RecipeProvider.conditionsFromItem(ModItems.ZINC_INGOT))
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