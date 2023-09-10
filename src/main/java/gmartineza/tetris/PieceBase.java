package gmartineza.tetris;

import java.util.List;
import java.util.ArrayList;

public class PieceBase implements IRotator {
    public String name;
    protected List<byte[][]> orientations;
    protected int currentOrientationIndex;

    public PieceBase(String name, List<byte[][]> orientations) {
        this.name = name;
        this.orientations = orientations;
        this.currentOrientationIndex = 0;
    }

    public PieceBase(String name, byte[][] orientation) {
        this.name = name;
        this.orientations = new ArrayList<>();
        this.orientations.add(orientation);
        this.currentOrientationIndex = 0;
    }

    public void rotateRight() {
        currentOrientationIndex = (currentOrientationIndex + 1) % orientations.size();
    }

    public void rotateLeft() {
        currentOrientationIndex = (currentOrientationIndex - 1 + orientations.size()) % orientations.size();
    }

    public byte[][] getCurrentOrientation() {
        return orientations.get(currentOrientationIndex);
    }

    public byte width(byte[][] piece) {
        return (byte) piece[0].length;
    }
}
