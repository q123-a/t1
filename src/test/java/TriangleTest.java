import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
/*
class TriangleTest {
    @Test
    @DisplayName("输入错误")
    void parameters_error_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(0, 4, 5);
        assertEquals("输入错误", type);
    }
    @Test
    @DisplayName("不等边三角形")
    void scalene_test() {
        Triangle triangle = new Triangle();
        String type = triangle.classify(3, 4, 6);
        assertEquals("不等边三角形", type);
    }
}*/
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
        assertEquals("非三角形", triangle.classify(1, 2 ,3));
        assertEquals("非三角形", triangle.classify(3 ,2 ,1));
        assertEquals("非三角形", triangle.classify(2 ,3 ,1));
    }

    @Test
    @DisplayName("等边三角形")
    public void testEquilateralTriangle() {
        assertEquals("等边三角形", triangle.classify(1 ,1 ,1));
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
        assertEquals("等腰三角形", triangle.classify(3 ,3 ,2));
        assertEquals("等腰三角形", triangle.classify(2 ,3 ,3));
        assertEquals("等腰三角形", triangle.classify(3 ,2 ,3));
    }
}

