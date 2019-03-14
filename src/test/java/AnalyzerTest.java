import junit.framework.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnalyzerTest {

    @Test
    public void analyzeTest1() {
        Assert.assertEquals(false,Analyzer.analyze("a(na(lyz)e"));
    }

    @Test
    public void analyzeTest2() {
        Assert.assertEquals(true,Analyzer.analyze("an((aly))ze"));
    }

    @Test
    public void analyzeTest3() {
        Assert.assertEquals(false,Analyzer.analyze("an)aly(ze"));
    }

    @Test
    public void analyzeTest4() {
        Assert.assertEquals(true,Analyzer.analyze("(a(n()())al)yze"));
    }

    @Test
    public void analyzeTest5() {
        Assert.assertEquals(false,Analyzer.analyze("a(n()al)yz)e"));
    }

    @Test
    public void analyzeTest6() {
        Assert.assertEquals(true,Analyzer.analyze("a(na)l(yz)e"));
    }

    @Test
    public void analyzeTest7() {
        Assert.assertEquals(false,Analyzer.analyze("an)al)y(z(e"));
    }
}
