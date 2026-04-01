package solver;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import sudoku.model.models.SudokuBoard;
import sudoku.model.solver.BacktrackingSudokuSolver;

public class BacktrackingSudokuSolverTest {
    @Test
    void testSolve() {
        BacktrackingSudokuSolver solver = new BacktrackingSudokuSolver();
        SudokuBoard sudokuBoard = new SudokuBoard(solver);

        solver.solve(sudokuBoard);

        for (int y = 0; y < SudokuBoard.BOARD_SIZE; y++) {
            for (int x = 0; x < SudokuBoard.BOARD_SIZE; x++) {
                int cellValue = sudokuBoard.getField(x, y).getValue();
                assertTrue(cellValue >= 1 && cellValue <= 9);
            }
        }

        assertTrue(sudokuBoard.isValidSudoku());
    }
}
