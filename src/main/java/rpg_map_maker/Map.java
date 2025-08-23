public abstract class Map {
    protected Tile[][] tiles;

    public Map(int width, int height) {
        tiles = new Tile[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[y][x] = createTile();
            }
        }
    }

    public abstract Tile createTile();

    public void display() {
        for (Tile[] row : tiles) {
            for (Tile tile : row) {
                System.out.print(tile.getCharacter() + " ");
            }
            System.out.println();
        }
    }
}
