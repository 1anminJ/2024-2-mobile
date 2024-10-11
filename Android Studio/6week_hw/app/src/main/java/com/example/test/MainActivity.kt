package com.example.test

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // p.122
//        val eraOfRyu = 2.32
//        val eraOfDegrom = 2.43
//
//        val era = if (eraOfRyu < eraOfDegrom) {
//            Log.d("MLB_Result", "2019 류현진이 디그롬을 이겼습니다.")
//            eraOfRyu
//        } else {
//            Log.d("MLB_Result", "2019 디그롬이 류현진을 이겼습니다.")
//            eraOfDegrom
//        }
//
//        Log.d("MLB_Result", "2019 MLB에서 가장 높은 ERA는 ${era}입니다.")
        // p.126
//        val ageOfMichael = 20
//        when (ageOfMichael) {
//            in 10..19 -> {
//                Log.d("when", "마이클은 10대입니다.")
//            }
//            !in 10..19 -> {
//                Log.d("when", "마이클은 10대가 아닙니다.")
//            }
//            else -> {
//                Log.d("when", "마이클의 나이를 알 수 없습니다.")
//            }
//        }
        // p.134~135
        // 1. 기본 타입 배열 선언
        var students = IntArray(10)
        var longArray = LongArray(10)
        var CharArray = CharArray(10)
        var FloatArray = FloatArray(10)
        var DoubleArray = DoubleArray(10)
        // arrayOf 함수를 사용하면 선언과 동시에 값을 입력할 수 있음
        var intArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        // intArray 변수에는 1부터 10까지의 값이 각각의 배열의 공간에 저장되어 있습니다.

        // 2. 문자열 타입 배열 선언하기
        var stringArray = Array(10, {item -> ""})
        // arrayOf 함수로 값을 직접 입력해서 배열을 생성할 수 있음
        var dayArray = arrayOf("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN")

        // 3. 앞에서 선언한 students 변수에 값 넣기
        // 가. 대괄호를 사용하는 방법
        students[0] = 90
        students[1] = 91
        students[2] = 92
        students[3] = 93
        students[4] = 94
        // 나. set 함수를 사용하는 방법
        students.set(5, 95)
        students.set(6, 96)
        students.set(7, 97)
        students.set(8, 98)
        students.set(9, 99)

        // 4. 값 변경해보기
        intArray[6] = 137   // 6번 인덱스인 일곱번째 값 7이 137로 변경됨
        intArray.set(9, 200) // 9번 인덱스인 열 번째 값 99가 200으로 변경됨

        // 5. 배열 값 사용하기
        var seventhValue = intArray[6]
        Log.d("Array", "여섯 번째 intArray의 값은 ${seventhValue}입니다.")
        var tenthValue = intArray.get(9)
        Log.d("Array", "열 번째 intArray의 값은 ${tenthValue}입니다.")

        // 6. 변수에 담지 않고 직접 사용해도 된다.
        Log.d("Array", "첫 번째 dayArray의 값은 ${dayArray[0]}입니다.")
        Log.d("Array", "여섯 번째 dayArray의 값은 ${dayArray.get(5)}입니다.")
    }


}