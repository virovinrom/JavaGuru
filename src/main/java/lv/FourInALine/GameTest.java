package lv.fourinaline;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static lv.fourinaline.Mark.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class GameTest {
    private Field field;
    private ComputerPlayer computerPlayer;
    private UserPlayer userPlayer;

    @BeforeEach
    public void init() {
        field = new Field();
        computerPlayer = new ComputerPlayer();
        userPlayer = new UserPlayer();
    }

    @Test
    public void setMoveUserTest() {
        List<Integer> list = Arrays.asList(1, 2);
        int index = userPlayer.getMoveFromPlayer(list);
        assertEquals(1, index);
    }

    @Test
    public void getFreeIndexTest() {
        Mark[][] markPlace = field.getField();
        markPlace[0][3] = X;
        markPlace[0][2] = X;
        List<Integer> list = field.getFreeIndex();
        assertEquals(Arrays.asList(0, 1, 4, 5, 6), list);
    }

    @Test
    public void setMoveTest() {
        List<Integer> list = Arrays.asList(1, 2);
        int index = computerPlayer.getMoveFromPlayer(list);
        assertEquals(1, index);
    }
}
