package gmartineza.tetris;

import java.util.List;
import java.util.ArrayList;

public class PieceBase implements IRotator {
    protected List<byte[][]> orientations;
    protected int currentOrientationIndex;

    public PieceBase(List<byte[][]> orientations) {
        this.orientations = orientations;
        this.currentOrientationIndex = 0; // Initialize with the first orientation
    }

    public PieceBase(byte[][] orientation) {
        this.orientations = new ArrayList<>();
        this.orientations.add(orientation);
        this.currentOrientationIndex = 0; // Initialize with the only orientation
    }

    public void rotateClockwise() {
        currentOrientationIndex = (currentOrientationIndex + 1) % orientations.size();
    }

    public void rotateCounterclockwise() {
        currentOrientationIndex = (currentOrientationIndex - 1 + orientations.size()) % orientations.size();
    }

    public byte[][] getCurrentOrientation() {
        return orientations.get(currentOrientationIndex);
    }

    public byte width(byte[][] piece) {
        return (byte) piece[0].length;
    }
}
