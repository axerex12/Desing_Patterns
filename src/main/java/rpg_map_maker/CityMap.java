import java.util.Random;

public class CityMap extends Map {
    private static final Tile[] CITY_TILES = { new RoadTile(), new ForestTile(), new BuildingTile() };
    private static final Random RANDOM = new Random();

    public CityMap(int width, int height) {
        super(width, height);
    }

    @Override
    public Tile createTile() {
        return CITY_TILES[RANDOM.nextInt(CITY_TILES.length)];
    }
}