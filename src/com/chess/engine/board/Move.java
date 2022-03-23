package com.chess.engine.board;

import com.chess.engine.pieces.Piece;

public abstract class Move {

    final Board board;
    final Piece movedPiece;
    final int destinationCoordination;

    private Move(final Board board,
         final Piece movedPiece,
         final int destinationCoordination) {
        this.board = board;
        this.movedPiece = movedPiece;
        this.destinationCoordination = destinationCoordination;
    }

    public static final class MajorMove extends Move {

        public MajorMove(final Board board,
                         final Piece movedPiece,
                         final int destinationCoordination) {
            super(board, movedPiece, destinationCoordination);
        }
    }

    public static final class AttackMove extends Move {

        final Piece attackedPiece;

        public AttackMove(final Board board,
                          final Piece movedPiece,
                          final int destinationCoordination,
                          final Piece attackedPiece) {
            super(board, movedPiece, destinationCoordination);
            this.attackedPiece = attackedPiece;
        }
    }

}
