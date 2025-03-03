package com.vu.mathutil.core;

import org.junit.jupiter.api.Test;

// IMPORT STATIC: HÀM STATIC KO CẦN CHẤM
// IMPORT STATIC LÀ CÁCH KHAI BÁO TRƯỚC TÊN CLASS CHỨA HÀM STATIC
// ĐỂ Ở DƯỚI MÌNH GỌI HÀM STATIC KO CẦN GIẤU CHẤM TÊN CLASS
// NẾU CÓ NHIỀU HÀM STATIC THÌ TA CHỈ CẦN IMPORT STATIC TENE CLASS .*
import static com.vu.mathutil.core.MathUtility.getFactorial;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    //CLASS NÀY SÀI BỘ THƯ VIỆN JUNIT, ĐƯỢC TẢI TRÊN MẠNG TỰ ĐỘNG BỞI MAVEN
    // BỘ THƯ VIEN NÀY DÙNG ĐỂ TEST TỰ DONG CAC HÀM CỦA CLASS CHÍNH
    // NÓ SẼ TỰ ĐONG CHẠY KHI ĐÓNG GÓI APP, ĐỂ CHECK XEM CÁC HÀM CÓ CHẠY ĐÚNG KO(SO SÁNH EXPECTED VÀ ACTUAL)
    // NẾU CÓ NHIỀU TEST CASE, THÌ NÓ SẼ GOM STATUS CỦA CASC TEST CASE LẠI THÀNH 2 MÀU XANH VÀ ĐỎ
    //  BỘ THƯ VIỆN NÀY GỌI LÀ FRAMEWORK,JUNIT TESTING FRAMEWORK

    //TEST CASE #1: VERIFY GETFACTORIAL WITH N = 0, EXPECTED RESULT 0! = 1
    @Test
    public void TestFactorialGivenRightArgumentReturnsWell() {
        int n = 0;
        long expectedResult = 1;
        long actualResult = getFactorial(n);
        assertEquals(expectedResult, actualResult);
        // SO SÁNH EXPECTED VÀ ACTUAL NHƯNG KO VIẾT SOUT
    }


    //TEST CASE #2: VERIFY GETFACTORIAL WITH N = 1, EXPECTED RESULT 1! = 1
    @Test
    public void TestFactorialGivenRightArgument1ReturnsWell() {
        assertEquals(1, getFactorial(1));
    }


    //TEST CASE #3: VERIFY GETFACTORIAL WITH N = 4, EXPECTED RESULT 4! = 24
    @Test
    public void TestFactorialGivenRightArgument4ReturnsWell() {
        assertEquals(24, getFactorial(4));
    }


    //TEST CASE #4: VERIFY GETFACTORIAL WITH N = 5, EXPECTED RESULT 5! = 120
    @Test
    public void TestFactorialGivenRightArgument5ReturnsWell() {
        assertEquals(120, getFactorial(5));
    }
}
