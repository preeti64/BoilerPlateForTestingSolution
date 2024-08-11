import com.problemSolving.ProblemSolvingInterview;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class ProblemSolvingInterviewTest {

    @Test
    public void getDivisorTest(){
        Assert.assertEquals(ProblemSolvingInterview.executeDivisor(2,20), List.of(16));
    }
}

