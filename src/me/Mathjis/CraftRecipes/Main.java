package me.Mathjis.CraftRecipes;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main
  extends JavaPlugin
{
  public void onEnable()
  {
    getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "-------------------------");
    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "   CraftRecipes Enabled!   ");
    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "    By: Mathijs13    ");
    getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "-------------------------");
    hrecipe();
  }
  
  public void onDisable()
  {
    getServer().getConsoleSender().sendMessage("");
    getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "-------------------------");
    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "  CraftRecipes Disabled!   ");
    getServer().getConsoleSender().sendMessage(ChatColor.GOLD + "    By: Mathijs13    ");
    getServer().getConsoleSender().sendMessage(ChatColor.GREEN + "--------------------------");
    getServer().getConsoleSender().sendMessage("");
  }
  
  private void hrecipe()
  {
    ItemStack itemstack = new ItemStack(Material.ENDER_PEARL, 2);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!#!", 
      "#@#", 
      "!#!" });
    hrecipe.setIngredient('@', Material.BLAZE_ROD);
    hrecipe.setIngredient('!', Material.BLAZE_POWDER);
    hrecipe.setIngredient('#', Material.DIAMOND);
    Bukkit.getServer().addRecipe(hrecipe);
  }
  
  public Main()
  {
    ItemStack itemstack = new ItemStack(Material.BONE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!@!", 
      "!#!", 
      "!@!" });
    hrecipe.setIngredient('@', Material.SUGAR);
    hrecipe.setIngredient('#', Material.STICK);
    Bukkit.getServer().addRecipe(hrecipe);
  }
{
    ItemStack itemstack = new ItemStack(Material.POTION, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!!!", 
      "!#!", 
      "!!!" });
    hrecipe.setIngredient('#', Material.WATER_BUCKET);
    hrecipe.setIngredient('!', Material.SAND);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.BEDROCK, 16);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "@#@", 
      "#!#", 
      "@#@" });
    hrecipe.setIngredient('@', Material.ENDER_STONE);
    hrecipe.setIngredient('#', Material.OBSIDIAN);
    hrecipe.setIngredient('!', Material.DIAMOND_BLOCK);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.PACKED_ICE, 8);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "@@@", 
      "@!@", 
      "@@@" });
    hrecipe.setIngredient('@', Material.ICE);
    hrecipe.setIngredient('!', Material.FEATHER);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.BLAZE_ROD, 3);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!#!", 
      "!#!", 
      "!#!" });
    hrecipe.setIngredient('#', Material.BLAZE_POWDER);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.NETHER_STAR, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!@!", 
      "@#@", 
      "!@!" });
    hrecipe.setIngredient('#', Material.ENCHANTMENT_TABLE);
    hrecipe.setIngredient('!', Material.ENDER_PEARL);
    hrecipe.setIngredient('@', Material.DIAMOND_BLOCK);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.SADDLE, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "@@@", 
      "@#@", 
      "!|!" });
    hrecipe.setIngredient('#', Material.GOLD_INGOT);
    hrecipe.setIngredient('!', Material.IRON_INGOT);
    hrecipe.setIngredient('@', Material.LEATHER);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.SPONGE, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "@@@", 
      "@#@", 
      "@@@" });
    hrecipe.setIngredient('#', Material.WATER_BUCKET);
    hrecipe.setIngredient('@', Material.WOOL);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.WEB, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STRING);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.GOLD_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.GOLD_INGOT);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.IRON_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.IRON_INGOT);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.COAL_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.COAL);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.REDSTONE_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.REDSTONE);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.EMERALD_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.EMERALD);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.DIAMOND_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.DIAMOND);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.QUARTZ_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.QUARTZ);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.LAPIS_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.STONE);
    hrecipe.setIngredient('@', Material.LAPIS_BLOCK);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.QUARTZ_ORE, 5);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@#@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.NETHERRACK);
    hrecipe.setIngredient('@', Material.QUARTZ);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.DRAGON_EGG, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "#@#", 
      "@!@", 
      "#@#" });
    hrecipe.setIngredient('#', Material.OBSIDIAN);
    hrecipe.setIngredient('@', Material.ENDER_STONE);
    hrecipe.setIngredient('!', Material.ENDER_PEARL);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.GHAST_TEAR, 2);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "###", 
      "#@#", 
      "###" });
    hrecipe.setIngredient('#', Material.GLASS);
    hrecipe.setIngredient('@', Material.BLAZE_ROD);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.NAME_TAG, 3);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!!@", 
      "!#!", 
      "#!!" });
    hrecipe.setIngredient('#', Material.PAPER);
    hrecipe.setIngredient('@', Material.IRON_INGOT);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.IRON_BARDING, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!!@", 
      "@#@", 
      "@@@" });
    hrecipe.setIngredient('#', Material.WOOL);
    hrecipe.setIngredient('@', Material.IRON_INGOT);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.GOLD_BARDING, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!!@", 
      "@#@", 
      "@@@" });
    hrecipe.setIngredient('#', Material.WOOL);
    hrecipe.setIngredient('@', Material.GOLD_INGOT);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.DIAMOND_BARDING, 1);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!!@", 
      "@#@", 
      "@@@" });
    hrecipe.setIngredient('#', Material.WOOL);
    hrecipe.setIngredient('@', Material.DIAMOND);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.HUGE_MUSHROOM_1, 3);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "###", 
      "#@#", 
      "@@@" });
    hrecipe.setIngredient('#', Material.BROWN_MUSHROOM);
    hrecipe.setIngredient('@', Material.STICK);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.HUGE_MUSHROOM_2, 3);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "###", 
      "#@#", 
      "@@@" });
    hrecipe.setIngredient('#', Material.RED_MUSHROOM);
    hrecipe.setIngredient('@', Material.STICK);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.MYCEL, 6);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "###", 
      "@@@", 
      "!!!" });
    hrecipe.setIngredient('#', Material.RED_MUSHROOM);
    hrecipe.setIngredient('@', Material.DIRT);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.VINE, 6);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "@#@", 
      "#!#", 
      "@#@" });
    hrecipe.setIngredient('#', Material.CACTUS);
    hrecipe.setIngredient('@', Material.SUGAR_CANE);
    hrecipe.setIngredient('!', Material.WATER_LILY);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.WATER_LILY, 6);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "@#@", 
      "#!#", 
      "@#@" });
    hrecipe.setIngredient('#', Material.LEAVES);
    hrecipe.setIngredient('@', Material.SLIME_BALL);
    hrecipe.setIngredient('!', Material.WATER_BUCKET);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.EXP_BOTTLE, 6);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "@#@", 
      "#!#", 
      "@#@" });
    hrecipe.setIngredient('#', Material.EMERALD);
    hrecipe.setIngredient('@', Material.GLASS_BOTTLE);
    hrecipe.setIngredient('!', Material.ENDER_PEARL);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.SLIME_BALL, 2);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!!!", 
      "##!", 
      "##!" });
    hrecipe.setIngredient('#', Material.SEEDS);
    Bukkit.getServer().addRecipe(hrecipe);
}
{
    ItemStack itemstack = new ItemStack(Material.SUGAR_CANE, 3);
    ShapedRecipe hrecipe = new ShapedRecipe(itemstack);
    hrecipe.shape(new String[] {
      "!#!", 
      "!#!", 
      "!#!" });
    hrecipe.setIngredient('#', Material.SUGAR);
    Bukkit.getServer().addRecipe(hrecipe);
  }
}
