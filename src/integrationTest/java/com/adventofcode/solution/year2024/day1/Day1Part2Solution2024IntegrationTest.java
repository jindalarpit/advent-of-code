package com.adventofcode.solution.year2024.day1;

import com.adventofcode.BaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Day 1 Part 2")
class Day1Part2Solution2024IntegrationTest extends BaseTest<Integer> {

    @Test
    @DisplayName("Given test input: should return 23117829")
    void givenTestInput_ShouldReturn0() {
        Day1Part2Solution2024 solution = new Day1Part2Solution2024();
        assertSolutionIsCorrect(solution, 23117829);
    }

}