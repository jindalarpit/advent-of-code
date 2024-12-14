package com.adventofcode.solver;

import com.adventofcode.annotations.AdventOfCodeSolutionResolver;
import com.adventofcode.input.InputRetriever;
import com.adventofcode.result.Result;
import com.adventofcode.solution.Solution;
import lombok.RequiredArgsConstructor;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class Solver {

    public <T> Result<T> solveAll(final Solution<T> solution) {
        AdventOfCodeSolutionResolver.SolutionInfo solutionInfo = AdventOfCodeSolutionResolver.resolve(solution);
        Stream<String> inputStream = InputRetriever.retrieveInputStream(solutionInfo.getYear(), solutionInfo.getDay(), getClass());

        LocalDateTime start = LocalDateTime.now();

        T resultValue = solution.solve(inputStream);

        LocalDateTime finish = LocalDateTime.now();
        Duration duration = Duration.between(start, finish);

        return new Result<>(resultValue, solutionInfo, duration);
    }
}
