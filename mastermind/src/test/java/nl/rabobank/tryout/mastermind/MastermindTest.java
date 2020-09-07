package nl.rabobank.tryout.mastermind;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MastermindTest {
    @Test
    public void should_return_misplaced_pegs_and_correct_pegs_given_all_wrong_pegs() {
        List<Integer> expected = Arrays.asList(0, 0);

        // TODO: expected call somewhere here...

        List<Integer> result = Arrays.asList(1, 1);

        assertEquals(expected, result);
    }
}
