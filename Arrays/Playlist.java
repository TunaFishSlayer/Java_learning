import java.util.Arrays;
import java.util.ArrayList;
class Playlist {
  public static void main(String[] args){
    ArrayList<String> favouriteSongs = new ArrayList<String>(10);
    favouriteSongs.add("K/DA - THE BADDEST");
    favouriteSongs.add("Lil Nas X - STAR WALKIN'");
    favouriteSongs.add("True Damage - GIANTS");
    favouriteSongs.add("I Really Want to Stay At Your House - Rosa Walton");
    favouriteSongs.add("Die For You");
    favouriteSongs.add("Legends Never Die");
    favouriteSongs.add("K/DA - VILLAIN");
    favouriteSongs.add("Ticking Away");
    favouriteSongs.add("GODS");
    favouriteSongs.add("RISE");
    System.out.println(favouriteSongs.get(0) + "\n" + favouriteSongs.get(1) + "\n" + favouriteSongs.get(2));
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("PARANOIA");
    desertIslandPlaylist.add("Post Malone, Swae Lee - Sunflower");
    desertIslandPlaylist.add("IDOL - Yoasobi");
    desertIslandPlaylist.add("Burn It All Down");
    desertIslandPlaylist.add("Bling-Bang-Bang-Born");
    System.out.println(desertIslandPlaylist); 
    desertIslandPlaylist.add(Arrays.asList(favouriteSongs));
    desertIslandPlaylist.size();
    
  }
}