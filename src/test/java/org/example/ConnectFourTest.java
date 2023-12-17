package org.example;

//import org.junit.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConnectFourTest {

    @Test
    public void testInitialization() {
        ConnectFour connectFour = new ConnectFour();

        assertEquals(6, connectFour.board.length); // Check number of rows
        assertEquals(7, connectFour.board[0].length); // Check number of columns

        for (int row = 0; row < ConnectFour.ROWS; row++) {
            for (int col = 0; col < ConnectFour.COLUMNS; col++) {
                assertEquals('-', connectFour.board[row][col]);
            }
        }
    }
}