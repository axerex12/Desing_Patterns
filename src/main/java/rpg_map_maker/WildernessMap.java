import java.util.Random;

public class WildernessMap extends Map {
    private static final Tile[] WILDERNESS_TILES = { new SwampTile(), new WaterTile(), new ForestTile() };
    private static final Random RANDOM = new Random();

    public WildernessMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        return WILDERNESS_TILES[RANDOM.nextInt(WILDERNESS_TILES.length)];
    }
}