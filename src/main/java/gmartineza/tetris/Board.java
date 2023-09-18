package gmartineza.tetris;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Board {
    private byte[][] board;
    private final byte width = 10;
    private final byte height = 20;
    private Random random = new Random();
    private int randomCol;
    private int count= 0;
    public List<PieceBase> pieceList = new ArrayList<>();

    public Board() {
        board = new byte[height][width];
        for (byte row = 0; row < height; row++) {
            for (byte col = 0; col < width; col++) {
                board[row][col] = 0;
            }
        }
    }

    public Board(byte[][] initialMatrix) {
        if (initialMatrix.length != height || initialMatrix[0].length != width) {
            throw new IllegalArgumentException("Initial matrix dimensions must match board dimensions.");
        }
        board = initialMatrix;
    }

    public byte[][] getMatrix(){
        return board;
    }

    public byte getWidth(){
        return width;
    }

    public byte getCell(int row, int col) {
        return board[row][col];
    }
    
    public int getRandomCol(){
        return randomCol;
    }

    public void setRandomCol(int value){
        randomCol = value;
    }
    
    public int getCount(){
        return count;
    }

    public void setCount(int value){
        count = value;
    }
    
    private boolean canPlacePiece(PieceBase piece, int row, int col) {
        byte[][] orientation = piece.getCurrentOrientation();
        int pieceHeight = piece.getHeight();
        int pieceWidth = piece.getWidth();

        // Verificar si la pieza cabe en la matriz en la posición especificada
        if (row + pieceHeight > height || col + pieceWidth > width) {
            return false;
        }

        // Verificar si las celdas donde se va a insertar la pieza están vacías
        for (int i = 0; i < pieceHeight; i++) {
            for (int j = 0; j < pieceWidth; j++) {
                if (orientation[i][j] != 0 && board[row + i][col + j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public boolean getCanPlacePiece(PieceBase piece, int row, int col) {
        return canPlacePiece(piece, row, col);
    }

    public int placePiece(PieceBase piece, int row, int col, boolean place) {
        byte[][] orientation = piece.getCurrentOrientation();
        int pieceHeight = piece.getHeight();
        int pieceWidth = piece.getWidth();

        for (int i = 0; i < pieceHeight; i++) {
            for (int j = 0; j < pieceWidth; j++) {
                if (orientation[i][j] != 0) {
                    if (place) {
                        board[row + i][col + j] = orientation[i][j];
                    } else {
                        board[row + i][col + j] = 0;
                    }
                }
            }
        }

        return row; // retornar dónde se comenzó a dibujar la pieza para referenciar en el siguiente tick
    }

    private PieceBase getRandomPieceType() {
        int pieceTypes = 7;
        int randomValue = random.nextInt(pieceTypes);
        switch (randomValue) {
            case 0:
                return new SquarePiece();
            case 1:
                return new StickPiece();
            case 2:
                return new TPiece();
            case 3:
                return new LPieceLeft();
            case 4:
                return new LPieceRight();
            case 5:
                return new DogPieceLeft();
            case 6:
                return new DogPieceRight();
            default:
                throw new IllegalStateException("getRandomPieceType(): Invalid random value for piece type");
        }
    }

    private PieceBase getRandomPieceType(int chosenPieceType) {
        switch (chosenPieceType) {
            case 0:
                return new SquarePiece();
            case 1:
                return new StickPiece();
            case 2:
                return new TPiece();
            case 3:
                return new LPieceLeft();
            case 4:
                return new LPieceRight();
            case 5:
                return new DogPieceLeft();
            case 6:
                return new DogPieceRight();
            default:
                throw new IllegalStateException("getRandomPieceType(): chosenPieceType is outside allowed range.");
        }
    }
    

    public PieceBase spawnNewPiece() {
        PieceBase randomPieceType = getRandomPieceType();
        for (int i = 0; i < random.nextInt(4) + 1; i++) {
            randomPieceType.rotateLeft();
        }
        int maxColumn = width - randomPieceType.getWidth();
        setRandomCol(random.nextInt(maxColumn + 1));
        if (canPlacePiece(randomPieceType, 0, getRandomCol())) {
            placePiece(randomPieceType, 0, getRandomCol(), true);
        }
        else {
            throw new IllegalStateException("spawnNewPiece: Cannot place piece.");
        }

        

        return randomPieceType;
    }   

    public  void addSpawnNewPiece() {
        PieceBase randomPieceType = getRandomPieceType();
        for (int i = 0; i < random.nextInt(4) + 1; i++) {
            randomPieceType.rotateLeft();
        }
        
        pieceList.add(randomPieceType);        

    }

    public PieceBase spawnNewPiece(int chosenPieceType, int chosenRotation, int chosenCol) {
        PieceBase randomPieceType = getRandomPieceType(chosenPieceType);
        for (int i = 0; i < chosenRotation; i++) {
            randomPieceType.rotateLeft();
        }
        int maxColumn = width - randomPieceType.getWidth();
        if (chosenCol > maxColumn){
            throw new IllegalStateException("spawnNewPiece(): chosenCol is outside allowed range.");
        }
        else if (canPlacePiece(randomPieceType, 0, chosenCol)) {
            placePiece(randomPieceType, 0, chosenCol, true);
        }
        else {
            throw new IllegalStateException("spawnNewPiece: Cannot place piece.");
        }

        return randomPieceType;
    }

    public void movePiece(PieceBase piece, int row) {
        if (!(piece.getHeight() + row >= height)){
            placePiece(piece, row, getRandomCol(), false);
            placePiece(piece, row + 1, getRandomCol(), true);
        }
    }

    public boolean isSingleLine(int row) {
        for (int col = 0; col < getWidth(); col++) {
            if (board[row][col] != 1){
                return false;
            }
        }
        return true;
    }

    public void clearAndShiftRow(int rowIndex) {
        if (rowIndex < 0 || rowIndex >= height) {
            throw new IllegalArgumentException("clearAndShiftRow: Invalid rowIndex");
        }
        if (isSingleLine(rowIndex)) {
            for (int col = 0; col < getWidth(); col++) {
                board[rowIndex][col] = 0;
            }

            for (int row = rowIndex; row > 0; row--) {
                for (int col = 0; col < getWidth(); col++) {
                    board[row][col] = board[row - 1][col];
                }
            }
            setCount(getCount() + 1);
        }
    }

    public int lineCount() {
        for (int row = 0; row < height; row++) {
        clearAndShiftRow(row);
    }
    return getCount();
    }   
}