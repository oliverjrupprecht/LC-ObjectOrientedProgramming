public class Map {
    private int height;
    private int width;
    private char[][] map;
    private final char EMPTY = '.';

    public Map() {
        this.height = 8;
        this.width = 8;
        this.map = new char[height][width];

        for (int x = 0; x < height; ++x) {
            for (int y = 0; y < width; ++y) {
                map[y][x] = EMPTY;
            }
        }
    }

    public void placeRoom(Position position, char symbol) {
        int x = position.x;
        int y = position.y;

        if (x >= 0 && x < height && y >= 0 && y < width) {
            map[x][y] = symbol;
        } else {
            System.out.println("Position is out of bounds!");
        }
    }

    public void display() {
        for (int x = 0; x < height; ++x) {
            for (int y = 0; y < width; ++y) {
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
    }


}
