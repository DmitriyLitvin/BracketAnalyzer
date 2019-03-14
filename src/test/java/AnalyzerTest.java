import junit.framework.Assert;

import org.junit.Test;

public class AnalyzerTest {

    @Test
    public void analyzeTest1() {
        Assert.assertFalse(Analyzer.analyze("a(na(lyz)e"));
    }

    @Test
    public void analyzeTest2() {
        Assert.assertTrue(Analyzer.analyze("an((aly))ze"));
    }

    @Test
    public void analyzeTest3() {
        Assert.assertFalse(Analyzer.analyze("an)aly(ze"));
    }

    @Test
    public void analyzeTest4() {
        Assert.assertTrue(Analyzer.analyze("(a(n()())al)yze"));
    }

    @Test
    public void analyzeTest5() {
        Assert.assertFalse(Analyzer.analyze("a(n()al)yz)e"));
    }

    @Test
    public void analyzeTest6() {
        Assert.assertTrue(Analyzer.analyze("a(na)l(yz)e"));
    }

    @Test
    public void analyzeTest7() {
        Assert.assertFalse(Analyzer.analyze("an)al)y(z(e"));
    }
}
