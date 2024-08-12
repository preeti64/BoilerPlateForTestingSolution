import com.problemSolving.ProblemSolvingInterview;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProblemSolvingInterviewTest {

    @Test
    public void testMethod(){
        Assert.assertEquals(ProblemSolvingInterview.executeMethod(), "Hello World");
    }
}

