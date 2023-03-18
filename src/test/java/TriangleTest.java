import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.text.ParseException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {
    Triangle triangle = new Triangle();

    @Test
    @DisplayName("输入错误")
    public void testInputError() {
        assertEquals("输入错误", triangle.classify(0, 1, 7));
        assertEquals("输入错误", triangle.classify(101, 10, 10));
        assertEquals("输入错误", triangle.classify(10, -1, 10));
        assertEquals("输入错误", triangle.classify(10, 101, 10));
        assertEquals("输入错误", triangle.classify(10, 10, -1));
        assertEquals("输入错误", triangle.classify(10, 10, 101));
    }

    @Test
    @DisplayName("非三角形")
    public void testNotTriangle() {
        assertEquals("非三角形", triangle.classify(1, 2, 3));
        assertEquals("非三角形", triangle.classify(3, 2, 1));
        assertEquals("非三角形", triangle.classify(2, 3, 1));
    }

    @Test
    @DisplayName("等边三角形")
    public void testEquilateralTriangle() {
        assertEquals("等边三角形", triangle.classify(1, 1, 1));
    }

    @Test
    @DisplayName("不等边三角形")
    public void testScaleneTriangle() {
        assertEquals("不等边三角形", triangle.classify(3, 4, 6));
        assertEquals("不等边三角形", triangle.classify(4, 3, 6));
        assertEquals("不等边三角形", triangle.classify(4, 6, 3));

    }

    @Test
    @DisplayName("等腰三角形")
    public void testIsoscelesTriangle() {
        // 测试等腰三角形的情况
        assertEquals("等腰三角形", triangle.classify(3, 3, 2));
        assertEquals("等腰三角形", triangle.classify(2, 3, 3));
        assertEquals("等腰三角形", triangle.classify(3, 2, 3));
    }

    @DisplayName(value = "三角形一般边界测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形一般边界测试用例.csv", numLinesToSkip = 1, encoding = "UTF-8")
    void fileTest(int a, int b, int c, String expected) throws ParseException {
        Triangle triangle = new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }

    @DisplayName(value="三角形健壮性最坏情况测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形健壮性最坏情况测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest1(int a, int b,int c,String expected) throws ParseException {
        Triangle triangle=new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }
    @DisplayName(value="三角形健壮测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形健壮测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest2(int a, int b,int c,String expected) throws ParseException {
        Triangle triangle=new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }
    /*
    @DisplayName(value="三角形弱一般等价类测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形弱一般等价类测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest3(int a, int b,int c,String expected) throws ParseException {
        Triangle triangle=new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }*/
    @DisplayName(value="三角形最坏情况测试用例")
    @ParameterizedTest
    @CsvFileSource(resources = "/三角形最坏情况测试用例.csv",numLinesToSkip =1,encoding = "UTF-8")
    void fileTest4(int a, int b,int c,String expected) throws ParseException {
        Triangle triangle=new Triangle();
        String type = triangle.classify(a, b, c);
        assertEquals(expected, type);
    }

}

