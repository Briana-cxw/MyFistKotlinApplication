package com.briana.myfistkotlinapplication

/**
 * Create by Briana-cxw
 * 2020/12/28 10:51
 */
fun main(){
    val student = Student("Briana",21)
    doStudy(student)
}

fun doStudy(study: Study) {
    study.ReadBooks()
    study.doHomework()
}
