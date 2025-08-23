public class Game {
    public static void main(String[] args) {
        Game game = new Game();

        System.out.println("City Map:");
        Map cityMap = game.createMap("City", 7, 7);
        cityMap.display();

        System.out.println("\nWilderness Map:");
        Map wildernessMap = game.createMap("Wilderness", 7, 7);
        wildernessMap.display();
    }

    public Map createMap(String type, int width, int height) {
        if (type.equalsIgnoreCase("City")) {
            return new CityMap(width, height);
        } else if (type.equalsIgnoreCase("Wilderness")) {
            return new WildernessMap(width, height);
        } else {
            throw new IllegalArgumentException("Unknown map type: " + type);
        }
    }
}