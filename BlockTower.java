public class BlockTower {
  public static void main(String[] args) {
    int numBlocks = 1;
    while (numBlocks <= 10) {
      System.out.println("Block added! Tower is now " + numBlocks + " blocks tall!");
      numBlocks++;  // Stack another block!
    }
    System.out.println("Whoa! The tower is super tall now!");
  }
}
