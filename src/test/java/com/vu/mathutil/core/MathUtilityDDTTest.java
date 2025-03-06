package com.vu.mathutil.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.vu.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityDDTTest {

    // CHUẨN BỊ BỘ DATA, CÁC CẶP DATA X! KÌ VỌNG BẰNG MAASY
    // CHÍNH LÀ MẢNG 2 CHIỀU
    // HÀM NÀY PHẢI LÀ HÀM PUBLIC STATIC ĐỂ CÁC @TEST VÀO MÒ VÀO LAY DATA ĐỂ TEST RUN
    public static Object[][] initData() {
        return new Object[][] {
                { 0, 1 },
                { 1 , 1 },
                { 2 , 2 },
                { 3 , 6 },
                { 4 , 24 },
                { 5 , 120 },
                { 6 , 720 },
        };
    }

    @ParameterizedTest
    @MethodSource("initData") // DDT - Data Driven Testing
    public void TestFactorialGivenRightArgument5ReturnsWell(int n, long expectedResult) { // THỨ TỰ PHẢI GIỐNG CÁI MẢNG TRÊN
        assertEquals(expectedResult, getFactorial(n));
    }
}