package com.hillel.classwork.lesson14.lesson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ChessGame {

    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        List<ChessItem> chessItems = new ArrayList<>();

        String input;
        while (!(input = READER.readLine()).equals("stop")) {
            chessItems.add(createChessItem(input));
        }

        drawChessItem(chessItems);

        Drawable chessboard = new ChessBoard();
        draw(chessboard);

    }

    public static ChessItem createChessItem(String chessItemName) throws IOException {
        switch (chessItemName) {
            case "pawn":
                return new Pawn();
            case "king":
                return new King();
            case "queen":
                return new Queen();
            default:
                throw new IllegalArgumentException("Unknown chess item name" + chessItemName);
        }

    }

    private static void draw(Drawable drawable) {
        drawable.draw();
    }

    private static void drawChessItem(List<ChessItem> chessItems) {
        for (ChessItem chessItem : chessItems) {

            /*if (chessItem instanceof Drawable) {
                Drawable drawableChessItem = (Drawable) chessItem;
                drawableChessItem.draw();
            }*/

            draw(chessItem);
        }
    }
}
