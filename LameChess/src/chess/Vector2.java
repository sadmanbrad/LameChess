package chess;

/**
 * Created by Bardia
 * on 10/11/2017.
 */
public class Vector2 {

    public int x;
    public int y;

    public Vector2() {
        this.x = 0;
        this.y = 0;
    }

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Vector2(String address) {
        this.x = address.charAt(0) - 'a';
        this.y = address.charAt(1) - '0';
    }

    public Vector2 add(Vector2 other) {
        return new Vector2(this.x + other.x, this.y + other.y);
    }

    public Vector2 subtract(Vector2 other) {
        return new Vector2(this.x - other.x, this.y - other.y);
    }

    public String toString() {
        return "(" + (char)('a' + x) + (char)('0' + y) + ")";
    }

}
